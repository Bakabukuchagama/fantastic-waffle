package app.entities;
import javax.persistence.*;

@Entity
@Table
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "result")
    @SequenceGenerator(name="result", sequenceName = "seq_result")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column
    private String result;
}
