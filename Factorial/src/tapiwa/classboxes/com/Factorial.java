package tapiwa.classboxes.com;

public class Factorial {

	public static void main(String[] args)
	{
		int num = 5;
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
