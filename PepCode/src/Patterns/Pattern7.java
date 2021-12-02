package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		//Row    space	columns
		/*1		0		1
		 * 2	1		1
		 * 3	2		1
		 * 4	3		1
		 * 5	4		1
		 * 		(i-1)	no loop required
		*/
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int s=0;s<i-1;s++)
			{
				System.out.print("\t");
			}
			System.out.print("*\t");
			System.out.println();
		}

	}

}
