package Codeforce;
import java.util.*;

public class Wrongsubstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			if(n%10==0)
				n=n/10;
			else
				n=n-1;
		}
		System.out.println(n);
		sc.close();
	}

}
