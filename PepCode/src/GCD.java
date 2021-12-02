import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int min=a<b?a:b;
		for(int i=min;i>=1;i--)  
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println("GCD is "+i);
				break;
			}
		}
		//can also do from n and n/2 to 1--------------------BETTER
		/*
		if(a%min==0 && b%min==0)
		{
			System.out.println("GCD is "+min);
			
		}
		for(int i=min/2;i>=1;i--)  
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println("GCD is "+i);
				break;
			}
		}
		*/
		

	}

}
