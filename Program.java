package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Report;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Report[] vect = new Report[10];

		System.out.print("How many rooms will be rented? ");
		int rent = sc.nextInt();
		while (rent > 10) {
			System.out.printf("We only have 10 rooms to rent.%nHow many rooms under that do you want to rent? ");
			rent = sc.nextInt();
		}
		int numberRoom;
		for (int i = 0; i < rent; i++) {
			System.out.println("#RENT " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			sc.nextLine();
			String email = sc.next();
			System.out.print("Room: ");
			numberRoom = sc.nextInt();
			while (numberRoom > 9) {
				System.out.printf("Our rooms only go from 0 to 9.%nPlease choose one of them: ");
				;
				numberRoom = sc.nextInt();
			}
			while (vect[numberRoom] != null) {
				System.out.printf("Sorry, but this room is already filled.%nPlease choose another one: ");
				numberRoom = sc.nextInt();
			}
			vect[numberRoom] = new Report(name, email, numberRoom);
		}
		System.out.println("Busy rooms: ");

		for (int n = 0; n < 10; n++) {
			if (vect[n] != null) {
				System.out.printf("%d: %s, %s%n", vect[n].getNumberRoom(), vect[n].getName(), vect[n].getEmail());
			}
		}

		sc.close();
	}
}
