package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//spaces
	
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=n-i;s++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		

	}

}
