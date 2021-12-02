import java.util.Scanner;

public class GCDBruteForce {

	public static void main(String[] args) {
		int a,b,gcd=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int min=a<b?a:b;
		for(int i=1;i<=min;i++)
		{
			if(a%i==0 && b%i==0)
			{
			gcd=i;
			}
		}
		System.out.println("GCD is "+gcd);
		
	}

}
