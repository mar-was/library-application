package marwas.libraryapplication.service;

import marwas.libraryapplication.aop.ExecutionTimeLogging;

public interface MenuService {
	public void showMenu();
	public void addBook();
	public void removeBook();
	public void saveBooksList();
	public void readBooksList();
}
