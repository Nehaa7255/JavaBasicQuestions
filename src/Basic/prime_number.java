package Basic;
import java.util.*;
import java.lang.*;
import java.util.Scanner.*;
public class prime_number {
    public static void main(String[]args){
        int n,i,j;
        Scanner sc= new Scanner(System.in);
        for(i=2;i<=20;i++){
            n=0;for(j=2;j<i;j++){
                if(i%j==0){
                    n++;
                    break;
                }
            }
            if(n==0){
                System.out.println(i);
            }
        }
    }
}


