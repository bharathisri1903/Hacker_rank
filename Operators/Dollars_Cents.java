import java.io.*;
import java.util.*;

public class Dollars_Cents{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int c1=sc.nextInt();
        int d2=sc.nextInt();
        int c2=sc.nextInt();
        int d=(d1+d2)+((c1+c2)/100);
        int c=((c1+c2)%100);
        System.out.println(d);
        System.out.println(c);
    }
}