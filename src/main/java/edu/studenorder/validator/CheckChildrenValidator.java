package edu.studenorder.validator;

import edu.studenorder.domain.AnswerCheckChildren;
import edu.studenorder.domain.StudentOrder;

public class CheckChildrenValidator {
    AnswerCheckChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("checkChildren");
        return new AnswerCheckChildren();
    }
}
