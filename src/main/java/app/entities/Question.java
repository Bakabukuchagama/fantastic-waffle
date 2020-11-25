package app.entities;

import app.embedd.ExamineQuestionKey;
import app.enumerations.QuestionDifficulty;
import app.enumerations.QuestionType;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Question {
    public Question(String question, String author, QuestionDifficulty difficulty, QuestionType type, List<Answer> answer, Examine examine) {
        this.question = question;
        this.author = author;
        this.difficulty = difficulty;
        this.type = type;
        this.answer = answer;
       // this.examine = examine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public List<ExamineToQuestion> getExamineToQuestion() {
        return examineToQuestion;
    }

    public void setExamineToQuestion(List<ExamineToQuestion> examineToQuestion) {
        this.examineToQuestion = examineToQuestion;
    }

   // public Examine getExamine() {
    //    return examine;
    //}

   // public void setExamine(Examine examine) {
    //    this.examine = examine;
    //}

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question")
    @SequenceGenerator(name="question", sequenceName = "seq_question")
    private Long id;

    @Column
    private String question;

    @Column
    private String author;

    @Enumerated(EnumType.STRING)
    private QuestionDifficulty difficulty;

    @Enumerated(EnumType.STRING)
    private QuestionType type;

    @OneToMany (mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answer;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    private List<ExamineToQuestion> examineToQuestion;


}
