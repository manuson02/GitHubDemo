import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class Student {
    //instance variables
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> interests;

    //This constructor takes 4 arguments
    public Student(String firstName, String lastName, int studentNumber,
                   ArrayList<String> interests)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.interests = interests;
    }

    //setters and getters
    public void setFirstName(){
        firstName = firstName.toUpperCase(Locale.ROOT);
        if(firstName.contains(firstName))
        this.firstName = firstName;
        else
            throw new IllegalArgumentException(firstName + "is not valid");
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(){
        lastName = lastName.toUpperCase(Locale.ROOT);
        if(lastName.contains(lastName))
        this.lastName = lastName;
        else
            throw new IllegalArgumentException(lastName + "is not valid");
    }
    public String getLastName(){
        return lastName;
    }
    public String setStudentNumber(){
    if(studentNumber >= 9)
        return "valid";
        this.studentNumber = studentNumber;
        return "NULL";
    }
    public int getStudentNumber(){

        return getStudentNumber() +9;
    }

    public void setInterests(ArrayList<String> interests){
        if(interests.contains(interests))
            this.interests = interests;
    }
    public static ArrayList<String> getAllInterests(){
        List<String> interests = new ArrayList<>();
        interests.add("sports");
        interests.add("gaming");
        interests.add("socializing");
        interests.add("cars");
        interests.add("music");
        return (ArrayList<String>) interests;
    }
}
