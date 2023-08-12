package Codeforce;
import java.util.*;

public class Drinks {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		for(int i=0;i<n;i++)
		{
			s+=sc.nextInt();
		}
		System.out.println(s);
		double d=(double)s/n;
		System.out.printf("%.12f",d);
		sc.close();
	}
}
