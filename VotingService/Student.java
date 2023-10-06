import java.util.UUID;
 

//create parent student class and have subclasses implement their own getAnswer functions
public abstract class Student{
    private String id;
    private String questionType;

    public Student(String qT) {
        id =UUID.randomUUID().toString();
        questionType = qT;
    }

    public String getStudentID() {
        return id;
    }

}
