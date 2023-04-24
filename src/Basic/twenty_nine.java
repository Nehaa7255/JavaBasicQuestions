//Accept an integer and Print hello world n times

package Basic;
import java.util.*;
import java.util.Scanner;
public class twenty_nine {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println( "Hello! World");
        }
    }
}
