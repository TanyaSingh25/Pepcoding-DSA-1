package TwoDArrays;

import java.util.Scanner;

public class WaveOrder {

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
		//column wise traversal ->outer loop will be for columns
		for(int j=0;j<m;j++)
		{
			//if col num is odd->top to bottom else bottom to top   
		/*      0 1 2
			0
			1			*/
			
			//if j is even top to bottom ie 0 to n 
			if(j%2!=0)
			{
				for(int i=n-1;i>=0;i--)
				{
					System.out.println(arr[i][j]);
				}
			}
			else
			{
				for(int i=0;i<n;i++)
				{
					System.out.println(arr[i][j]);
				}
			}
				
		}
		

	}

}
