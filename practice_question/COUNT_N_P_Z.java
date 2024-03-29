package practice_question;

import java.util.Scanner;

public class COUNT_N_P_Z {

	public static void main(String[] args) {
		//Write a program to enter numbers till the user wants. At the end it should display the count of positive, negative and zeros entered.
		
		Scanner sc = new Scanner(System.in);
		
		int number,          
        countPositive = 0, 
        countNegative = 0,
        countZero = 0;

    char choice;

    do
    {
        System.out.print("Enter the number ");
        number = sc.nextInt();

        if(number > 0)
        {
            countPositive++;
        }
        else if(number < 0)
        {
            countNegative++;
        }
        else
        {
            countZero++;
        }

        System.out.print("Do you want to continue y/n? ");
        choice = sc.next().charAt(0);

    }while(choice=='y' || choice == 'Y');

    System.out.println("Positive numbers: " + countPositive);
    System.out.println("Negative numbers: " + countNegative);
    System.out.println("Zero numbers: " + countZero);
		
		sc.close();
	}

}
