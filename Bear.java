package Codeforce;
import java.util.*;

public class Bear {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		for(int i=0;i<100;i++)
		{
			a=a*3;
			b=b*2;
            c++;
			if(a>b)
				break;
		}
		System.out.println(c);
		sc.close();
	}
}
