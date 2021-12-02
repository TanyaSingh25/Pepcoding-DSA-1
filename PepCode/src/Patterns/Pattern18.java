package Patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n/2+1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==j || i+j==n+1)
				{
				System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");	
				}
			}
			System.out.println();
		}
		//Type 2
		int dec_count=(n/2)-1;
		for(int i=1;i<=n/2;i++)
		{
			
		for(int s=1;s<=dec_count;s++)
		{
			System.out.print("\t");	
		}
			for(int j=1;j<=2*i+1;j++)
			{
				
				System.out.print("*\t");
				
			}
			dec_count--;
			System.out.println();
		}
		

	}

}
