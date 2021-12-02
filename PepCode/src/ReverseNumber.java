import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int sum=0,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
