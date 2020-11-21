package app.entities;

import javax.persistence.*;


@Entity
@Table
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "answer")
    @SequenceGenerator(name="answer", sequenceName = "seq_answer")
    private Long id;

    @Column
    private String answer;

    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;
}
