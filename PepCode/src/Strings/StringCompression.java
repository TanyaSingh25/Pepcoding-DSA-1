package Strings;
import java.io.*;
import java.util.*;

public class StringCompression{

	public static String compression1(String str){
		String res=""+str.charAt(0);
		for(int i=1;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			char ch2=str.charAt(i-1);
			if(ch1!=ch2)
			{
				res=res+ch1;
			}
			
		}
		
		return res;
	}

		

	public static String compression2(String str){
		String res="";
		for(int i=0;i<str.length();i++)
		{
			
		}

		return null;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
