package Codeforce;
import java.util.*;

public class Main {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine();
    	int n=s.length();
    	char a[]=s.toCharArray();
    	Arrays.sort(a);
    	for(int i=0;i<n;i++)
    	{
    		if(a[i]=='+')
    			a[i]=0;
    	    //System.out.print(a[i]+" ");
    	}
    	for(int i=0;i<n-1;i++)
    	{
    		if(a[i]==0)
    			continue;
    		else
    			System.out.print(a[i]+"+");
    	}
    	System.out.print(a[n-1]);
    	sc.close();

    }
}
