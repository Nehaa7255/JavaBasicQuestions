//Sum up to n terms.

package Basic;
import java.util.Scanner;
public class thirty_three {
    public static void main(String []agrs){
        Scanner sc= new Scanner(System.in);
        int sum=0,n;
        System.out.print("n= ");
         n= sc.nextInt();
        for(int i=1;i<=n;i++){
            sum= sum+i;
            System.out.println(sum+i);

        }
    }
}