package Strings;

import java.io.*;
import java.util.*;

public class PalindromicSubstringsMethod2 {
    public static boolean isPalindrome(String str2)
    {
        String temp="";
        for(int i=(str2.length()-1);i>=0;i--)
        {
            temp=temp+str2.charAt(i);
        }
        if(temp.equals(str2) || temp==str2)
        {
            return true;
        }
        return false;

    }

	public static void solution(String str){
		for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
               String sub= str.substring(i,j+1);
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
