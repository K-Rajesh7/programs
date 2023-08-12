package Codeforce;
import java .util.*;

public class Elephant {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=5;i>0;i--)
		{
			if(a%i==0)
			{
				System.out.println(a/i);
				break;
			}
		}
		sc.close();
	}
}
