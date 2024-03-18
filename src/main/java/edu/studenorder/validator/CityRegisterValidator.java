package edu.studenorder.validator;

import edu.studenorder.domain.Person;
import edu.studenorder.domain.register.AnswerCityRegister;
import edu.studenorder.domain.register.AnswerCityRegisterItem;
import edu.studenorder.domain.register.CityRegisterResponse;
import edu.studenorder.domain.Child;
import edu.studenorder.domain.StudentOrder;
import edu.studenorder.exception.CityRegisterException;
import edu.studenorder.exception.TransportException;

public class CityRegisterValidator {
    static final String IN_CODE = "NO_GRN";
    String hostName;
    String login;
    int port;

    CityRegisterChecker cityRegisterChecker;

    public CityRegisterValidator() {
        cityRegisterChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
         System.out.println("checkCityRegister running" + hostName);
         AnswerCityRegister answerCityRegister = new AnswerCityRegister();
         answerCityRegister.add(checkPerson(studentOrder.getHusband()));
         answerCityRegister.add(checkPerson(studentOrder.getWife()));
         for (Child child:studentOrder.getChildren()) {
             answerCityRegister.add(checkPerson(child));
         }
         return answerCityRegister;
     }
     private AnswerCityRegisterItem checkPerson(Person person) {
        AnswerCityRegisterItem.CheckCityRegisterError error = null;
        AnswerCityRegisterItem.CheckCityRegisterStatus status = null;
         try {
             CityRegisterResponse checkPersonResponse = cityRegisterChecker.checkPerson(person);
             status = checkPersonResponse.isExisting()
                     ? AnswerCityRegisterItem.CheckCityRegisterStatus.YES
                     : AnswerCityRegisterItem.CheckCityRegisterStatus.NO;
         } catch (CityRegisterException e) {
             e.printStackTrace(System.out);
             error = new AnswerCityRegisterItem.CheckCityRegisterError(e.getCode(), e.getMessage());
             status = AnswerCityRegisterItem.CheckCityRegisterStatus.ERROR;

         } catch (TransportException e) {
             e.printStackTrace(System.out);
             error = new AnswerCityRegisterItem.CheckCityRegisterError(IN_CODE, e.getMessage());
             status = AnswerCityRegisterItem.CheckCityRegisterStatus.ERROR;
         }
         return new AnswerCityRegisterItem(person, error, status);
     }
}
