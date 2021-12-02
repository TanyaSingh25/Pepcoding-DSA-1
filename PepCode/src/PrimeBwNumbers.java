import java.util.*;
public class PrimeBwNumbers {

	public static void main(String[] args) {
		int low,high;
		Scanner sc=new Scanner(System.in);
		low=sc.nextInt();
		high=sc.nextInt();
		for(int i=low;i<=high;i++)
		{
			int flag=0;
			for(int j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
			
		}
		
		

	}

}
