package app.entities;

import app.enumerations.QuestionDifficulty;
import app.enumerations.QuestionType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Question {
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

    @ManyToOne(fetch = FetchType.EAGER)
    private Examine examine;
}
