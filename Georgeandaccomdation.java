package Codeforce;
import java.util.*;

public class Georgeandaccomdation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(Math.abs(a-b)>=2)
				c++;
		}
		System.out.println(c);
		sc.close();
	}
}
