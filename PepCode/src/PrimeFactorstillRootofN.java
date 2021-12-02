import java.util.Scanner;

public class PrimeFactorstillRootofN {

	public static void main(String[] args) {
		int n;
	//	int fac=2;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//Run till n becomes 1
		for(int fac=2;fac<=(n);fac++)//If we run for n-1 it will not run for last case,5<=4 this will be false so 5 dosent print
		{
			while(n%fac==0)
			{
				n=n/fac;
				System.out.print(fac+" ");
			}
		
			//inc from 2 to check for 3,5 etc
		//	fac++;
		}
		

	}

}

