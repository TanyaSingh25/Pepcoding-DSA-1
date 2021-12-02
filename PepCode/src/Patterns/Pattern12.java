package Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		int n,a=0,b=1,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+"\t");
				sum=a+b;
				a=b;
				b=sum;
				
			}
			System.out.println();
		}

	}

}
