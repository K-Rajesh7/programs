package Codeforce;
import java.util.*;

public class Vanyaandfence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int he=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>he)
				c+=2;
			else
				c++;
		}
		System.out.println(c);
		sc.close();
	}
}
