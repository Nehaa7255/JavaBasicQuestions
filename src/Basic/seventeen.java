package Basic;
import java.util.Scanner;

public class seventeen {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of First side : ");
        int a=sc.nextInt();
        System.out.print("Enter the value of second side : ");
        int b =sc.nextInt();
        System.out.print("Enter the value of third side : ");
        int c =sc.nextInt();
        double area= (a+b+c)/2.0;
      double Area= Math.sqrt(area*(area-a)*(area-b)*(area-c));
        System.out.println("area of triangle is : "+Area);
    }
}
