package repositories;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean exist = true;
		// interactive menu
		
		String string1 = "Hellow";
		String string2 = "Hellow";
		
		System.out.println(string1+" is before "+string2 +"? "+string1.compareTo(string2));
		
		while ( !exist) {
			System.out.println("Choose an option:");

			System.out.println("1. Retrieve // search for a file.");
			System.out.println("2. Add a new file.");
			System.out.println("3. Delete an existing file.");
			

			System.out.println("6. Exit application.");
			exist = true;

		}
	}

}
