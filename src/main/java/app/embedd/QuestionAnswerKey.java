package app.embedd;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;

@Embeddable
@Table
public class QuestionAnswerKey implements Serializable {
    @Column(name = "question_id")
    Long questionId;

    @Column(name = "answer_id")
    Long answerId;
}
