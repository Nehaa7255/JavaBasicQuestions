//Factorial of a number

package Basic;
import java.util.*;
import java.util.Scanner;

public class thirty_four {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num;
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;++i){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
