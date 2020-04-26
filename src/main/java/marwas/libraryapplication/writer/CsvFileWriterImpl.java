package marwas.libraryapplication.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import marwas.libraryapplication.aop.ExecutionTimeLogging;
import marwas.libraryapplication.book.Book;
import marwas.libraryapplication.helper.DateGenerator;

public class CsvFileWriterImpl implements LibraryWriter {
	private static final Logger LOGGER = LoggerFactory.getLogger(CsvFileWriterImpl.class);
	private static final String CSV_FILE_PATH = "List-of-books-" +
												DateGenerator.getDateString() + ".csv";

	@Override
	@ExecutionTimeLogging
	public void saveList(List<Book> books) {
		try {
			BufferedWriter bufferedWriter =
					Files.newBufferedWriter(Paths.get(CSV_FILE_PATH));
			CSVPrinter csvPrinter =
					new CSVPrinter(bufferedWriter, CSVFormat.DEFAULT);
			
			for(Book book : books) {
				csvPrinter.printRecord(book.getAuthor(),book.getTitle());
			}
			csvPrinter.flush();
		} catch (IOException e) {
			LOGGER.error("Cannot create a CSV file! Error is: " + e.getMessage());
		} 
	}
}
