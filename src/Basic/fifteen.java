/*
Accept name and age from the user. Check if the user is a valid voter or not.
      Vaid - Hello Shery, You are a valid voter.
      Invalid - Sorry Shery, you can't cast the vote.
	Part 2 - Print after how many years the user will be eligible
 */

package Basic;
import java.util.Scanner;
public class fifteen {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name : ");;
        String name=sc.nextLine();
        System.out.print("Enter the age : ");
        int age=sc.nextInt();
        if(age >=18){
            System.out.println("Valid - Hello"+" "+name+","+" "+"you are a valid voter.");
        }
        else
        {
            System.out.println("Invalid - Sorry"+" "+name+","+" "+"you can't cast the vote.");
        }
        System.out.println("After 18 years the users will be eligible.");
    }
}
