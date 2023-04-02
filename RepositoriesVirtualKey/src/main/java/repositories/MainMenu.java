package repositories;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean exist = false;
		// interactive menu
		while ( !exist) {
			System.out.println("Choose an option:");

			System.out.println("1. Retrieve file names.");
			System.out.println("2. Manage application users.");

			System.out.println("6. Exit application.");
			exist = true;

		}
	}

}
