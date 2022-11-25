package function_method;

import java.util.Scanner;

public class even_odd {
	public static int evenOdd(int n)
	{
		if (n%2==0)
		{
			System.out.println("Number is Even: ");
			return 1;
		}
		else
		{
			System.out.println("Number is Odd: ");
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check even odd: ");
	int n = sc.nextInt();
	
	evenOdd(n);	
		
	sc.close();	
	}

}
