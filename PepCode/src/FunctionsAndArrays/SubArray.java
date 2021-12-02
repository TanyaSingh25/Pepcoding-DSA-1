package FunctionsAndArrays;
import java.io.*;
import java.util.*;

public class SubArray{

public static void main(String[] args) throws Exception {

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int startIndex=0;startIndex<n;startIndex++)
	{
		for(int endIndex=startIndex;endIndex<n;endIndex++)
		{
			for(int i=startIndex;i<=endIndex;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
 }

}
