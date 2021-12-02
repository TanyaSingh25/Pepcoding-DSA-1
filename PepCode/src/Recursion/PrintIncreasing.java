package Recursion;
import java.io.*;
import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	printIncreasing(n);
    }

    public static void printIncreasing(int n){
    	//base case
    	if(n==0)
    	{
    		return;
    	}
    	//faith
    	printIncreasing(n-1);
    	//meeting expection with faith
    	System.out.println(n);
    	
        
    }

}