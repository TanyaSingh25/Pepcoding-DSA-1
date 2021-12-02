package Recursion;
import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       printDecreasing(n);
    }

    public static void printDecreasing(int n){
    	//base case
    	if(n==0)
    	{
    		return;
    	}
    	//meeting expectation with faith
    	System.out.println(n);
    	//faith
    	printDecreasing(n-1);
        
    }

}
