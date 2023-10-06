import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class SimulatorDriver {
    public static void main(String[] args){
        // Create and configure a question
        Question question = new Question("multiple-choice");
        List<String> candidateAnswers = List.of("A", "B", "C", "D");
        question.configureQuestion(candidateAnswers);

        // Create a VotingService and set the question
        VotingService votingService = new VotingService();
        votingService.setQuestion(question);

        // Simulate multiple choice student submissions
        Random random = new Random();
        for (int i = 1; i <= 20; i++) {
            List<String> answers = new ArrayList<String>();
            for(int j = 0; j < random.nextInt(4)+1;j++){
                String randomAnswer = candidateAnswers.get(random.nextInt(candidateAnswers.size()));
                answers.add(randomAnswer);
            }
            
            MultipleChoiceStudent student = new MultipleChoiceStudent(question.getQuestionType(),answers);
            votingService.submitMultipleAnswer(student);
        }

        // Display submission statistics
        System.out.println("For a multiple choice question the results are...");
        votingService.outputStatistics();
        System.out.println("Number of students: "+20);




        Question question2 = new Question("single-choice");
        List<String> candidateAnswers2 = List.of("A", "B", "C", "D");
        question.configureQuestion(candidateAnswers2);

        // Create a VotingService and set the question
        VotingService votingService2 = new VotingService();
        votingService2.setQuestion(question);

        // Simulate single choice student submissions
        Random random2 = new Random();
        for (int i = 1; i <= 20; i++) {
            int randIndex = random2.nextInt(candidateAnswers2.size());
            String randomAnswer = candidateAnswers2.get(randIndex);
            //System.out.println(i+ " : "+randomAnswer);
            SingleChoiceStudent student2 = new SingleChoiceStudent(question2.getQuestionType(),randomAnswer);
            votingService2.submitSingleAnswer(student2);
        }

        // Display submission statistics
        System.out.println("\n\nFor a single choice question the results are...");
        votingService2.outputStatistics();
        System.out.println("Number of students: "+20);
    }
}
