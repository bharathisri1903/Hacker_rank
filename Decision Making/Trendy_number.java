import java.io.*;
import java.util.*;

public class Trendy_number{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>99 && num<=999)
        {
            int n=(num/10)%10;
            if(n%3==0)
                System.out.println("Trendy Number");
            else
                System.out.println("Not a Trendy Number");
        }
        else
        {
            System.out.println("Invalid Number");
        }
                
    }
}