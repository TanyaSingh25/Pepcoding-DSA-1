package RecursionArrays;
import java.io.*;
import java.util.*;

public class DisplayArrayReverse {

    public static void main(String[] args) throws Exception {
    	int n;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
    	int arr[]=new int[n];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.nextInt();		
    	}
    	displayArrReverse(arr,arr.length-1);
    	
      
    }

    public static void displayArrReverse(int[] arr, int idx) {
    	if(idx==-1)
    	{
    		return;
    	}
    	//meeting expectation
    	System.out.println(arr[idx]);
    	//faith
     	displayArrReverse(arr,idx-1);

    }

}
