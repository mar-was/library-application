package marwas.libraryapplication.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import marwas.libraryapplication.service.MenuServiceImpl;
import marwas.libraryapplication.writer.CsvFileWriterImpl;
import marwas.libraryapplication.writer.LibraryWriter;

@Configuration
public class AppConfig {
	
	@Bean
	@Qualifier("menuService")
	public marwas.libraryapplication.service.MenuService menuServiceImpl() {
		return new MenuServiceImpl();
	}
	
	@Bean
	public LibraryWriter csvLibraryWriter() {
		return new CsvFileWriterImpl();
	}
}
