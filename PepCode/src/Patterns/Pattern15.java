package Patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
		for(int i=1;i<=(n/2)+1;i++)
		{
			int val=i;
			for(int s=1;s<=(n/2)-i+1;s++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(val+"\t");
				if(j<=(2*i-1)/2)
				{
					val++;
				}
				else
				{
					val--;
				}
			}
			System.out.println();
		}
		int inc_count=1;
		for(int i=n/2;i>=1;i--)
		{
			int val=i;
			for(int s=1;s<=inc_count;s++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(val+"\t");
				if(j<=(2*i-1)/2)
				{
					val++;
				}
				else
				{
					val--;
				}
				
			}
			inc_count++;
			System.out.println();
		}

	}

}
