package tapiwa.com;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args)
	{
		System.out.println("Enter word: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.printf("isPsalidrome(%s): %b", str, isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str)
	{
		String strLowerCase = str.toLowerCase();
		int f = 0;
		int l = str.length() - 1;
		while(f < l)
		{
			if(strLowerCase.charAt(f) != strLowerCase.charAt(l))
				return false;
			f++;
			l--;
		}
		return true;
	}
}
