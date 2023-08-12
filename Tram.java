package Codeforce;
import java.util.*;

public class Tram {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int n1=0,max=0;
    	 for(int i=0;i<n;i++)
    	 {
    		 int a=sc.nextInt();
    		 int b=sc.nextInt();
    		 if(i==0)
    			 n1=a+b;
    		 else
    			 n1=(n1-a)+b;
    		 if(n1>max)
    			 max=n1;
    	 }
    	 System.out.println(max);
    	 sc.close();
     }
}
