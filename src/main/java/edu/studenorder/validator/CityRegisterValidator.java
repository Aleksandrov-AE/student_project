package edu.studenorder.validator;

import edu.studenorder.domain.Person;
import edu.studenorder.domain.register.AnswerCityRegister;
import edu.studenorder.domain.register.AnswerCityRegisterItem;
import edu.studenorder.domain.register.CityRegisterResponse;
import edu.studenorder.domain.Child;
import edu.studenorder.domain.StudentOrder;

public class CityRegisterValidator {
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
         try {
             CityRegisterResponse checkPersonResponse = cityRegisterChecker.checkPerson(person);
         } catch (CityRegisterException e) {
             e.printStackTrace();
         }
         return  null;
     }
}
