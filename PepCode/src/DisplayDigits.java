import java.util.Scanner;
public class DisplayDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		int temp=n;
		int div=1;
		int front;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		  
		//	Math.pow(2,3); ---only works on double
			for(int i=1;i<=count-1;i++)
			{
				div=div*10;
				
			}
		//	System.out.println(div);
			while(div!=0) //for the test case of zero in the end
			{
				//Number is 1428
				front=n/div;//1 comes
				System.out.println(front);
				n=n%div;//428 comes
				div=div/10;//div becomes from 1000 to 100
			
				
				
			}
		

	}

}
