package edu.studenorder.domain.register;

import edu.studenorder.domain.Person;

public class AnswerCityRegisterItem {

    public enum CheckCityRegisterStatus {
        YES, NO, ERROR
    }

    public static class CheckCityRegisterError {
        private String code;
        private String text;

        public CheckCityRegisterError(String code, String text) {
            this.code = code;
            this.text = text;
        }

        public String getCode() {
            return code;
        }

        public String getText() {
            return text;
        }
    }

    private Person person;
    private CheckCityRegisterError checkCityRegisterError;

    private CheckCityRegisterStatus checkCityRegisterStatus;

    public AnswerCityRegisterItem(Person person, CheckCityRegisterError checkCityRegisterError, CheckCityRegisterStatus checkCityRegisterStatus) {
        this.person = person;
        this.checkCityRegisterError = checkCityRegisterError;
        this.checkCityRegisterStatus = checkCityRegisterStatus;
    }
}
