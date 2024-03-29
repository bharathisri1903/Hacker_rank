import java.io.*;
import java.util.*;

public class Debt_repay{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        float n=sc.nextFloat();
        float in=(p*n*r)/100;
        float amount=p+in;
        float dis=(in*2)/100;
        float tamount=amount-dis;
        System.out.printf("%.2f",in);
        System.out.printf("\n%.2f",amount);
        System.out.printf("\n%.2f",dis);
        System.out.printf("\n%.2f",tamount);
    }
}