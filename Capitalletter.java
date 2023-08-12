package Codeforce;
import java.util.*;

public class Capitalletter {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 String s=sc.nextLine();
    	 String s1=s.substring(0,1).toUpperCase();
    	 s1+=s.substring(1,s.length());
    	 System.out.println(s1);
    	 sc.close();
     }
}
