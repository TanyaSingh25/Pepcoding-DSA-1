package FunctionsAndArrays;
import java.util.*;

public class AnytoAnyBase{
	//Any to decimal then decimal to Any
	public static int anybasetodecimal(int n,int sb)
	{
		int sum=0,multiplier=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(rem*multiplier);
			multiplier=multiplier*sb;
			n=n/10;
	
		}
		return sum;
	}
	public static int decimaltoanybase(int n,int db)
	{
		int sum=0,multiplier=1;
		while(n>0)
		{
			int rem=n%db;
			sum=sum+(rem*multiplier);
			multiplier=multiplier*10;
			n=n/db;
	
		}
		return sum;
	}


public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
   int  destBase= scn.nextInt();
   int dec=anybasetodecimal(n,sourceBase);
   int ans=decimaltoanybase(dec,destBase);
   System.out.println(ans);
  
 }   
}