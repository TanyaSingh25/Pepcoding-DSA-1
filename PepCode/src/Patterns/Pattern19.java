package Patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==3 || j==3  )
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

	}

}
