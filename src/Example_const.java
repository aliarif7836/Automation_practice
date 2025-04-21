public class Example_const {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arif",01,5000000);
        e1.displayInfo();

        Employee e2 = new Employee("Ayush",02,4000000);
        e2.displayInfo();

    }
}

class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("---------------------------");
    }

}