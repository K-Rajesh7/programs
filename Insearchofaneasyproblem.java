package Codeforce;
import java.util.*;

public class Insearchofaneasyproblem {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==1)
				c++;
		}
		if(c>0)
			System.out.println("HARD");
		else
			System.out.println("EASY");
		sc.close();
	}
}
