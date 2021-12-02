package FunctionsAndArrays;
import java.io.*;
import java.util.*;

public class FindElementinArray{
	public static int linearSearch(int arr[],int elem)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==elem)
			{
				return i;// i is the index
			}
		}
		return -1;
	}

public static void main(String[] args) throws Exception {
    int n,elem;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i]=sc.nextInt();
    }
    elem=sc.nextInt();
   int ans= linearSearch(arr,elem);
    System.out.println(ans);
    
 }

}
