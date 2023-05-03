//Sum of digits of a number, 936 = 18
package Basic;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class forty_one {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int digitSum=0;
        System.out.print("Enter a digit: ");
        int num=sc.nextInt();
       while(num>0){
           int digit=num%10;
           digitSum += digit;
           num = num/10;
       }
        System.out.print("Sum of digit is: "+ digitSum);
    }
}
