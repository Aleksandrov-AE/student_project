package edu.studenorder.validator;

import edu.studenorder.domain.AnswerCheckStudent;
import edu.studenorder.domain.StudentOrder;

public class AnswerCheckStudentValidator {
    AnswerCheckStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("checkStudent");
        return new AnswerCheckStudent();
    }
}
