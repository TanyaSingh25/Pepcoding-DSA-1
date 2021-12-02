import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		int n,fac=2;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//Run till n becomes 1
		while(n!=1)
		{
			while(n%fac==0)
			{
				n=n/fac;
				System.out.print(fac+" ");
			}
			//inc from 2 to check for 3,5 etc
			fac++;
		}
		

	}

}
