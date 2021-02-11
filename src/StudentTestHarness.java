import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class StudentTestHarness {
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String firstName = new String("Middy");
    String lastName = new String("Esmail");
    int[] studentNumber = new int[000000000];
    ArrayList<String> interests = new ArrayList<>();
        interests.addAll(Arrays.asList("Sports", "Gaming", "Socializing"));

    System.out.println("Please enter your first name: "+firstName);
    System.out.println("Please enter your last name: "+lastName);
    System.out.println("Please enter your student number: "+studentNumber);
    System.out.println("Please enter your interests: "+interests);
    }
}
