package Codeforce;
import java.util.*;

public class Queueatschool {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		String s=sc.next();
		for(int i=0;i<n1;i++)
		{
			if(s.charAt(n-1)=='G')
				s='G'+s.substring(0,n-1);
			else if(s.charAt(n-1)=='B'&&s.charAt(n-2)=='G')
				s='G'+s.substring(0,n-2)+'B';
		}
		System.out.println(s);
		sc.close();
	}
}
