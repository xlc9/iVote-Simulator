import java.util.HashMap;
import java.util.Map;

public class VotingService {
    private Question question;
    private Map<String, Integer> submissions;

    public VotingService() {
        submissions = new HashMap<>();
    }

    public void setQuestion(Question q) {
        question = q;
    }

    //places the single answer from a student into the hashmap
    public void submitSingleAnswer(SingleChoiceStudent student) {
        if (question != null && student != null) {
            submissions.put(student.getAnswer(),submissions.getOrDefault(student.getAnswer(), 0)+1);
        }
    }


    //takes the list of answers and places each selection into the hashmap
    public void submitMultipleAnswer(MultipleChoiceStudent student) {
        if (question != null && student != null) {
            for(int i = 0; i < student.getAnswer().size();i++){
                submissions.put(student.getAnswer().get(i),submissions.getOrDefault(student.getAnswer().get(i), 0)+1);
            }
            
        }
    }


    public void outputStatistics() {
        int sum = 0;
        for(String answer : submissions.keySet()) {
            int count = submissions.get(answer);
            sum+=count;
            System.out.println(answer + " : " + count);
        }
        System.out.println("Number of submissions in total: "+sum);

    }
}
