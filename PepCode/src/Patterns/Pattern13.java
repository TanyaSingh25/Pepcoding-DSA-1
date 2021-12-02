package Patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int n=0;n<num;n++)
		{
			int val=1;
			System.out.print(val+"\t");
			for(int r=0;r<n;r++)
			{
			
				val=(val*(n-r))/(r+1);
				System.out.print(val+"\t");
			}
			System.out.println();
			
		}

	}

}
