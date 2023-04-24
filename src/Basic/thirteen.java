/* Extend the previous program and handle the wrong inputs.
    Print Good Morning sir for input m or M & Good morning Maam for input F or f
    else print Wrong Input
        */

package Basic;
import java.util.*;
import java.util.Scanner;

public class thirteen {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the gender in (M/F) : ");
        String gender =sc.nextLine();
        char genderChar= gender.charAt(0);
        if(genderChar == 'M'|| genderChar == 'm'){
            System.out.println("Good Morning sir");
        }
        else if(genderChar == 'F' || genderChar == 'f' ){
            System.out.println("Good Morning Mam");
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
