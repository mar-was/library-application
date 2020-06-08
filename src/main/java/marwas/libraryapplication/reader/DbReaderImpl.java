package marwas.libraryapplication.reader;

import java.util.List;

import marwas.libraryapplication.aop.ExecutionTimeLogging;
import marwas.libraryapplication.book.Book;

public class DbReaderImpl implements LibraryReader {

	@Override
	@ExecutionTimeLogging
	public List<Book> readData() {
		return null;
	}
}
