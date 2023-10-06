public class SingleChoiceStudent extends Student{
    String answer;

    public SingleChoiceStudent(String qT,String ans) {
        super(qT);
        answer = ans;
    }

    //return Answer student chose
    public String getAnswer() {
        return answer;
    }
}
