package Recursion;
import java.io.*;
import java.util.*;
public class Factorial {

    public static void main(String[] args) throws Exception {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int ans=factorial(n);
    	System.out.println(ans);
    }

    public static int factorial(int n){
    	//base case-factorial of 0 is 1
    	if(n==0)
    	{
    		return 1;
    	}
    	//FAITH
    	int factnminus1=factorial(n-1);
    	//meeting expectation
    	int factn=n*factnminus1;
    	
        return factn;
    }

}

