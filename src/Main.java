class car {
    String brand;
    int year;
    double price;

    public void displayDetails() {
        System.out.println("Brand = " + brand);
        System.out.println("Year = " + year);
        System.out.println("Price = " + price);
    }

}

public class Main {
    public static void main(String[] args) {
        car c1 = new car();
        c1.brand = "Land Rover";
        c1.year = 2025;
        c1.price = 5000000.00;

        car c2 = new car();
        c2.brand = "Toyota";
        c2.year = 2020;
        c2.price = 25000.00;

        c1.displayDetails();
        c2.displayDetails();

    }
}