import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		int a,b,c;
		int max;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		//Find largest of three and that will be c,a2+b2=c2
		if(a>b && a>c)
		{
			max=a;
			a=c;
			c=max;
		}
		else if(b>a && b>c)
		{
			max=b;
			b=c;
			c=max;
		}
		if(a*a+b*b==c*c)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
			

	}

}
