package is.hi.hbv601g.MyQuizBackend;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class QuestionRestController {

    @GetMapping("/questions")
    public List<Question> getQuestions() throws InterruptedException {
        QuestionBankSingleton questionBank = QuestionBankSingleton.getInstance();
        //TimeUnit.SECONDS.sleep(3);
        return questionBank.getQuestionBank();
    }

    @RequestMapping("/questions/{Id}")
    public Question getAttr(@PathVariable(value="Id") int id) {
        QuestionBankSingleton questionBank = QuestionBankSingleton.getInstance();
        return questionBank.getQuestionBank().get(id-1);
    }
}
