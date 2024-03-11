package edu.studenorder.validator;

import edu.studenorder.domain.*;
import edu.studenorder.domain.register.AnswerCityRegister;

import java.util.LinkedList;
import java.util.List;

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
        List<StudentOrder> studentOrders = readStudentOrder();
        for (StudentOrder studentOrder: studentOrders) {
            checkOneStudentOrder(studentOrder);
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

    public List<StudentOrder> readStudentOrder() {
        List<StudentOrder> studentOrders = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            studentOrders.add(SaveStudentOrder.buildStudentOrder(i));
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
