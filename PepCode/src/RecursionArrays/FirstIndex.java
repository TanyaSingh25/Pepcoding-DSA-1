package RecursionArrays;
import java.io.*;
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
    	int n,find;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        find=sc.nextInt();
        int ans=firstIndex(arr,0,find);
        System.out.println(ans);
        
    }

    public static int firstIndex(int[] arr, int idx, int x){
    	int tempIndex;
    	//base case
    	if(idx==arr.length)
    	{
    		return -1;
    	}
    	
    	//faith
    	tempIndex=firstIndex(arr,idx+1,x);
    	//meeting expectation with faith
    	if(arr[idx]==x)
    	{
    		return idx;
    	}
    	else
    	{
    		return tempIndex;
    	}
    }

}
