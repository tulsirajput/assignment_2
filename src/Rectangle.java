import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void display(){
        System.out.println("Area is = " + length*breadth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle obj = new Rectangle(sc.nextInt(),sc.nextInt());
        Rectangle obj2 = new Rectangle(sc.nextInt(), sc.nextInt());
        obj.display();
        obj2.display();
    }
}