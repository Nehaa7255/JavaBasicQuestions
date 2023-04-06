import java.lang.*;
import java.util.*;
class Swap {
    public static void main(String[]args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :");
        a = sc.nextInt();
        System.out.println("enter the value the b :");
        b = sc.nextInt();
        System.out.println("Before swapping: "+ a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:" + a + " " + b);
    }
}