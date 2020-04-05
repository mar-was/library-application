package marwas.libraryapplication.writer;

import java.util.List;

import marwas.libraryapplication.aop.ExecutionTimeLogging;
import marwas.libraryapplication.book.Book;

public class CsvFileWriterImpl implements LibraryWriter {

	@Override
	@ExecutionTimeLogging
	public void saveList(List<Book> books) {
		//TODO - change that to Apache Commons CSV
		books.stream()
			.forEach(System.out::println);
	}
}
