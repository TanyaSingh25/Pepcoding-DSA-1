package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=(n/2)+1;i++)
		{
			for(int j=1;j<=((n/2)+1)-i+1;j++)
			{
				System.out.print("*\t");
			}
			for(int s=1;s<=2*i-1;s++)
			{
				System.out.print("\t");
			}

			for(int j=1;j<=((n/2)+1)-i+1;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		int dec_count=n-2;
		int inc_count=2;
		for(int i=(n/2)+2;i<=n;i++)
		{
			for(int j=1;j<=inc_count;j++)
			{
				System.out.print("*\t");
			}
			for(int s=1;s<=dec_count;s++)
			{
				System.out.print("\t");
			}

			for(int j=1;j<=inc_count;j++)
			{
				System.out.print("*\t");
			}
			dec_count-=2;
			inc_count++;
			System.out.println();
		}
	

	}

}
