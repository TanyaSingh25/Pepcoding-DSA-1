import java.util.Scanner;

public class InverseNumber {

	public static void main(String[] args) {
		int n;
		int ofv,opv=1,infv,inpv;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			ofv=n%10;
			inpv=ofv;
			infv=opv;
			sum=sum+(infv*(int)Math.pow(10, inpv-1));
			opv++;//place value keeps on increasing from 1 to 5
			n=n/10;//reduce the number
		}
		System.out.println(sum);//Inverse of the number
	}

}
