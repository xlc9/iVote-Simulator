import java.util.List;

public class MultipleChoiceStudent extends Student{
    private List<String> allAnswers;

    public MultipleChoiceStudent(String qT,List<String> answers){
        super(qT);
        allAnswers = answers;
    }


    // return the list of answers student chose
    public List<String> getAnswer(){
        return allAnswers;
    }

}
