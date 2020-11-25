package app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Examine {
    public Examine(String name, List<ExamineToQuestion> examineToQuestions) {
        this.name = name;
        this.examineToQuestions = examineToQuestions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExamineToQuestion> getQuestions() {
        return examineToQuestions;
    }

    public void setQuestions(List<ExamineToQuestion> examineToQuestions) {
        this.examineToQuestions = examineToQuestions;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examine")
    @SequenceGenerator(name="examine", sequenceName = "seq_examine")
    private Long id;

    @Column
    private String name;

    @OneToMany (mappedBy = "examine")
    List<ExamineToQuestion> examineToQuestions;

}
