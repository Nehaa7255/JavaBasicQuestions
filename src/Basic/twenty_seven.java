// Accept an english alphabet from user and check if it is a consonant or a vowel;

package Basic;
import java.util.*;
import java.util.Scanner;
public class twenty_seven {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.print("Enter the english alphabet : ");
      char  ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
            System.out.println(ch+" "+"is an  Vowel number");
        }
        else {
            System.out.println("consonant number");
        }
    }
}
