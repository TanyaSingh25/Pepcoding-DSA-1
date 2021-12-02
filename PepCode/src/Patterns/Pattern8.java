package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		//Row    space	columns
		/*1		4		1
		 * 2	3		1
		 * 3	2		1
		 * 4	1		1
		 * 5	0		1
		 * 		(n-i)	no loop required
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("\t");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
