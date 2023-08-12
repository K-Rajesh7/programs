package Codeforce;
import java.util.*;

public class Word {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0,c1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90)
				c++;
			else
				c1++;
		}
		if(c==c1)
			System.out.println(s.toLowerCase());
		else if(c1>c)
			System.out.println(s.toLowerCase());
		else
			System.out.println(s.toUpperCase());
		sc.close();
	}
}
