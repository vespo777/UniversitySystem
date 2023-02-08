package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.*;
import university.*;

public class LibrarianMenu extends Menu{
	private static final long serialVersionUID = 1L;

	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
	
	public LibrarianMenu() {
		super();
	}

	public LibrarianMenu(Librarian user) {
		super(user);
	}
	
	public void exit() throws Exception {
		System.out.println("\n\n\n\n\n\n");
		MainMenu.getMainMenu().displayMenu();
		MainMenu.getMainMenu().enterToTheSystem();
	
	}
	
	@Override
	public void displayMenu() {
		System.out.println("***********************Desktop***********************");
		System.out.println("=====================================================");
		System.out.println("           1.Lend Book                               ");
		System.out.println("           2.Get Book Back                           ");
		System.out.println("           3.Add Book                                ");
		System.out.println("           4.Personal info                           ");
		System.out.println("           5.News                                    ");
		System.out.println("           6.View Active Logs                        ");
		System.out.println("           7.View Book Debts                         ");
		System.out.println("           8.View Book Borrowers                     ");
		System.out.println("=====================================================");
	}
	
	public CanBorrowBook getBorrower() throws NumberFormatException, IOException {
		int ind = 1;
		System.out.println("Enter book borrower : ");
        for(User u : UniSystem.getDatabase().getCanBorrowBook()) {
          System.out.println(ind++ + ". " + u.getName() + " " + u.getSurname());
        }
        int borrowerId = Integer.parseInt(inp.readLine());
        CanBorrowBook borrower = (CanBorrowBook) UniSystem.getDatabase().getCanBorrowBook().get(borrowerId-1);
        return borrower;
	}
	
	public Book getBookByTitle() throws IOException{
		System.out.println("Enter book title : ");
        String bookTitle = inp.readLine();
        Book bookFound = ((Librarian)user).getBook(bookTitle);
        return bookFound;
	}
	
	public Date getDate() throws IOException {
		Date date = null;
		boolean inputOk = false;
		while (!inputOk) {
			String dateStr = inp.readLine().strip();
			try {
				date = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
				inputOk = true;
				return date;
			} catch (ParseException e) {
				System.out.println("Invalid date format! Please follow the format: dd/MM/yyyy");
				dateStr = inp.readLine().strip();
			}  
		}
		return date;
	}
	
	public void lendBook() throws NumberFormatException, IOException{
        CanBorrowBook borrower = getBorrower();
        Book bookFound = getBookByTitle();
        System.out.println("Enter borrow date : dd/mm/yyyy");
        Date borrowDate = getDate();
        LibraryRecord libRec = new LibraryRecord(borrower, bookFound, borrowDate);
        if (RecordBook.getInstance().addRecord(libRec)) {
        		System.out.println("New log has successfully been added.");
        	} else {
        		System.out.println("Error adding a new log!");
        	}
		} 
		
	public void addBook() throws NumberFormatException, IOException {
		System.out.println("Enter book title : ");
        String bookTitle = inp.readLine();
        
        System.out.println("Enter book author : ");
        String bookAuthor = inp.readLine();
        
        Book book = new Book(bookTitle, bookAuthor);
        System.out.println("Enter book quantity : ");
        
        int quantity = Integer.parseInt(inp.readLine());
        ((Librarian)user).addBook(book, quantity);
	}
	
	public void viewBookDebts() throws IOException {
		System.out.println("Enter due date : dd/mm/yyyy");
		Date dueDate = getDate();
		RecordBook.getInstance().printBookDebtors(dueDate);
	}
	
	public void viewBookBorrowers() throws IOException {
		Book borrowedBook = getBookByTitle();
		if (borrowedBook != null) {
			RecordBook.getInstance().printBookBorrowers(borrowedBook);
		}
	}
	
	public void printAllLogs() {
		if (!RecordBook.getInstance().getRecordBook().isEmpty()) {
			RecordBook.getInstance().printAllLogs();
		}
	}
	
	@Override
	public void action() throws NumberFormatException, IOException{
		while (true) {
			displayMenu();
			System.out.print("Enter Your Choice:\n");
			int ch = Integer.parseInt(inp.readLine());
			switch (ch) {
			case 1:
				lendBook();
			case 2:
				
			case 3:
				addBook();
			case 4:
				
			case 5:
				
			case 6:
				printAllLogs();
			case 7:
				viewBookDebts();
			case 8:
				viewBookBorrowers();
			}
			
		}
	}

}
