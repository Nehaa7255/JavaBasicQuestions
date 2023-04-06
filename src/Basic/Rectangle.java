import java.lang.*;
import java.util.*;
public class Rectangle {
    public static void main(String[]args){
        int l,b;
        double area;
        double perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.printf("l = ");
        l=sc.nextInt();
        System.out.printf("b = ");
        b=sc.nextInt();
        area=(l*b);
        System.out.printf("Area of rectangle :");
        System.out.println(area);
        perimeter= 2*(l+b);
        System.out.printf("Perimeter of rectangle :");
        System.out.println(perimeter);


    }
}