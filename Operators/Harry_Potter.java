import java.io.*;
import java.util.*;

public class Harry_Potter{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int a1=Math.abs(a);
        int b=(a1%10)+((a1/1000)%10);
        System.out.println(b);
    }
}