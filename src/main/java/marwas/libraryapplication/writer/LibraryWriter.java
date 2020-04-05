package marwas.libraryapplication.writer;

import java.util.List;

import marwas.libraryapplication.book.Book;

public interface LibraryWriter {
	public void saveList(List<Book> books);
}
