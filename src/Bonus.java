import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age = sc.nextInt();

        if (age < 18) {
            System.out.println("Minor");
        } else if (age > 18 && age < 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
