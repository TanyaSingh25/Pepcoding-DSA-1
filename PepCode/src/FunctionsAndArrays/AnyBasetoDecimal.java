package FunctionsAndArrays;
import java.util.*;

public class AnyBasetoDecimal {
	
	  
	  public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInDecimal(n, b);
	      System.out.println(dn);
	   } 
	  public static int getValueInDecimal(int n,int b)
	  {
		  int sum=0,mul=1;
	       while(n!=0)
	       {
	    	  int rem=n%10;
	    	  sum=sum+(rem*mul);
	    	  mul=mul*b;
	    	   n=n/10;
	       }
	       return sum;
		  
	  }

}
