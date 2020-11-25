package app.dto;

import app.entities.Answer;
import app.entities.ExamineToQuestion;
import app.enumerations.QuestionDifficulty;
import app.enumerations.QuestionType;

import javax.persistence.*;
import java.util.List;

public class QuestionDto {

    private String question;

    private QuestionDifficulty difficulty;

    private QuestionType type;

    public QuestionDto(String question, QuestionDifficulty difficulty, QuestionType type) {
        this.question = question;
        this.difficulty = difficulty;
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QuestionDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(QuestionDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    //   private List<Answer> answer;

}
