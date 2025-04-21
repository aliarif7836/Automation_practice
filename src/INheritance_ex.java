public class INheritance_ex {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Dr. Emily Clark";
        t1.age = 40;
        t1.subject = "Physics";

        // Call methods
        System.out.println("Calling showTeacherInfo():");
        t1.showTeacherInfo();

        System.out.println("\nCalling showInfo():");
        t1.showInfo();

    }
}
    class Person{
        String name;
        int age;

        public void showInfo(){
            System.out.println("Name"+name);
            System.out.println("Age "+age);
        }

    }
    class Teacher extends Person{
        String subject;
        public void showTeacherInfo(){
            showInfo();
            System.out.println("Subject " +subject);
        }
    }

