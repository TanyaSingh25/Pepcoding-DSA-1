package Patterns;
import java.util.Scanner;
public class Pattern14 {
	public static void main(String[] args) {
        int x;
        Scanner scn = new Scanner(System.in);
        x=scn.nextInt();
        for(int i=1;i<=10;i++)
        {
        System.out.println(x+" * "+i+" = "+x*i);
        }
    }

}
