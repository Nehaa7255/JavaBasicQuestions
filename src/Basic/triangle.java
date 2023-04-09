package Basic;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class triangle {
    public static void main(String args[])
    {
        Scanner sc  =  new Scanner(System.in);
        int a,b,c;
        double s, area;
        System.out.println("Enter the value of a triangle");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c);
        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("the area of triangle : :"+area);
    }
}

