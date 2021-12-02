package Recursion;
import java.io.*;
import java.util.*;

public class PrintIncreasingDecreasing {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
    	//Base case
    	if(n==0)
    	{
    		return;
    	}
    	//preorder-4
    	System.out.println(n);
    	//faith 3,2,1,1,2,3
    	pdi(n-1);
    	//postorder-4
    	System.out.println(n);
        
    }

}
