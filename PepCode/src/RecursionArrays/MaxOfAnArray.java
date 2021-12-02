package RecursionArrays;
import java.io.*;
import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        int n;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int ans=maxOfArray(arr,0);//expectation
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int idx){
        //base case
        if(idx==arr.length)
        {
            return Integer.MIN_VALUE;
        }
        //faith
        int maxCall=maxOfArray(arr,idx+1);
        //meeting expectation with faith
        int ans= Math.max(arr[idx],maxCall);
        return ans;
    }

}
