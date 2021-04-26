package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 25/04/2021 17:00
		// Last edition:
		Scanner in = new Scanner(System.in);

		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = in.nextInt();
			System.out.print("Holder: ");
			in.nextLine();
			String holder = in.nextLine();
			System.out.print("Initial balance: ");
			Double balance = in.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = in.nextDouble();
			System.out.print("\nEnter amount for withdraw: ");
			Double amountWithdraw = in.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
		try {
			acc.withdraw(amountWithdraw);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		in.close();
	}
}
/*
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar
 * um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode
 * ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior
 * ao limite de saque da conta. Implemente a conta bancária conforme projeto
 * abaixo:
 */
