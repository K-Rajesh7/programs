package Codeforce;
import java.util.*;

public class Calculatingfunction {
	static long fact(long n)
	{
		if(n%2!=0)
			return -n;
		else
		{
			//if(n%2==0)
				return(n+fact(n-1));
//			else
//				return (-n+fact(n-1));
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long s=0,n=sc.nextInt();
		s=fact(n);
//		for(long i=1;i<=n;i++)
//		{
//			s+=Math.pow(-1,i)*i;
//		}
		System.out.println(s);
		sc.close();
	}
}
