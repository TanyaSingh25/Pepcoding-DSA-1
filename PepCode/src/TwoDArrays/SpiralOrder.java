package TwoDArrays;

import java.util.Scanner;

public class SpiralOrder {
	public static void main(String[] args) throws Exception {
        // left wall->top to bottom
		//bottom wall->left to right
		//right wall ->bottom to up
		//top wall ->right to left
		int n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int firstrow=0,firstcolumn=0,lastrow=n-1,lastcolumn=m-1;
		int count=0;//Number of elements in the whole array ->Stop when elements are complete and it can happen in any loop
		
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		while(count<=m*n)
		{
			
			//left wall
			for(int i=firstrow;i<=lastrow;i++)
			{
				System.out.println(arr[i][firstcolumn]);
				count++;
				if(count==m*n)
				{
					return;
				}
			}
			firstcolumn++;
			//bottom wall
			for(int j=firstcolumn;j<=lastcolumn;j++)
			{
				System.out.println(arr[lastrow][j]);
				count++;
				if(count==m*n)
				{
					return;
				}
			}
			lastrow--;
			for(int i=lastrow;i>=firstrow;i--)
			{
				System.out.println(arr[i][lastcolumn]);
				count++;
				if(count==m*n)
				{
					return;
				}
			}
			lastcolumn--;
			for(int j=lastcolumn;j>=firstcolumn;j--)
			{
				System.out.println(arr[firstrow][j]);
				count++;
				if(count==m*n)
				{
					return;
				}
			}
			firstrow++;
			
		}
		
    }

}
