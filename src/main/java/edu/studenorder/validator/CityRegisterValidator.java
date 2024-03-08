package edu.studenorder.validator;

import edu.studenorder.domain.AnswerCityRegister;
import edu.studenorder.domain.StudentOrder;

public class CityRegisterValidator {
    String hostName;
    String login;
    int port;

    CityRegisterChecker realCityRegisterChecker;

    public CityRegisterValidator() {
        realCityRegisterChecker = new FakeCityRegisterChecker();
    }

    AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
         System.out.println("checkCityRegister running" + hostName);
         AnswerCityRegister answerCityRegister = new AnswerCityRegister();
         answerCityRegister.setSuccess(false);
         return answerCityRegister;
     }
}
