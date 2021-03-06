package app.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table
public class Answer {


    public Answer(Long id, String answer, Boolean isRight, Question question) {
        this.id = id;
        this.answer = answer;
        this.isRight = isRight;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "answer")
    @SequenceGenerator(name="answer", sequenceName = "seq_answer")
    private Long id;

    @Column
    private String answer;

    @Column
    private Boolean isRight;

    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;

    public Boolean getRight() {
        return isRight;
    }

    public void setRight(Boolean right) {
        isRight = right;
    }

//    @OneToMany (mappedBy = "answer")
//    Set<QuestionToAnswer> questionToAnswer;
}
