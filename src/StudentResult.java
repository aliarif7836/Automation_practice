public class StudentResult {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arif";
        s1.marks = 100;
        s1.rollNumber = 2;

        s1.showResult();

        Student s2 = new Student();
        s2.name = "Vivek";
        s2.marks = 10;
        s2.rollNumber = 1;

        s2.showResult();

        Student s3 = new Student();
        s3.name = "Manoj";
        s3.marks = 36;
        s3.rollNumber = 3;
        s3.showResult();
    }
}

class Student {
    String name;
    int rollNumber;
    float marks;

    public void showResult() {
        System.out.println("Name " + name);
        System.out.println("Roll no " + rollNumber);
        System.out.println("Marks " + marks);
        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
