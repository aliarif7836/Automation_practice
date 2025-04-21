import java.util.Scanner;

public class GradeCard {

    public static void main(String[] args) {
        int marks; // Replace with the number you want to check
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student marks");
        marks = sc.nextInt();
        
        if (marks>=90){
            System.out.println("A");
        } else if (marks < 89 && marks > 80) {
            System.out.println("B");
        }
        else if (marks < 79 && marks > 70) {
            System.out.println("C");
        }else if (marks < 70) {
            System.out.println("Fail");
        }
    }
}
