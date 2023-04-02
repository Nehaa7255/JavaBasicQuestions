package Basic;

import java.util.Scanner;

public class armstrong {
    public static void main(String[]args){
        int num, digit, cubesum=0, originalnum;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        originalnum=num;
        while(num!=0){
            digit=num%10;
            cubesum+=Math.pow(digit,3);
            num/=10;
        }
        if(cubesum==originalnum){
            System.out.println("armstrong numbers");
        }
        else{
            System.out.println("not");
        }
    }
}



