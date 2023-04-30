// Accept the value of a, b, c - The values in a quadratic equation and find its roots.

package Basic;

import java.util.Scanner;
public class eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstRoot=0;
        double secondRoot=0;
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();
        double determinant=(b*b-4.0*a*c);
      double sqrt=Math.sqrt(determinant);
      if(determinant > 0){
         firstRoot= (-b + sqrt)/(2*a);
         secondRoot= (-b - sqrt)/(2*a);
          System.out.println("Roots are : "+ firstRoot +" "+ "and"+" "+ +secondRoot );
      }
      else if(determinant==0){
          System.out.println("Root is : "+(-b+sqrt)/(2*a));
      }


    }
}