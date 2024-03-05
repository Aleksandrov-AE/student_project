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
            AnswerCheckWedding answerCheckWedding = checkWedding();
            AnswerCheckChildren answerCheckChildren = checkChildren();
            AnswerCheckStudent answerCheckStudent = checkStudent();
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
    static AnswerCheckWedding checkWedding() {
        System.out.println("checkWedding");
        return new AnswerCheckWedding();
    }

    static AnswerCheckChildren checkChildren() {
        System.out.println("checkChildren");
        return new AnswerCheckChildren();
    }

    static AnswerCheckStudent checkStudent() {
        System.out.println("checkStudent");
        return new AnswerCheckStudent();
    }
}
