//Seperate each digit of a number and print it on the new line
package Basic;
import java.util.Scanner;

public class fourty {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=150;
        while(num>0){
             num=num/10;
           int  rem = num %10;
            System.out.println(rem);
        }
    }
}
