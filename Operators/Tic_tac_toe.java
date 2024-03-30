import java.io.*;
import java.util.*;

public class Tic_tac_toe{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1 && n<=9)
        {
            n=n-1;
            int row=n/3;
            int cl=n%3;
            System.out.println(row+ " " +cl);
        }
    }
}