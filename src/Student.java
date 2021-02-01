public class Student {
    //instance variables
    private String firstName;
    private String lastName;
    private int studentNumber;

    //This constructor takes 3 arguments
    public Student(String firstName, String lastName, int studentNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    //setters and getters
    public void setFirstName(){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setStudentNumber(){
        this.studentNumber = studentNumber;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
}
