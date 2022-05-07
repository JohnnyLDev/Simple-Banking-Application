/*
 * Title: Account.java
 * Author: Junhee Lee
 * Date: May 07, 2022
 * Description: Simple banking program using do while loop to continue until it reaches to exit command.
 */

/**
 * @author Junhee Lee
 * @version %I%
 * @since 1.0
 *
 */

/**
 * Simple BankMain class with acc object of Account class to output the values using the bankApp from it's original class
 *
 */
public class BankMain {

	/**
	 * 
	 * @param args the args to main
	 */
	public static void main(String[] args) {
		
		//object acc of Account class
		Account acc = new Account();
		
		//output acc with bankApp method
		acc.bankApp();

	}

}
