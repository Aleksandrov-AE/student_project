public class StudentOrderValidator {
    public static void main(String[] args) {

    }
    static void checkAll(){
        StudentOrder studentOrder = readStudentOrder();
        AnswerCityRegister answerCityRegister = checkCityRegister();
        AnswerCheckWedding answerCheckWedding = checkWedding();
        AnswerCheckChildren answerCheckChildren = checkChildren();
        AnswerCheckStudent answerCheckStudent = checkStudent();
        sendEmail(studentOrder);
    }

    private static void sendEmail(StudentOrder studentOrder) {
    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(){
        return new AnswerCityRegister();
    }
    static AnswerCheckWedding checkWedding(){
        return new AnswerCheckWedding();
    }

    static AnswerCheckChildren checkChildren(){
        return new AnswerCheckChildren();
    }

    static AnswerCheckStudent checkStudent(){
        return new AnswerCheckStudent();
    }
}
