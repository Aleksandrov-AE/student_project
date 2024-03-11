package edu.studenorder.domain.register;

import java.util.ArrayList;
import java.util.List;

public class AnswerCityRegister {
    List<AnswerCityRegisterItem> answerCityRegisterItem = new ArrayList<>();


    public void add(AnswerCityRegisterItem answerItem) {
        if (answerCityRegisterItem == null) {
            answerCityRegisterItem = new ArrayList<>();
        }
        answerCityRegisterItem.add(answerItem);
    }

    public List<AnswerCityRegisterItem> getAnswerCityRegisterItem() {
        return answerCityRegisterItem;
    }
}
