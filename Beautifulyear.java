package Codeforce;
import java.util.*;

public class Beautifulyear {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n++;
		//int r=0;
		boolean b= true;
		while(b)
		{
			for(int i=0;i<4;i++)
			{
				for(int j=i+1;j<4;j++)
				{
					if(n%(10*(i+1))==n%(10*(j+1)))
							b=false;
				}
			}
			System.out.println(n);
			b=false;
		}
		sc.close();
	}
}
