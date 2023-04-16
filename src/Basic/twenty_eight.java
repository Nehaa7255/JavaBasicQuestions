package Basic;
import java.util.Scanner;

public class twenty_eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        System.out.print("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b= sc.nextInt();
        System.out.println("Before swapping : "+a+" "+b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swapping : "+ a +" "+ b);


    }
}

        */
        int a, b, c;
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        c = sc.nextInt();
        System.out.println("Before swapping : " + a + " " + b);
        a = b;
        b = c;
        c = a;
        System.out.println("After swapping : " + a + " " + b);
    }
}
