package oop;

import java.util.Scanner;
public class BookManagementSystem {
	public static void main(String args[]) {
		        Library library = new Library();
		        Scanner scan = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("\n--- Library Menu ---");
		            System.out.println("1. Add Book");
		            System.out.println("2. Replace Book");
		            System.out.println("3. Remove Book");
		            System.out.println("4. Search Book");
		            System.out.println("5. Display All Books");
		            System.out.println("6. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scan.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Book ID: ");
		                    int id = scan.nextInt();
		                    scan.nextLine(); // consume newline
		                    System.out.print("Enter Title: ");
		                    String title = scan.nextLine();
		                    System.out.print("Enter Author: ");
		                    String author = scan.nextLine();
		                    System.out.print("Is Available (true/false): ");
		                    boolean isAvailable = scan.nextBoolean();
		                    Book book = new Book(id, title, author, isAvailable);
		                    library.addBook(book);
		                    break;

		                case 2:
		                    System.out.print("Enter Book ID to replace: ");
		                    int replaceID = scan.nextInt();
		                    scan.nextLine();
		                    System.out.print("Enter New Title: ");
		                    String newTitle = scan.nextLine();
		                    System.out.print("Enter New Author: ");
		                    String newAuthor = scan.nextLine();
		                    System.out.print("Is Available (true/false): ");
		                    boolean newAvailability = scan.nextBoolean();
		                    Book newBook = new Book(replaceID, newTitle, newAuthor, newAvailability);
		                    library.replaceBook(replaceID, newBook);
		                    break;

		                case 3:
		                    System.out.print("Enter Book ID to remove: ");
		                    int removeID = scan.nextInt();
		                    library.removeBook(removeID);
		                    break;

		                case 4:
		                    System.out.print("Enter Book ID to search: ");
		                    int searchID = scan.nextInt();
		                    Book foundBook = library.searchBook(searchID);
		                    if (foundBook != null)
		                        System.out.println("Book Found: " + foundBook);
		                    else
		                        System.out.println("Book not found.");
		                    break;

		                case 5:
		                    System.out.println("All Books:");
		                    library.displayBooks();
		                    break;

		                case 6:
		                    System.out.println("Exiting system.");
		                    break;

		                default:
		                    System.out.println("Invalid choice.");
		            }
		        } while (choice != 6);

		        scan.close();
		    }
		}
	
