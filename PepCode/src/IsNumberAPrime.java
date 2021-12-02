import java.util.*;
  
  public class IsNumberAPrime{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t=sc.nextInt();
      int flag,n;
	  
	  while(t>0)
	  {
		  flag=0;
		  n=sc.nextInt();
	      for(int i=2;i<=n/2;i++)
	      {
	    	  if(n%i==0)
	    	  {
	    		  flag=1;
	    		  break;
	    	  }
	      }
	      if(flag==0)
	      {
	    	  System.out.println("prime");
	      }
	      else
	      {
	    	  System.out.println("not prime");
	      }
	      t--;
	  }
      }
      
  
   }
  
