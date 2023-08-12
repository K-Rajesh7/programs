package Codeforce;
import java.util.*;

public class Translation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		StringBuffer s2=new StringBuffer(s1);
		String s3=s2.reverse().toString();
		if(s.equals(s3))
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}
