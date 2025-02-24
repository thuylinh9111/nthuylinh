package Exercise1;

import java.util.Date;

public class TextBook extends Book {

     private String status; 

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void displayBook() {
        System.out.println("TextBook ID: " + bookId);
        System.out.println("Publisher: " + publisher);
        System.out.println("Entry Date: " + entryDate);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Status: " + status);
    }
}
