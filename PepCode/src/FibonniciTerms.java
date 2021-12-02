import java.util.Scanner;

public class FibonniciTerms {

	public static void main(String[] args) {
		int first=0,second=1,sum,terms;
		Scanner sc=new Scanner(System.in);
		terms=sc.nextInt();
		System.out.println(first);
		System.out.println(second);
		sum=first+second;
		System.out.println(sum);
		
		for(int i=0;i<terms-3;i++)
		{
			first=second;
			second=sum;
			sum=first+second;
			System.out.println(sum);
			
		}
		

	}

}
