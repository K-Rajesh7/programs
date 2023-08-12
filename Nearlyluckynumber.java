package Codeforce;
import java.util.*;

public class Nearlyluckynumber {
	public static void main(String args[])
	{
		//@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		sc.close();
		long n1=n;
		int c=0;
		while(n != 0)  
		{    
			n = n / 10;    
			c++;  
		}  
		if(c==1)
		{
			System.out.println("NO");
			return ;
		}
		int co=0;
		for(long i=0;i<c;i++)
		{
			if(n1%10==4||n1%10==7)
			{
				co++;
				//System.out.println("NO");
				//return;
			}
			n1/=10;
		}
		if(co==4||co==7)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}
