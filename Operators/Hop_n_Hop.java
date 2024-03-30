import java.io.*;
import java.util.*;

public class Hop_n_Hop{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int x1=3;
        int y1=4;
        System.out.println(Math.max((x-x1),(y-y1)));
    }
}