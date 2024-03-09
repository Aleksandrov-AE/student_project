package edu.studenorder.validator;

import edu.studenorder.domain.AnswerCityRegister;
import edu.studenorder.domain.StudentOrder;

public class CityRegisterValidator {
    String hostName;
    String login;
    int port;

    CityRegisterChecker cityRegisterChecker;

    public CityRegisterValidator() {
        cityRegisterChecker = new FakeCityRegisterChecker();
    }

    AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
         System.out.println("checkCityRegister running" + hostName);
         try {
             cityRegisterChecker.checkPerson(studentOrder.getHusband());
         } catch (CityRegisterException e) {
             e.printStackTrace();
         }

         AnswerCityRegister answerCityRegister = new AnswerCityRegister();
         return answerCityRegister;
     }
}
