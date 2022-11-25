package practice_question;

import java.util.Scanner;

public class FIBONACCI_SERIES {

	public static void printFIBONACCI(int n)
	{
		int a=0,b=1,c;
		for (int i = 2; i < n; i++)
	       {
	      c= a + b;
	      a = b;
	      b = c;
	          System.out.print (c + " , ");
	       }
	}
	
	public static void main(String[] args) {
		int a, b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number To find fibonacci series: ");
		int n = sc.nextInt();
		
		int c = printFIBONACCI(n);
		
		sc.close();
	}

}
