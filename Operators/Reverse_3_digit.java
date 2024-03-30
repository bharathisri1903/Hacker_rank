import java.io.*;
import java.util.*;

public class Reverse_3_digit{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>99 && n<999)
        {
            int n1=n%10;
            int n2=(n/10)%10;
            int n3=(n/100)%10;
            int num=(n1*100)+(n2*10)+(n3*1);
            System.out.println(num);
        }
    }
}