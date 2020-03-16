package marwas.libraryapplication.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import marwas.libraryapplication.book.Book;

@RestController
public class LibraryController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book("Ksi��ka","Marcin"));
	}
}
