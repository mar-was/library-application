package marwas.libraryapplication.writer;

import java.util.List;

import marwas.libraryapplication.aop.ExecutionTimeLogging;
import marwas.libraryapplication.book.Book;

public class DbWriterImpl implements LibraryWriter {

	@Override
	@ExecutionTimeLogging
	public void saveList(List<Book> books) {
	}
}
