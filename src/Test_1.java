import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test_1 {


    public static void main(String[] args) {
        String name = "";
        int age ;
        float grade ;
        boolean student_type;

        Scanner sc = new Scanner(System.in);
        String createNewLine = System.getProperty("line.separator");

        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter age");
        age = sc.nextInt();

        System.out.println("Enter grade");
        grade = sc.nextFloat();

        System.out.println("Is student full time(Enter true or false)");
        student_type = sc.nextBoolean();

        System.out.println("Name : " +name + createNewLine + "Age : " +age + createNewLine + "Name : " +name + createNewLine + "Grade : " +grade + createNewLine + "Full-time : " +student_type);




    }
}
