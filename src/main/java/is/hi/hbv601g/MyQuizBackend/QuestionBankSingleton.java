package is.hi.hbv601g.MyQuizBackend;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankSingleton {

    private static QuestionBankSingleton instance;
    private List<Question> questionBank;

    public static QuestionBankSingleton getInstance(){
        if(instance == null) {
            instance = new QuestionBankSingleton();
            instance.questionBank = new ArrayList<>();

            // String array containing 10 questions.
            String[] questions = {
                    "The UK is about the same size as France.",
                    "The UK is made up of more than 6000 islands.",
                    "Mexico is south of the equator.",
                    "China has only one time zone.",
                    "The island of Borneo is occupied by three countries",
                    "It's possible to travel on roads from the United States to South America",
                    "The Indian Ocean is the third largest ocean in the world",
                    "The Maldives has the lowest high point of any country",
                    "Russia borders both North Korea and Norway",
                    "The world's tallest waterfall is in Venezuela"
            };

            // Boolean array containing answer for 10 questions.
            boolean[] answers = {
                    false,
                    true,
                    false,
                    true,
                    true,
                    false,
                    true,
                    true,
                    true,
                    true
            };

            for(int i = 0; i < 10; i++){
                int id = i+1;
                String questionText = questions[i];
                boolean answerTrue = answers[i];
                Question question = new Question(id, questionText, answerTrue);
                instance.questionBank.add(question);
            }
        }
        return instance;
    }

    private QuestionBankSingleton() {
    }

    public List<Question> getQuestionBank() {
        return questionBank;
    }

    public void addQuestion(Question question) {
        questionBank.add(question);
    }
}
