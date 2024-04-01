import java.io.*;
import java.util.*;

public class Electricity_Bill{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        if(units<=200)
        {
            double totu=units*0.5;
             System.out.println("Rs." +(int)totu);
        }
        else if(units>200 && units<=400)
        {
            double totu=(units*0.65)+100;
             System.out.println("Rs." +(int)totu);
        }
        else if(units>400 && units<=600)
        {
            double totu=(units*0.8)+200;
             System.out.println("Rs." +(int)totu);
        }
        else
        {
            double totu=(units*1.25)+425;
            System.out.println("Rs." +(int)totu);
        }
    }
}