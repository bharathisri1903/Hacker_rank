import java.io.*;
import java.util.*;

public class Treasure_hunter{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int gold=sc.nextInt();
        int ben=sc.nextInt();
        int black=sc.nextInt();
        int bensh=(gold*ben)/100;
        int gold1=gold-bensh;
        int blacksh=(gold1*black)/100;
        int gold2=gold1-blacksh;
        int divide=gold2/3;
        System.out.println(bensh);
        System.out.println(blacksh);
        System.out.println(divide);
    }
}