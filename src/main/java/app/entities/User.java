package app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {

    public User(String login, String password, String name, List<Result> results) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.results = results;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

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
