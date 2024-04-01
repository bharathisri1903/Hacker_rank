import java.io.*;
import java.util.*;

public class Checking_Alphabets{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            System.out.println("Vowel");
        }
        else if(ch>=32 && ch<=64)
        {
            System.out.println("Not an alphabet");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}