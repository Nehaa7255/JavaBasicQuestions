import java.lang.*;
import java.util.*;
public class reverse_number {
    public static void main(String[]args){
        int n=34567;
        int reversed=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("original number : "+n);
        while(n!=0){
            int digit=n%10;
            reversed= reversed*10+digit;
            n/=10;
        }
        System.out.println("reversed number : "+reversed);
    }
}