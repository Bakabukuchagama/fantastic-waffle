package app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user")
    @SequenceGenerator(name="user", sequenceName = "seq_user")
    private Long id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Result> results;
}
