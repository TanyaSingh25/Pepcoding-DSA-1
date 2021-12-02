package Strings;
import java.io.*;
import java.util.*;

public class PalindromicSubstrings {
	public static boolean isPalindrome(String str)
	{
		for(int left=0,right=(str.length()-1);left<right;left++,right--)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
		}
		return true;
		
	}

	public static void solution(String str){
		for(int start=0;start<str.length();start++)
		{
			for(int end=start;end<str.length();end++)
			{
				String sub=str.substring(start, end+1);
			    boolean value=isPalindrome(sub);
				if(value)
				{
				 System.out.println(sub);
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
