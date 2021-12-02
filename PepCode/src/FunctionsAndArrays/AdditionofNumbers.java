package FunctionsAndArrays;
import java.util.*;

public class AdditionofNumbers{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getSum(b, n1, n2);
    System.out.println(d);
 }

 public static int getSum(int b, int n1, int n2){
	 int carry=0,res=0,multiplier=1;
	 while(carry>0 || n1>0 || n2>0)
	 {
	 int d1=n1%10;
	 int d2=n2%10;
	 int temp=carry+d1+d2;
	 int quot=temp/b;
	 int rem=temp%b;
	 carry=quot;
	 res=res+(rem*multiplier);
	 multiplier*=10;
	 
	 n1=n1/10;
	 n2=n2/10;
	 
	 
	 }
   return res;
 }
}
