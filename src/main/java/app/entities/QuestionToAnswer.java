package app.entities;

import app.embedd.QuestionAnswerKey;

import javax.persistence.*;

@Entity
@Table
public class QuestionToAnswer {

@EmbeddedId
    QuestionAnswerKey id;

    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "question_id")
    Question question;

    @ManyToOne
    @MapsId("answerId")
    @JoinColumn(name = "answer_id")
    Answer answer;

    @Column
    Boolean is_True;

    public QuestionToAnswer(QuestionAnswerKey id, Question question, Answer answer, Boolean is_True) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.is_True = is_True;
    }

    public QuestionAnswerKey getId() {
        return id;
    }

    public void setId(QuestionAnswerKey id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Boolean getIs_True() {
        return is_True;
    }

    public void setIs_True(Boolean is_True) {
        this.is_True = is_True;
    }

}
