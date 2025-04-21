import java.util.Scanner;

public class Odd_even {

    public static void main(String[] args) {
        int number; // Replace with the number you want to check
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    }

