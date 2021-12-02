package RecursionArrays;
import java.io.*;
import java.util.*;

public class DisplayArray {

    public static void main(String[] args) throws Exception {
    	int n;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        //base case
    	if(idx==arr.length)
    	{
    		return;
    	}
    	//meeting expectation with faith
    	System.out.println(arr[idx]);
    	//faith
    	displayArr(arr,idx+1);
    }

}