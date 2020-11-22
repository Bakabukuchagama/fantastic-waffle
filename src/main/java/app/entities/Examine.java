package app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Examine {
    public Examine(String name, List<Question> questions) {
        this.name = name;
        this.questions = questions;
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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examine")
    @SequenceGenerator(name="examine", sequenceName = "seq_examine")
    private Long id;

    @OneToMany (mappedBy = "examine", cascade = CascadeType.ALL)
    private String name;

    @OneToMany (mappedBy = "examine", cascade = CascadeType.ALL)
    List<Question> questions;

}
