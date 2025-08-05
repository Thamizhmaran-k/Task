package oop;

import java.util.ArrayList;

public class Library {
	private Book[] books;
	private int count;
	
	public Library() {
	this.books = new Book[5];
	count = 0;
	}
	
	public void addBook(Book book) {
	    if(count< books.length) {
	       books[count] = book;
	       count++;
	       System.out.println("Book added successfully.");
	    }
	    else {
	    	System.out.println("Libray is full. cannot add more books. ");
	    	return;
	    }
	   
	}
	public void replaceBook(int bookID, Book newBook) {
		for(int i = 0; i<count; i++) {
			if (books[i].getBookID() == bookID) {
			    books[i] = newBook;
				System.out.println("Book replaced successfully. ");
				return;
			}
		}
		System.out.println("Book ID not found. ");
	}
		
		public void displayBooks() {
			for(int i = 0; i<count; i++) {
				System.out.println(i);
			}
		}
		public  Book searchBook(int bookID) {
			for(int i = 0; i<count; i++) {
			if(books[i].getBookID() == bookID){
				return books[i];
			}
		}
			return null;
		}
		public void removeBook(int bookID) {
			for(int i = 0; i<count; i++) {
				if(books[i].getBookID() == bookID) {
					for(int j = i; j<count-1; j++) {
						books[j] = books[j+1];
					}
					books[count-1] = null;
					count--;
					System.out.println("Book removed successfully. ");
					return;
					
				}		
			}
			System.out.println("Book ID not found. ");
	}
}