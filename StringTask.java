package Codeforce;
	import java.util.*;
	
	public class StringTask {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			s=s.toLowerCase();
			for(int i=0;i<s.length();i++)
			{
				char ch =s.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
				    continue;
				else {
					//s1+=Character.toString(ch);
					System.out.print("."+ch);
				}
			}
			sc.close();
		}
	}
