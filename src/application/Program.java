package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Reservation reservation = null;
		System.out.print("Room number: ");
		int number = in.nextInt();
		System.out.print("Check-in (DD/MM/YYYY): ");
		Date checkIn = sdf.parse(in.next());
		System.out.print("Check-in (DD/MM/YYYY): ");
		Date checkOut = sdf.parse(in.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("ERROR IN RESERVATION: CHECK-OUT DATE MUST BE AFTER CHECK-IN DATE.");
		} else {
			reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
		}
		
		System.out.println("Enter data to update the reservation:");
		System.out.print("Check-in (DD/MM/YYYY): ");
		checkIn = sdf.parse(in.next());
		System.out.print("Check-in (DD/MM/YYYY): ");
		checkOut = sdf.parse(in.next());
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			System.out.println("ERROR IN RESERVATION: CHECK-OUT DATE MUST BE AFTER CHECK-IN DATE.");
		} else if (!checkOut.after(now)) {
			System.out.println("ERROR IN RESERVATION: CHECK-OUT DATE MUST BE AFTER CHECK-IN DATE.");
		} else {
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
		}
	}
}
