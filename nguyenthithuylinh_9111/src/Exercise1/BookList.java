package Exercise1;

import java.util.ArrayList;

class BookList {

   private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book updateBook(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    public boolean deleteBook(String bookId) {
        Book book = updateBook(bookId);
        if (book != null) {
            books.remove(book);
            return true;
        }
        return false;
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBook();
                System.out.println("--------------");
            }
        }
    }
}
