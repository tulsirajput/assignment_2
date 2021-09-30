import java.util.Scanner;

public class Employee {
    String name;
    String address;
    int year;

    public Employee(String name, String address, int year) {
        this.name = name;
        this.address = address;
        this.year = year;
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee("Aman", "Chandigarh",2021);
        Employee obj2 = new Employee("Sunil", "Mathura", 2000);
        Employee obj3 = new Employee("Rohan","Agra",2010);
        System.out.println(obj1.name + " " + obj1.year+ " " + obj1.address);
        System.out.println(obj2.name + " " + obj2.year+ " " + obj2.address);
        System.out.println(obj3.name + " " + obj3.year+ " " + obj3.address);
    }
}