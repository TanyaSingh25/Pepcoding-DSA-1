import java.util.Scanner;

public class BenjaminBulbs {

	public static void main(String[] args) {
		// jo perfect square hai woh hi on rhenge as they have 2x+1 factors ie odd fluctuations
		int n;
		int fal=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//num of bulbs equal to num of fluctuations and print from 1 to n 
		while(fal<=n)
		{
			if(Math.sqrt(fal)==(int)Math.sqrt(fal))//if 36.0==36
			{
				System.out.println(fal);
			}
			fal++;	
		}
		

	}

}
