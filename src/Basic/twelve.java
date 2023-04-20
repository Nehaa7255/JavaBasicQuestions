/*
     Accept the gender from the user as char and print the respective greeting message
     Ex - Good Morning Sir (on the basis of gender)

 */

package Basic;
import java.util.Scanner;

public class twelve {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the gender in (M/F) : ");
        String gender =sc.nextLine();
        char genderChar= gender.charAt(0);
        if(genderChar == 'M'){
            System.out.println("Good Morning sir");
        }
        else if(genderChar == 'F'){
            System.out.println("Good Morning Mam");
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
