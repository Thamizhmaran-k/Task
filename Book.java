package oop;

public class Book {
	private int bookID;
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(int bookID, String title, String author, boolean isAvailable) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	
	public int getBookID() {return bookID; }
	public String getTitle() {return title; }
	public String getAuthor() {return author; }
	public boolean getisAvailable() {return isAvailable; }
    
	public void setAvailable(boolean available) {
		isAvailable = available;
	}
	public void displayBook() {
		System.out.println("ID: " +bookID +",Title: " +title+ ",Author: "+author+",Available: " +isAvailable);
	}
}
