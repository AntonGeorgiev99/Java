import java.util.ArrayList;

public class HW {
	
		public static void main(String[] args) {

	 class Library {
		
		public String nameLibrary;
		public String nameBook;
		public  ArrayList<Books> books = new ArrayList<>();
		
		public Library(String nameLibrary) {
			this.nameLibrary=nameLibrary;
			this.books= new ArrayList<Books>();
		}
		class Books {
			String titleBook;
			String autorBook;
			String pubhouseBook;
			int yearBook;
			int isbnBook;
			
			public Books(String titleBook, String autorBook, String pubhouseBook, int yearBook, int isbnBook) {
				this.titleBook=titleBook;
				this.autorBook=autorBook;
				this.pubhouseBook=pubhouseBook;
				this.yearBook=yearBook;
				this.isbnBook=isbnBook;
			}

			public void add(Books books) {
				books.add(books);
				// TODO Auto-generated method stub
				
			}

		}
		public Library(String nameLibrary, String nameBook) {
			this.nameLibrary=nameLibrary;
			this.nameBook=nameBook;
		}
		public void addBooks(Books book) {
			books.addAll(books);
			System.out.println("Book is added");
		}
		public ArrayList<Books> getBooks() {
			return books;
		}

		public void setBooks(ArrayList<Books> books) {
			this.books = books;
		}

		public String getNameLibrary() {
			return nameLibrary;
		}

		public void setNameLibrary(String nameLibrary) {
			this.nameLibrary = nameLibrary;
		}

		public String getNameBook() {
			return nameBook;
		}

		public void setNameBook(String nameBook) {
			this.nameBook = nameBook;
		}
		
		
		}
		
		
	}
	 
	 
	 
		

		}
	


