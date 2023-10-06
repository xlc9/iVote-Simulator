import java.util.ArrayList;
import java.util.List;

public class Question {
    private String questionType;
    private List<String> candidateAnswers;

    public Question(String qType) {
        questionType = qType;
        candidateAnswers = new ArrayList<>();
    }


    //place answer choices into candidateAnswers list
    public void configureQuestion(List<String> answers) {
        candidateAnswers.addAll(answers);
    }

    public String getQuestionType() {
        return questionType;
    }

    public List<String> getCandidateAnswers() {
        return candidateAnswers;
    }
}
