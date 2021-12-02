package Recursion;
import java.io.*;
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        int n,A,B,C;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        toh(n,A,B,C);
        
    }

    public static void toh(int n, int source, int dest, int aux){
    	if(n==0)
    	{
    		return;
    	}
    	//faith 1-       n-1 disk from src to aux
    	toh(n-1,source,aux,dest);
    	//meeting expectation-move nth disk from src to dest
    	System.out.println(n+"["+source+"->"+dest+"]");
    	//faith 2        n-1 disks from aux to dest using souce
    	toh(n-1,aux,dest,source);
        
    }

}
