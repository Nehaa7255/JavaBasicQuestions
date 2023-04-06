package Basic;

public class Natural_number {
    public static void main(String[]args){
        int  n=20;
        int sum=0;
        for(int i=1;i<=n;i++) {
            System.out.println(i + " ");
            sum += i;
        }
        System.out.println("sum of natural number is:"+sum);
    }

}
