package Patterns;


import java.util.Scanner;

public class Pattern17Version2  {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int dec_count=n/2;
		//first half
		for(int i=1;i<=(n/2)+1;i++)
		{
			for(int s=1;s<=dec_count;s++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*\t");
			}
			dec_count--;
			System.out.println();
		}
		//second half
		int inc_count=1;
		for(int i=1;i<=(n/2);i++)
		{
			for(int s=1;s<=inc_count;s++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=n-2*i;j++)
			{
				System.out.print("*\t");
			}
			inc_count++;
			System.out.println();
		}

	}

}
