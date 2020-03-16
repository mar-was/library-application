package marwas.libraryapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import marwas.libraryapplication.book.Book;

public class MenuServiceImpl implements MenuService {
	List<Book> books = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	private int userChoice;
	
	@Override
	public void showMenu() {
		while(userChoice!=5) {
			System.out.println("Please select from menu:");
			System.out.println("1.Add book");
			System.out.println("2.Remove book");
			System.out.println("3.Save books list");
			System.out.println("4.Show books list");
			System.out.println("5.Exit application");
			
			int userChoice = scanner.nextInt();
			
			switch(userChoice) {
			case 1:
				addBook();
				break;
			case 2:
				removeBook();
				break;
			case 3:
				saveBooksList();
				break;
			case 4:
				readBooksList();
				break;
			case 5:
				System.exit(0);
			}
		}
	}
	
	@Override
	public void addBook() {
		Book book = getBookFromUserInput();
		
		if(!books.contains(book)) {
			books.add(book);
			System.out.println("Book added to the list.");
		} else {
			System.out.println("Book not added! List already contains this book.");
		}
	}
	
	@Override
	public void removeBook() {
		Book book = getBookFromUserInput();
		
		if(books.contains(book)) {
			books.remove(book);
			System.out.println("Book removed from the list.");
		} else {
			System.out.println("Book not removed! It was not the list.");
		}
	}

	@Override
	public void saveBooksList() {
		System.out.println("Saving books");
	}

	@Override
	public void readBooksList() {
		System.out.println("Please see the list of books below: ");
		books.stream().forEach((book)->System.out.println(book));
		System.out.println();
	}
	
	public Book getBookFromUserInput() {
		System.out.println("Please provide the title of the book: ");
		scanner.nextLine();
		String title = scanner.nextLine();
		
		System.out.println("Please provide an author of the book: ");
		String author = scanner.nextLine();
		
		return new Book(title,author);
	}
}
