// Print the sum of all even & odd numbers in a range seperately.

package Basic;
import java.util.*;
import java.util.Scanner;
public class thity_five {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n, sumE=0, sumO=0;
        System.out.println("Enter the  number in array");
        n= sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
for(int i=0;i<n;i++){
    if(a[i]%2==0){
        sumE=sumE +a[i];

    }
    else{
        sumO= sumO +a[i];
    }
    System.out.println("Sum of Even Numbers:"+sumE);
    System.out.println("Sum of Odd Numbers:"+sumO);
}

    }
}
