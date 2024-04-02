import java.io.*;
import java.util.*;

public class Time_sheet{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sun=sc.nextInt();
        int mon=sc.nextInt();
        int tue=sc.nextInt();
        int wed=sc.nextInt();
        int thur=sc.nextInt();
        int fri=sc.nextInt();
        int sat=sc.nextInt();
        int mon1,tue1,wed1,thur1,fri1,sat3,sun3;
        if(mon>8)
        {
            int hours=mon%8;
            mon1=(mon*100)+(hours*15);
        }
        else
        {
            mon1=mon*100;
        }
        if(tue>8)
        {
            int hours1=tue%8;
            tue1=(tue*100)+(hours1*15);
        }
        else
        {
            tue1=tue*100;
        }
        if(wed>8)
        {
            int hours2=wed%8;
            wed1=(wed*100)+(hours2*15);
        }
        else
        {
            wed1=wed*100;
        }
        if(thur>8)
        {
            int hours3=thur%8;
            thur1=(thur*100)+(hours3*15);
        }
        else
        {
            thur1=thur*100;
        }
        if(fri>8)
        {
            int hours4=fri%8;
            fri1=(fri*100)+(hours4*15);
        }
        else
        {
            fri1=fri*100;
        }
        sat3=sat*125;
        sun3=sun*150;
        int sal=mon1+tue1+wed1+thur1+fri1+sat3+sun3;
        System.out.println(sal);
    }
}