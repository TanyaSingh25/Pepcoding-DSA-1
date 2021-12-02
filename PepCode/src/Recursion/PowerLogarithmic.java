package Recursion;
import java.io.*;
import java.util.*;

public class PowerLogarithmic {

    public static void main(String[] args) throws Exception {
    	int x,n;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
    	//base case
    	if(n==0)
    	{
    		return 1;
    	}
    	//faith -even x^n=x^n/2 * x^n/2
    	//faith -odd x^n=x^n/2 * x^n/2 * x
    	int powernby2=power(x,n/2);
    	//meeting faith with expectation
    	if(n%2==0)
    	{
    		return powernby2*powernby2;
    	}
    	else
    	{
    		return  x*powernby2*powernby2;
    	}
    	
    }

}
