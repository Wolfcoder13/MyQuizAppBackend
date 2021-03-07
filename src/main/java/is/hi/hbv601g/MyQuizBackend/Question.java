package is.hi.hbv601g.MyQuizBackend;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {

    @Id
    private int id;
    private String questionText;
    private boolean answerTrue;

    public Question(int id, String questionText, boolean answerTrue) {
        this.id = id;
        this.questionText = questionText;
        this.answerTrue = answerTrue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        this.answerTrue = answerTrue;
    }
}
