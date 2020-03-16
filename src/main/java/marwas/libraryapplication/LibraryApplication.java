package marwas.libraryapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import marwas.libraryapplication.service.MenuService;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("menuService")
	MenuService menuServiceImpl;

	private static Logger LOGGER = LoggerFactory.getLogger(LibraryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class);
	}

	@Override
	public void run(String... args) throws Exception {
		menuServiceImpl.showMenu();
	}
}