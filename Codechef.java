package Codeforce;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int c=1,min=999,max=0;
		    int size=sc.nextInt();
		    int a[]=new int[size];
		    for(int j=0;j<size;j++)
		        a[i]=sc.nextInt();
		    for(int k=0;k<size;k++)
		    {
		        if(a[k+1]-a[k]<=2)
		        {
		            c++;
		        }
		        else {
		            if(c<min)
		                min=c;
		            if(c>max)
		                max=c;
		            c=1;
		        }
		    }
		    System.out.println(min+" "+max);
		    sc.close();
		}// your code goes here
	}
}