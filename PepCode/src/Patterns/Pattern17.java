package Patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
	
		for(int i=1;i<=(n/2);i++)
		{
			int inc_count=1;
			while(inc_count<=n/2)
			{
				System.out.print("\t");
				inc_count++;
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			System.out.print("*\t");
		}
		System.out.println();
		for(int i=n/2;i>=1;i--)
		{
			int inc_count=1;
			while(inc_count<=n/2)
			{
				System.out.print("\t");
				inc_count++;
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
