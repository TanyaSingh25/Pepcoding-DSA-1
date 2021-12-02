import java.util.Scanner;

public class Tableof2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Till how many terms you want Table of 2");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(" 2 X "+i+" = "+2*i);
		}

	}

}
