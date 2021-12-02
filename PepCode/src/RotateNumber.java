import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) {
		int n,k;
		int v1,v2;
		int ans;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n,count=0;
		k=sc.nextInt();
		//Count digits
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		//Converting to positive k and within count range
		k=k%count;
		if(k<0)
		{
			k=k+count;
		}
		//calculating v1 and v2
		v1=n%(int)Math.pow(10,k);
		v2=n/(int)Math.pow(10,k);
		int tempv1=v1*(int)Math.pow(10, count-k);
		ans=v2+tempv1;
		System.out.println(ans);
		
		
		
		
		
	}

}
