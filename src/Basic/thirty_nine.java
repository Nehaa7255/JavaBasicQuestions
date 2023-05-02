/* Accept a number and check if it  is a perfect number or not.
     A number whose sum of factors(excluding number itself)  = Number
     Ex -  6 = 1, 2, 3 = 6
 */

package Basic;
import java.util.*;
import java.util.Scanner;

public class thirty_nine {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        int allfactorsum=0;
        for(int i=1;i<=(n/2);i++){
            if(n%i==0) {
                allfactorsum +=i;
                System.out.println(i);

            }
        }
        System.out.println("sum of all factor is : "+allfactorsum);
        if(allfactorsum == n){
        System.out.println("Given number is a perfect number");
    }
    else{
        System.out.println("Given number is not a perfect number");
    }
}
}



