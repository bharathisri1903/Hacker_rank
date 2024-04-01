import java.io.*;
import java.util.*;

public class Hotel_Tariff{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int rent=sc.nextInt();
        int days=sc.nextInt();
        if(month==4||month==5||month==6||month==11||month==12)
        {
            double rent1=(rent*(120*0.01))*days;
            System.out.println((int)rent1);
        }
        else if(month==1||month==2||month==3||month==7||month==8||month==9||month==10)
        {
            int rent1=rent*days;
            System.out.println(rent1);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}