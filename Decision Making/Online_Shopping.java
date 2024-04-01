import java.io.*;
import java.util.*;

public class Online_Shopping{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flip=sc.nextInt();
        int flid=sc.nextInt();
        int flis=sc.nextInt();
        int snapp=sc.nextInt();
        int snapd=sc.nextInt();
        int snaps=sc.nextInt();
        int amap=sc.nextInt();
        int amad=sc.nextInt();
        int amas=sc.nextInt();
        int fli= (int)(flip-(flip*(flid*0.01))+flis);
        int snap=(int)(snapp-(snapp*(snapd*0.01))+snaps) ;
        int ama= (int)(amap-(amap*(amad*0.01))+amas); 
        System.out.println("In Flipkart: Rs."+fli);
        System.out.println("In Snapdeal: Rs."+snap);
        System.out.println("In Amazon: Rs."+ama);
        if(fli<=snap && fli<=ama)
        {
            System.out.println("Choose Flipkart");
        }
        else if (snap<=fli && snap<=ama)
        {
             System.out.println("Choose Snapdeal");
        }
        else
        {
            System.out.println("Choose Amazon");
        }
    }
}