package Codeforce;
import java.util.*;

public class Boyrgirl {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Set<String> un=new HashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			String s1=s.substring(i,i+1);
			un.add(s1);
		}
		String s3="";
	    if(un.size()%2==0)
	    	s3="CHAT WITH HER!";
	    else
	    	s3="IGNORE HIM!";
	    System.out.println(s3);
	    sc.close();
	}
}
