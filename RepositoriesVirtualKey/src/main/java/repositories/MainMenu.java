package repositories;

import java.util.Scanner;

public class MainMenu {


	public static FilesList list; // global variable so the list will be handled all over the class and related methods.

	public static void main(String[] args) {
		//Initialization of the files database
		intialization();

		// interactive menu

		mainMenu();
		//String fileName = "file4";
		//list.delete(fileName);
		/*
		System.out.println("Enter file to delete main menu:");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		System.out.println(fileName);
		list.delete(fileName);
		System.out.println(fileName);
		//list.delete(9);
		 */
	}

	private static void mainMenu() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		boolean exist = true;

		while ( exist) {			
			System.out.println("Choose an option:");
			System.out.println("1. Display existing files.");
			System.out.println("2. Add \\ delete \\ search a file.\n");
			System.out.println("6. Exit application.");

			try {
				String option = scanner.nextLine();
				Integer mainOption = Integer.parseInt(option);

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
					throw new ArithmeticException("Invalid choice. Please check the menu options.\n\n");
				}				
			}catch (ArithmeticException e) {
				System.out.println("You have to enter a valid choice (1, 2, 6).\n\n");
			}catch (NumberFormatException  e) {				
				System.out.println("You have to enter a valid number.");
			}catch (Exception  e) {

				System.out.println("An error has occured.\n\n");
				return;
			}finally {System.out.println("\n");}			
		}

		System.out.println("Company Lockers Pvt. Ltd LockedMe.com file management system.\n"
				+ "beta release April 2023.\n"
				+ "Principal developper: Adnane Habib (mailto: adnane_h@yahoo.fr).\n\n");
		scanner.close();// ensuring scanner is closed.			
	}

	private static void displayMessage() 
	{
		// TODO Auto-generated method stub
		System.out.println("\n\n\nGreetings.\n\nCompany Lockers Pvt. Ltd LockedMe.com file management system.\n"
				+ "beta release April 2023.\n"
				+ "Principal developper: Adnane Habib (mailto: adnane_h@yahoo.fr).");
		System.out.println("\nYou have selected option 1, files display.");
		list.display();



	}

	private static void subMenu()
	{
		boolean exist = true;
		System.out.println("\n\n\nYou are now in the submenu.");
		try {		
			Scanner scannerS = new Scanner(System.in);	
			while (exist) {			

				System.out.println("Choose an option:");
				System.out.println("1. Add a file or a set of files.");
				System.out.println("2. Delete a file or a set of files.");
				System.out.println("3. Search for a file or a set of files.\n");
				System.out.println("6. Exit to the main menu.");

				try {
					String option = scannerS.nextLine();
					Integer mainOption = Integer.parseInt(option);

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
						//scannerS.close();
						System.out.println("You are taken back to the main menu.");
						break;

					default:
						throw new ArithmeticException("Invalid choice. Please check the menu options.");
					}				
				}catch (ArithmeticException e) {
					System.out.println("You have to enter a valid choice (1, 2, 6).");
				}catch (NumberFormatException  e) {				
					System.out.println("You have to enter a valid number.");
				}catch (Exception  e) {

					System.out.println("An error has occured.");
					scannerS.close();
					exist = false;
				}finally {System.out.println("\n");}
			}
		}catch (Exception e) {

			return;
		}	
	}

	private static void searchFile() 
	{
		// File search menu
		System.out.println("\nSearch for a file option.");
		boolean exist = true;
		try {		
			Scanner scannerC = new Scanner(System.in);	
			while (exist) {			

				System.out.println("\nEnter the name of the file you are searching for: ");

				try {
					String fileName = scannerC.nextLine();
					//System.out.println("File to delete is "+fileName);
					list.search(fileName);
				}catch (Exception  e) {
					System.out.println("An error has occured.");
					exist = false;
				}finally {}
				System.out.println("Do you want to search for another file: (Y\\N)");
				try {
					String decision = scannerC.nextLine();
					if (decision.toLowerCase().compareTo("y")==0 || decision.toLowerCase().compareTo("yes")==0) {
						continue;
					}else {
						//scannerD.close();
						exist = false;
					}
				}catch (Exception  e) {
					System.out.println("An error has occured.");

					exist = false;
				}finally {System.out.println("\n");}
			}

		}catch (Exception e) {
			return ;
		}
	}

	private static void deleteFile() 
	{
		// File deletion menu
		System.out.println("\nDelete file option.");
		boolean exist = true;
		try {		
			Scanner scannerD = new Scanner(System.in);	
			while (exist) {			

				System.out.println("\nEnter the name of the file you wish to delete: ");

				try {
					String fileName = scannerD.nextLine();
					//System.out.println("File to delete is "+fileName);
					list.delete(fileName);
				}catch (Exception  e) {
					System.out.println("An error has occured.");
					exist = false;
				}finally {}
				System.out.println("Do you want to delete another file: (Y\\N)");
				try {
					String decision = scannerD.nextLine();
					if (decision.toLowerCase().compareTo("y")==0 || decision.toLowerCase().compareTo("yes")==0) {
						continue;
					}else {
						//scannerD.close();
						exist = false;
					}
				}catch (Exception  e) {
					System.out.println("An error has occured.");

					exist = false;
				}finally {System.out.println("\n");}
			}

		}catch (Exception e) {
			return ;
		}	
	}

	private static void addFile() 
	{
		// File deletion menu
		System.out.println("\nAdd file option.");
		boolean exist = true;
		boolean overWrite = false;
		try {		
			Scanner scannerA = new Scanner(System.in);	
			while (exist) {			

				System.out.println("\nEnter the name of the file you wish to add: ");

				try {
					String fileName = scannerA.nextLine();
					//System.out.println("File to add is "+fileName);
					for (String element : list.listofFiles()) {
						if (element.compareTo(fileName)==0) {
							System.out.println("A similar file with the same name already exist.\n"
									+ "Try to rename your file.");
							overWrite = true;
							break;
						}
						overWrite = false;
					}
					if (!overWrite) {
						list.append(fileName);
					}
				}catch (Exception  e) {
					System.out.println("An error has occured.");
					exist = false;
				}finally {}
				System.out.println("Do you want to add another file: (Y\\N)");
				try {
					String decision = scannerA.nextLine();
					if (decision.toLowerCase().compareTo("y")==0 || decision.toLowerCase().compareTo("yes")==0) {
						continue;
					}else {
						//scannerA.close();
						exist = false;
					}
				}catch (Exception  e) {
					System.out.println("An error has occured.");
					//scannerA.close();
					exist = false;
				}finally {System.out.println("\n");}
			}

		}catch (Exception e) {
			return ;
		}	
	}

	private static void intialization() 
	{		



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
		//list.display();
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
