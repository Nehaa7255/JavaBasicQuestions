package Basic;
import java.util.Scanner;

public class Eleven {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int first_number =sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int second_number=sc.nextInt();
        if(first_number > second_number) {
            System.out.print("greatest number is : " + first_number);
        }
            else{
                System.out.println("greatest number is : "+second_number);
            }
        }
    }

