/*
 * Title: Account.java
 * Author: Junhee Lee
 * Date: May 07, 2022
 * Description: Simple banking program using do while loop to continue until it reaches to exit command.
 */

import java.util.Scanner;

/**
 * @see java.lang.Object
 * @author Junhee Lee
 * @version %I%
 * @since 1.0
 *
 */

/**
 * This is an Account class providing deposit, withdraw components for the bankApp to be created as an object in BankMain.java class
 *
 */
public class Account {
	
	/**
	 * Scanner object input allows user to enter on console
	 */
	Scanner input = new Scanner(System.in);
	
	/**
	 * Instance variables balance and amount
	 */
	private int balance;
	private int amount;
	
	/**
	 * Account no-argument constructor
	 */
	public Account() {
		
	}
	
	/**
	 * Return amount of dollars
	 * 
	 * @return the amount for this Account
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Set amount of dollars
	 * 
	 * @param amount the amount to set amount value
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * Deposit method to add the amount entered into current balance
	 * 
	 * @param amount the amount to deposit the dollars into a balance
	 */
	public void deposit(int amount) {
		if(amount != 0) {
			balance += amount;
		}
	}
	
	/**
	 * Withdraw method to withdraw the amount entered from the current balance
	 * 
	 * @param amount the amount to withdraw the dollars from the balance
	 */
	public void withdraw(int amount) {
		if(amount != 0) {
			balance -= amount;
		}
	}

	/**
	 * bankApp method to loop through a while loop until the option reaches to D to exit the program.
	 * B deposit option allows to store user input amount values into deposit method in balance.
	 * C withdraw option allows to store user input amount values from withdraw method in balance.
	 * D exit option finishes the while loop to discontinue the loop to an end.
	 */
	public void bankApp() {
		String option = "";
		
		System.out.println("Thank you for using our banking program.");
		System.out.println("Please enter one of the following option(s): ");

		while(!option.equals("D")) {
			
			System.out.println("\n" + "=====================================");
			System.out.println("\n	" + "A (Check Balance)");
			System.out.println("	" + "B (Deposit)");
			System.out.println("	" + "C (Withdrawal)");
			System.out.println("	" + "D (Exit Program)" + "\n");
			System.out.println("=====================================");
			
			System.out.print("\n" + "Enter your option: ");
			option = input.next();
			
			if(option.equalsIgnoreCase("A")) {
				System.out.println("Balance = $" + balance);
			}
			else if(option.equalsIgnoreCase("B")) {
				System.out.print("Deposit = $");
				int amount = input.nextInt();
				deposit(amount);
			}
			else if(option.equalsIgnoreCase("C")) {
				System.out.print("Withdraw = $");
				int amount = input.nextInt();
				withdraw(amount);
			}
			else if(option.equalsIgnoreCase("D")) {
				System.out.println("Good bye." + "\n");
				System.out.println("=====================================");
				break;
			}
			
		}
		
		input.close();
	}
}