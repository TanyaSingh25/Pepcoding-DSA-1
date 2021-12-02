package TwoDArrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int n1,n2,m1,m2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		m1=sc.nextInt();
		int arr1[][]=new int[n1][m1];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m1;j++)
			{
				arr1[i][j]=sc.nextInt();
						
			}
		}
		n2=sc.nextInt();
		m2=sc.nextInt();
		int arr2[][]=new int[n2][m2];
		for(int i=0;i<n2;i++)
		{
			for(int j=0;j<m2;j++)
			{
				arr2[i][j]=sc.nextInt();
						
			}
		}
		int c[][]=new int[n1][m2];
		if(m1==n2)
		{
			
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				
				for(int k=0;k<m1;k++)
				{
					c[i][j]=c[i][j]+(arr1[i][k]*arr2[k][j]);
				}
			}
		}
		
		//display
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m2;j++)
			{
				System.out.println(c[i][j]);
						
			}
		}
		}
		else
		{
			System.out.println("Invalid input");
			return;
		}

	}

}
