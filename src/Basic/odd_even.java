package Basic;
import java.util.*;
import java.lang.*;
import java.util.Scanner.*;

import java.util.Scanner;

public class odd_even {
    public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a number : ");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }
        else{
            System.out.printf("odd number");
        }

    }
}
