package tapiwa.com;

public class Palidrome {

	public static void main(String[] args)
	{
		String str = "Madaam";
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
