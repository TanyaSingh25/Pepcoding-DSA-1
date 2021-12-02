package RecursionArrays;
import java.io.*;
import java.util.*;

public class LastIndex {

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
        int ans=lastIndex(arr,arr.length-1,find);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){
    	//base case
    	if(idx==-1)
    	{
    		return -1;
    	}
    	//faith
    	int temp=lastIndex(arr,idx-1,x);
    	//meeting expectation with faith
    	if(arr[idx]==x)
    	{
    		return idx;
    	}
    	else
    	{
    		return temp;
    	}
    }

}
