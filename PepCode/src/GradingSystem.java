import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>=90)
		{
			System.out.println("excellent");
		}
		else if(marks<=90 && marks>80)
		{
			System.out.println("good");
		}
		else if(marks<=80 && marks>70)
		{
			System.out.println("fair");
		}
		else if(marks<=70 && marks>60)
		{
			System.out.println("meets expectations");
		}
		else
		{
			System.out.println("below Par");
		}
//The conditions can also bhi marks>90,marks>80 and so on


	}

}
