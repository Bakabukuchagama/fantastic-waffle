package app.entities;

import app.embedd.ExamineQuestionKey;

import javax.persistence.*;


@Table
public class ExamineToQuestion {

@EmbeddedId
ExamineQuestionKey id;

    @ManyToOne
    @MapsId("examineId")
    @JoinColumn(name = "examine_id")
    Examine examine;

    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "question_id")
    Question question;

    public ExamineToQuestion(ExamineQuestionKey id, Examine examine, Question question) {
        this.id = id;
        this.examine = examine;
        this.question = question;
    }

    public ExamineQuestionKey getId() {
        return id;
    }

    public void setId(ExamineQuestionKey id) {
        this.id = id;
    }

    public Examine getExamine() {
        return examine;
    }

    public void setExamine(Examine examine) {
        this.examine = examine;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
