package classes;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	Scanner scp = new Scanner(System.in);
	Scanner scb = new Scanner(System.in);
	Scanner scl = new Scanner(System.in);
	Scanner scu = new Scanner(System.in);
	Library l = new Library();
	
	public void showMenuP() throws SQLException {
	boolean salir = false;
	int optionP = 0;
	int optionB = 0;
	int optionL = 0;
	int optionU = 0;
	
	System.out.println("**** MENU ****");
	System.out.println("Select 1 to enter to the books menu. ");
	System.out.println("Select 2 to enter to the loans menu. ");
	System.out.println("Select 3 to enter to the users menu. ");
	System.out.println("Select 4 to exit. ");
		
		try {
			while(!salir) {
				optionP = scp.nextInt();
				switch(optionP) {
				case 1:
					System.out.println("**** MENU BOOKS ****");
					System.out.println("Select 1 to enter to show all books. ");
					System.out.println("Select 2 to display the details of a book. ");
					System.out.println("Select 3 to create a book. ");
					System.out.println("Select 4 to delete a book. ");
					System.out.println("Select 5 to search for a book by title. ");
					System.out.println("Select 6 to search for a book by author. ");
					optionB = scb.nextInt();
						switch(optionB) {
						case 1:
							l.showAllBooks();
							break;
						case 2:
							l.showABook();
							break;
						case 3:
							System.out.println("Introduce the title: ");
			            	String title = scp.next();
			            	System.out.println("Introduce the description: ");
			            	String description = scp.next();
			            	System.out.println("Introduce the number of sheets: ");
			            	int num_sheets = scp.nextInt();
			            	System.out.println("Introduce the isbn: ");
			            	String isbn = scp.next();
			            	System.out.println("Introduce the editorial: ");
			            	String editorial = scp.next();
			            	System.out.println("Introduce the edition:");
			            	int edition = scp.nextInt();
			            	System.out.println("Introduce the year of publication: ");  
			            	int year = scp.nextInt();
			            	System.out.println("Introduce the month of publication: ");   
			                int month = scp.nextInt();
			            	System.out.println("Introduce the day of publication: ");   
			            	int day = scp.nextInt();        
			            	System.out.println("Introduce the id of author: ");
			            	int id_author = scp.nextInt();
			            	System.out.println("Introduce the id of the instance: ");
			            	int id_instance = scp.nextInt();
			            	l.createBook(title, description, num_sheets, isbn, editorial, edition, id_author, id_instance, year, month, day);
			                System.out.println("The book was created.");
			                break;
						case 4:
							l.deleteBook();
							break;
						case 5:
							l.lookForBookT();
							break;
						case 6:
							l.lookForBookA();
							break;
						}
					break;
				case 2:
					System.out.println("**** MENU LOANS ****");
					System.out.println("Select 1 to enter to show all loans. ");
					System.out.println("Select 2 to display the details of a loan. ");
					System.out.println("Select 3 to create a loan. ");
					optionL = scb.nextInt();
						switch(optionL) {
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						}	
					break;
				case 3:
					System.out.println("**** MENU USERS ****");
					System.out.println("Select 1 to enter to show all users. ");
					System.out.println("Select 2 to display the details of a user. ");
					System.out.println("Select 3 to create a user. ");
					System.out.println("Select 4 to delete a user. ");
					optionU = scb.nextInt();
						switch(optionU) {
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						}	
					break;
				case 4:
					salir = true;
					break;
				default:
					System.out.println("The options have to be between 1 and 4. ");
				}	
			}
		}catch (InputMismatchException e) {
			System.out.println("You need to introduce a number. ");
			scp.nextInt();
		}
		System.out.println("End of menu. ");
	}
}
