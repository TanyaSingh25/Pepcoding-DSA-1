package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

	
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=i-1;s++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		

	}

}
