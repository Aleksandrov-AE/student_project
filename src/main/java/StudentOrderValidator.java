public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {
        while (true) {
            StudentOrder studentOrder = readStudentOrder();
            if (studentOrder == null) {
                break;
            }
            AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
            if (!answerCityRegister.success) {
                break;
            }
            AnswerCheckWedding answerCheckWedding = checkWedding(studentOrder);
            AnswerCheckChildren answerCheckChildren = checkChildren(studentOrder);
            AnswerCheckStudent answerCheckStudent = checkStudent(studentOrder);
            sendEmail(studentOrder);
        }

    }

    private static void sendEmail(StudentOrder studentOrder) {
        System.out.println("SendEmail");
    }

    static StudentOrder readStudentOrder() {
        System.out.println("readStudentOrder");
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        CityRegisterValidator cityRegisterValidator = new CityRegisterValidator();
        cityRegisterValidator.hostName = "HostName1";
        return cityRegisterValidator.checkCityRegister(studentOrder);
    }
    static AnswerCheckWedding checkWedding(StudentOrder studentOrder) {
       return  new AnswerCheckWeddingValidator().checkWedding(studentOrder);
    }

    static AnswerCheckChildren checkChildren(StudentOrder studentOrder) {
        return new AnswerCheckChildrenValidator().checkChildren(studentOrder);
    }

    static AnswerCheckStudent checkStudent(StudentOrder studentOrder) {
        return new AnswerCheckStudentValidator().checkStudent(studentOrder);
    }
}
