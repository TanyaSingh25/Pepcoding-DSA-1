package TwoDArrays;

import java.util.Scanner;

public class SaddlePoint {

	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int min=arr[i][j];
				if(min>arr[i][j])
				{
					min=arr[i][j];
				}
				
						
			}
		}
	

	}

}
