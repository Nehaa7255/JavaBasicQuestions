package Basic;
import java.util.Scanner;

public class thirty_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse no : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

    }
}