package repositories;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {


	public static FilesList list; // global variable so the list will be handled all over the class and related methods.
	
	public static void main(String[] args) {
		//Initialization of the files database
		intialization();


		// TODO Auto-generated method stub

		// interactive menu

		mainMenu();



		
		
	}
	
	private static void mainMenu() {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		boolean exist = true;
		
		while ( exist) {
			
			
			System.out.println("Choose an option:");
			System.out.println("1. Display existing files.");
			System.out.println("2. Add \\ delete \\ search a file.");
			System.out.println("6. Exit application.");
			
			try {
				String option = scanner.nextLine();
				Integer mainOption = Integer.valueOf(option);

				switch (mainOption) {
				case 1:
					displayMessage();
					break;
				
				case 2:
					subMenu();
						break;
				case 6:
					exist = false;
					System.out.println("We hope to see you next time.");
					break;
				
				default:
					throw new ArithmeticException("Invalid choice. Please check the menu options.");
				}
				
			}
			
			catch (ArithmeticException e) {
				System.out.println("You have to enter a valid choice (1, 2, 6).");
			}
			catch (NumberFormatException  e) {				
				System.out.println("You have to enter a valid number.");
			} 
			catch (Exception  e) {
				
				System.out.println("An error has occured.");
				return;
			} 
			finally {


			}
			
			
		}
		System.out.println("Company Lockers Pvt. Ltd LockedMe.com file management system.\n"
				+ "beta release April 2023.\n"
				+ "Principal developper: Adnane Habib (mailto: adnane_h@yahoo.fr).");
		scanner.close();// ensuring scanner is closed.		
		
	}

	private static void displayMessage() {
		// TODO Auto-generated method stub
		System.out.println("\n\n\nGreetings.\n\nCompany Lockers Pvt. Ltd LockedMe.com file management system.\n"
				+ "beta release April 2023.\n"
				+ "Principal developper: Adnane Habib (mailto: adnane_h@yahoo.fr).");
		System.out.println("\nYou have selected option 1, files display.");
		list.display();
		
		
		
	}

	private static void subMenu()
	{
		System.out.println("You are now in the submenu.");
		try {
		boolean exist = true;

		Scanner scanner = new Scanner(System.in);
			
		
		while ( exist) {
			
			
			System.out.println("Choose an option:");
			System.out.println("1. Add a file or a set of files.");
			System.out.println("2. Delete a file or a set of files.");
			System.out.println("3. Search for a file or a set of files.");
			
			System.out.println("6. Exit to the main menu.");
			
			try {
				String option = scanner.nextLine();
				Integer mainOption = Integer.valueOf(option);

				switch (mainOption) {
				case 1:
					addFile();
					break;
				
				case 2:
					deleteFile();
						break;
						
				case 3:
					searchFile();
						break;
						
				case 6:
					exist = false;
					System.out.println("You are taken back to the main menu.");
					break;
				
				default:
					throw new ArithmeticException("Invalid choice. Please check the menu options.");
				}
				
			}
			
			catch (ArithmeticException e) {
				System.out.println("You have to enter a valid choice (1, 2, 6).");
			}
			catch (NumberFormatException  e) {				
				System.out.println("You have to enter a valid number.");
			} 
			catch (Exception  e) {
				
				System.out.println("An error has occured.");
				exist = false;
			} 
			finally {


			}
		}
		}
		catch (Exception e) {
			return;
		}
		
	}

	private static void searchFile() {
		// TODO Auto-generated method stub
		System.out.println("search for a file option.");
	}

	private static void deleteFile() {
		// TODO Auto-generated method stub
		System.out.println("delete file option.");
	}

	private static void addFile() {
		// TODO Auto-generated method stub
		System.out.println("Add File option.");
	}

	private static void intialization() 
	{		
		String string1 = "Hellow";
		String string2 = "Hellow";

		System.out.println(string1+" is before "+string2 +"? "+string1.compareTo(string2));


		list = new FilesList();
		list.append("file8");
		list.append("file6");
		list.append("file7");
		list.append("file5");


		//list.display();


		list.append("file2");
		list.append("file3");
		list.append("file4");
		list.append("file1");

		//list.display();

		//list.delete("file3");

		//list.display();

		//list.display();
		//System.out.println();
		//System.out.println();
		list.append("file40");
		list.display();
		//System.out.println();
		//System.out.println();
		list.append("file18");
		//list.display();
		//System.out.println();
		//System.out.println();
		list.append("file19");
		//list.display();
		//System.out.println();
		//System.out.println();
		list.append("file17");
		//list.display();
		//System.out.println();
		//System.out.println();
		list.append("file16");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		//list.display();
		//list.delete("file16");
		//list.delete("file17");
		//list.delete("file1");
		//list.delete(1);
		//list.display();
		/*
	for (String file : list.listofFiles()) {
		System.out.println(file);
	}

	System.out.println();

	for (FileNode file : list.listofNodes()) {
		System.out.println(file.getFileName());
	}

	System.out.println();

	for (FileNode file : list.listofNodes()) {
		System.out.println(file.getFileLocation());
	}

	System.out.println();

	for (int location : list.listofLocations()) {
		System.out.println(location);
	}

	System.out.println(list.getListofLocations());
		 */}

}
