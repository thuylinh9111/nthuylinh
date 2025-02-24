package Exercise1;

import java.util.Date;

abstract class Book {
    protected String bookId;
    protected String publisher;
    protected Date entryDate;
    protected double unitPrice;
    protected double quantity;

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public abstract void displayBook();
}