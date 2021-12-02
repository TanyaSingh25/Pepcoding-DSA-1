import java.util.*;
public class FibonniciForAllTestCases {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
	    
	    int n = scn.nextInt();
	    
	    int a = 0; 
	    int b = 1;
	    
	      
	    int lv = 1;
	    
	    while(lv <= n){
	        int c = a + b; 
	        
	        System.out.println(a);
	        
	        a = b;
	        
	        b = c;
	        lv = lv + 1;
	        

	}

}
}



    
    


