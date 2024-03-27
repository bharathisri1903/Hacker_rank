import java.io.*;
import java.util.*;

public class Round_off{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.println((int)a);
        System.out.println(Math.round(Math.ceil(a)));
        System.out.println(Math.round(Math.floor(a)));
    }
}