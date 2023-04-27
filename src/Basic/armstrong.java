import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class armstrong {
    public static void main(String[]args){
        int n, cubesum = 0, digit, originalnum;
        System.out.print("enter the number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        originalnum=n;
        while(n!=0){
            digit= n%10;
            cubesum+= Math.pow(digit, 3);
            cubesum+= Math.pow(digit, 3);
            n/=10;
        }
        if(cubesum==originalnum){
            System.out.println(originalnum+" "+ "is armstrong number");
        }
        else{
            System.out.println(originalnum +" "+"is not a armstrong number");
        }

    }
}



