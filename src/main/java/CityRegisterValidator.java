public class CityRegisterValidator {
    String hostName;
     AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
         System.out.println("checkCityRegister running" + hostName);
         AnswerCityRegister answerCityRegister = new AnswerCityRegister();
         answerCityRegister.success = false;
         return answerCityRegister;
     }
}
