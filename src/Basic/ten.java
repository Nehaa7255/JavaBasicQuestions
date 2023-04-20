/*
Take 3 int inputs from user and check and print the result.
	all are equal
	any of two are equal
	( use && ||)
 */

package Basic;
import java.util.Scanner;

public class ten {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int first_number =sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int second_number=sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int third_number=sc.nextInt();
        if(first_number == second_number && second_number == third_number ){
            System.out.println("All numbers are equal");}
            else if(first_number==second_number || second_number==third_number || third_number==first_number){
                System.out.println("Any of two numbers are equal");
            }
            else{
                System.out.println("Numbers are not equal");
            }
    }
    }

