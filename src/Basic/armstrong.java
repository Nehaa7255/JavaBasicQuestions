import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class armstrong {
    public static void main(String[]args){
        int num, cubesum = 0, digit, originalnum;
        System.out.printf("enter the number : ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        originalnum=num;
        while(num!=0){
            digit= num%10;
            cubesum+= Math.pow(digit, 3);
            num/=10;
        }
        if(cubesum==originalnum){
            System.out.println(originalnum+" "+ "is armstrong number");
        }
        else{
            System.out.println(originalnum +" "+"is not a armstrong number");
        }

    }
}



