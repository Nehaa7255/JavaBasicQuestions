/* Take a number as input and print its table
      5 * 1 = 5
      5 * 2 = 10 ... up to 10 terms
 */

package Basic;
import java.util.*;
import java.util.Scanner;

public class thirty_two {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(num+"*"+i+" "+"="+" "+num*i);
        }
    }
}
