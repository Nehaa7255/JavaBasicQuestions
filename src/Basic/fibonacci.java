import java.lang.*;
import java.util.*;
public class fibonacci {
    public static void main(String[]args) {
        int num1 = 0, num2 = 1, num3;
        int count = 10;
        Scanner sc = new Scanner(System.in);
        System.out.printf((num1+" "+num2));
        for(int i=2;i<count;++i){
            num3=num1+num2;
            System.out.printf(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
}