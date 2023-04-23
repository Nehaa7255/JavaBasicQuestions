// Print all the numbers which are either divisible by 3 or 5 in a rangepackage Basic;
package Basic;
import java.util.Scanner;
 public class thirty_six {
        public static void main(String []args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number :- ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
}
