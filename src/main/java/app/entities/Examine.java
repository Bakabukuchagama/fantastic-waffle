package app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Examine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examine")
    @SequenceGenerator(name="examine", sequenceName = "seq_examine")
    private Long id;

    @Column
    private String name;

    @OneToMany (mappedBy = "examine", cascade = CascadeType.ALL)
    List<Question> questions;
}
