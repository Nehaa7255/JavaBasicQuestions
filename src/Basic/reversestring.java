import java.lang.*;
import java.util.*;
public class reversestring {
    public static void main(String[]args){
        String str="Nishu", nstr=" ";
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("original wors : "+str);
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("reversed number : "+nstr);
    }
}