package Recursion;
import java.io.*;
import java.util.*;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
       int x,n;
       Scanner sc=new Scanner(System.in);
       x=sc.nextInt();
       n=sc.nextInt();
       int ans=power(x,n);
       System.out.println(ans);
    }

    public static int power(int x, int n){
    	//base case-anything raised to power 0 is 1
    	if(n==0)
    	{
    		return 1;
    	}
    	//faith
    	int powernminus1=power(x,n-1);
    	//meeting expectation
    	int powern=x*powernminus1;
    	
    	
        return powern;
    }

}