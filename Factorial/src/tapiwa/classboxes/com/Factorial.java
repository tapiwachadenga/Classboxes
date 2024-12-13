package tapiwa.classboxes.com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to apply to factorial: ");
		int num = sc.nextInt();
		System.out.printf("factorial(%d) = %d", num, factorial(num));
	}
	
	public static int factorial(int num)
	{
		int acc = 1;
		return factorialHelper(num, acc);
	}
	
	private static int factorialHelper(int num, int acc)
	{
		if(num <= 1)
			return acc;
		return factorialHelper(num - 1, acc * num);
	}
}
