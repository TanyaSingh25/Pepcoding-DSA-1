package TwoDArrays;

import java.util.Scanner;

public class DiagnalOrder {

	public static void main(String[] args) {
	int n;//Square matrix
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int arr[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	
	//for diagonal wise is the outer loop 
	// diagonal wise logic j-i=gap ........ gap starts from 0 till col+1
	
	//arr.length ->rows
	//arr[0].length ->columns
	for(int gap=0;gap<arr[0].length;gap++)
	{
		//then we are moving down and both row and column are changing -> so we consider both
		//row is always starting from 0,j is varying in terms of j-i=gap; so j=gap+i
		for(int i=0,j=gap+i;j<arr[0].length;i++,j++)
		{
			System.out.println(arr[i][j]);
		}
	}
	

	}

}
