package edu.studenorder.validator;

import edu.studenorder.domain.AnswerCheckWedding;
import edu.studenorder.domain.StudentOrder;

public class CheckWeddingValidator {

     AnswerCheckWedding checkWedding(StudentOrder studentOrder) {
         System.out.println("checkWedding");
         return new AnswerCheckWedding();
     }
}
