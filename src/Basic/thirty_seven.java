// Print all the factors of a number.
package Basic;
import java.util.Scanner;

public class thirty_seven {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the value of number : ");
        n=sc.nextInt();
for(int i=1;i<=n;i++){
    if(n%i==0){
        System.out.println(i+ " ");
    }
}


    }
}
