//Seperate each digit of a number and print it on the new line
package Basic;
import java.util.Scanner;

public class fourty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int digit;
        while (n >= 0) {
            digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }

    }
}