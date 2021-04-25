package application;

<<<<<<< HEAD
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 25/04/2021 17:00
		//Last edition: 
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
		
		
		in.close();
	}
}
/*Fazer um programa para ler os dados de uma conta bancária e depois realizar um 
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer 
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de 
saque da conta. Implemente a conta bancária conforme projeto abaixo:
*/
=======
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExcepction;

public class Program {

	public static void main(String[] args) {
		//Date: 23/04/2021 16:10
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
	
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (DomainExcepction e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error"); //pega algum erro inexperado
		}
		sc.close();
	}
}
>>>>>>> 7750d08eb1c2b6df0c67cbbfa5123a5bda931f7c
