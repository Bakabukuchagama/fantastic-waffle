package app.embedd;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;

@Embeddable
@Table
public class ExamineQuestionKey implements Serializable {
    @Column(name = "examine_id")
    Long examineId;

    @Column(name = "question_id")
    Long questionId;

    public ExamineQuestionKey(Long examineId, Long questionId) {
        this.examineId = examineId;
        this.questionId = questionId;
    }


    public Long getExamineId() {
        return examineId;
    }

    public void setExamineId(Long examineId) {
        this.examineId = examineId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}
