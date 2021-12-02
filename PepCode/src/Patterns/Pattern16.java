package Patterns;
import java.util.*;
class Pattern16
{
public static void main(String[] args) {
	int n;
	int count=1;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+"\t");
		}
		for(int s=0;s<=(2*n)-2-(2*i);s++)
		{
			
			System.out.print("\t");
			
		}
		for(int j=i;j>=1;j--)
		{
			if(j==i && i==n && count==1 )
			{
				count=0;
				continue;
			}
			System.out.print(j+"\t");
			
		}
		System.out.println();
		
	}
	

}

}