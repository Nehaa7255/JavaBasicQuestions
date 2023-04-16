package Basic;
import java.util.Scanner;
public class twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter second number : ");
        int second = sc.nextInt();
        System.out.print("Enter third number : ");
        int third = sc.nextInt();
        {
            if (first > second && first > third) {
                System.out.print("greatest number is : " + first);
            }
else{
    System.out.println("greatest number is : "+third);
            }
        }
    }
}
