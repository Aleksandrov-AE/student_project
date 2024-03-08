package edu.studenorder.validator;

import edu.studenorder.domain.*;

public class StudentOrderValidator {

    CityRegisterValidator cityRegisterValidator;
    CheckChildrenValidator checkChildrenValidator;
    CheckWeddingValidator checkWeddingValidator;
    CheckStudentValidator checkStudentValidator;

    public StudentOrderValidator() {
        this.cityRegisterValidator = new CityRegisterValidator();
        this.checkChildrenValidator = new CheckChildrenValidator();
        this.checkWeddingValidator = new CheckWeddingValidator();
        this.checkStudentValidator = new CheckStudentValidator();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOrder = new StudentOrderValidator();
        studentOrder.checkAll();
    }
    public void checkAll() {
        StudentOrder[] studentOrders = readStudentOrder();
        for (int i = 0; i < studentOrders.length; i++) {
            checkOneStudentOrder(studentOrders[i]);
        }
    }

    private void checkOneStudentOrder(StudentOrder studentOrder) {
        AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
        AnswerCheckWedding answerCheckWedding = checkWedding(studentOrder);
        AnswerCheckChildren answerCheckChildren = checkChildren(studentOrder);
        AnswerCheckStudent answerCheckStudent = checkStudent(studentOrder);
        sendEmail(studentOrder);
    }



    private static void sendEmail(StudentOrder studentOrder) {
        System.out.println("SendEmail");
    }

    public StudentOrder[] readStudentOrder() {
        StudentOrder[] studentOrders = new StudentOrder[3];
        for (int i = 0; i < 3; i++) {
            studentOrders[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        return studentOrders;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        cityRegisterValidator.hostName = "Host1";
        return cityRegisterValidator.checkCityRegister(studentOrder);
    }
    public AnswerCheckWedding checkWedding(StudentOrder studentOrder) {
       return  new CheckWeddingValidator().checkWedding(studentOrder);
    }

    public AnswerCheckChildren checkChildren(StudentOrder studentOrder) {
        return new CheckChildrenValidator().checkChildren(studentOrder);
    }

    public AnswerCheckStudent checkStudent(StudentOrder studentOrder) {
        return new CheckStudentValidator().checkStudent(studentOrder);
    }
}
