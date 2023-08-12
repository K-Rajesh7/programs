package Codeforce;
import java.util.*;

public class Magnets {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=1,n=sc.nextInt();
		int a[]=new int[n];
		a[0]=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]!=a[i-1])
				c++;
		}
		System.out.println(c);
		sc.close();
	}
}
