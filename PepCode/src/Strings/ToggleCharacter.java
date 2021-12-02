package Strings;

import java.util.Scanner;

public class ToggleCharacter {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		String strAns="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				ch=(char) (ch+32);
			}
			else if(ch>=97 && ch<=122)
			{
				ch=(char)(ch-32);
			}
			strAns=strAns+ch;
			
			
		}
		System.out.println(strAns);

	}

}
