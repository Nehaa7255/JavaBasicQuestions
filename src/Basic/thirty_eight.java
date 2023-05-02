//Print the sum of all factors of a number, 50 - 1 + 2 + 5 + 10 + 25 = 43

package Basic;
import java.util.*;
import java.util.Scanner;

public class thirty_eight {
    public static void main(String []args){
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
    }
}
