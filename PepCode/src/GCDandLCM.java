import java.util.Scanner;
public class GCDandLCM {

	public static void main(String[] args) {
		int n1,n2;
		int lcm=0,gcd=0;
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	int a=n1,b=n2;
	int max=n1>n2?n1:n2;
	
	while(a>b)
	{
		int temp=a;
		a=b;
		b=temp;
		
	}

	while(a>0)
	{
		int temp=a;
		a=b%a;
		b=temp;
		gcd=b;
		
	}
	
	System.out.println(gcd);
	
	
	for(int i=max;;i++)
	{
		if(i%n1==0 && i%n2==0)
		{
			lcm=i;
			System.out.println(lcm);
			break;
		}
	}
	

	}

}
