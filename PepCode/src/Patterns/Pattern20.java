package Patterns;
import java.util.*;
class Pattern20
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n )
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=(n/2)+1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<(n/2)+1 && (j==1 || j==n || i+j==(n/2)+1 ))
				{
					System.out.print("*\t");
				}
				if(j>(n/2)+1 &&  i+j==(n/2)+3 )
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			
			}
			System.out.println();
		}
	}
}