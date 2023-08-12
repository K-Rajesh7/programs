package Codeforce;
import java.util.*;

public class Soldiersbanana {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int w=sc.nextInt();
		int td=0;
		for(int i=1;i<=w;i++)
		{
			int d=i*k;
			td=td+d;
		}
		int dif=td-n;
		if(dif>=0)
			System.out.println(dif);
		else
			System.out.println(0);
		sc.close();
	}
}
