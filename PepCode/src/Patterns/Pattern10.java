package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=(n/2)+1;i++)
		{
			for(int s=1;s<=(n/2)-i+1;s++)
			{
				System.out.print("\t");
			}
			System.out.print("*\t");
			if(i!=1)
			{
			for(int s=1;s<=2*i-3;s++)
			{
				System.out.print("\t");
			}
			}
			if(i!=1)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		int inc_count=1;
		for(int i=n/2;i>=1;i--)
		{
			for(int s=1;s<=inc_count;s++)
			{
				System.out.print("\t");
			}
			System.out.print("*\t");
			if(i!=1)
			{
			for(int s=1;s<=2*i-3;s++)
			{
				System.out.print("\t");
			}
			}
			if(i!=1)
			{
				System.out.print("*\t");
			}
			inc_count++;
			System.out.println();
		}

		
	}

}
