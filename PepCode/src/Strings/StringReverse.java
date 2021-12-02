package Strings;

import java.util.Scanner;

public class StringReverse {
	public static void palindrome(String str2)
    {
        String temp="";
        for(int i=(str2.length()-1);i>=0;i--)
        {
            temp=temp+str2.charAt(i);
        }
        if(temp.equals(str2) || temp==str2)
        {
            System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
       

    }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
	    palindrome(str);

	}

}
