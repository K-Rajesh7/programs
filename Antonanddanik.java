package Codeforce;
import java.util.*;

public class Antonanddanik {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int c=0,c1=0;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)==65)
				c++;
			else
				c1++;
		}
		if(c==c1)
			System.out.println("friendship");
		else if(c>c1)
			System.out.println("Anton");
		else
			System.out.println("Danik");
		sc.close();
	}
}
