import java.io.*;
import java.util.*;

public class Fencing_the_ground{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bre=sc.nextInt();
        System.out.println("The required length is "+2*(len+bre)+ " m");
        System.out.println("The required area of carpet is "+len*bre+ " sqm");
    }
}