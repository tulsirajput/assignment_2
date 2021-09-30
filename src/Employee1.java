import java.util.Scanner;

public class Employee1 {
    int hours;
    int sal;
    int getinfo(int hours, int sal){
        this.hours = hours;
        this.sal = sal;

        return (hours*sal);
    }
    int AddSal(int a){
        if(a<500) {
            a=a+10;
        }
        return a;
    }
    int AddWork(int w,int a){
        if(w>6)
            a=a+5;
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee1 obj = new Employee1();

        int a;
        a = obj.getinfo(s.nextInt(),s.nextInt());
        int b = obj.AddSal(a);
        b = obj.AddWork(obj.hours,a);
        System.out.println(b);
    }

}