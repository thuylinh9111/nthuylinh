package Exercise1;

import java.util.Date;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public void displayBook() {
        System.out.println("ReferenceBook ID: " + bookId);
        System.out.println("Publisher: " + publisher);
        System.out.println("Entry Date: " + entryDate);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Tax: " + tax);
    }
}
