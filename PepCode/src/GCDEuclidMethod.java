import java.util.Scanner;

public class GCDEuclidMethod {

	public static void main(String[] args) {
		int a,b,temp,n1,n2;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		//b show be greater gcd(b/a)==gcd(a,b%a)
		if(a>b)
		{
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println(a+" "+b);
		while(a!=0)
		{
		int nchange=a;
		 a=b%a;
		 b=nchange;
		System.out.println(b+" "+a);
			
		}
		System.out.println("GCD IS :"+b);
		
		
		

	}

}
