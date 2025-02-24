package Exercise1;

import java.util.Scanner;
import java.util.Date;

class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();

        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Update book");
            System.out.println("3. Delete book");
            System.out.println("4. Find book");
            System.out.println("5. Display all");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook(scanner, bookList);
                    break;
                case 2:
                    updateBook(scanner, bookList);
                    break;
                case 3:
                    deleteBook(scanner, bookList);
                    break;
                case 4:
                    findBook(scanner, bookList);
                    break;
                case 5:
                    bookList.displayBooks();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
            }
        }
    }

    private static void addBook(Scanner scanner, BookList bookList) {
        System.out.print("Book type (1-Textbook, 2-Reference): ");
        int type = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Book ID: ");
        String bookId = scanner.nextLine();
        System.out.print("Pulisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Date(yyyy/MM/dd: ");
        Date entryDate = new Date(scanner.nextLine());
        System.out.print("Unit price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Quantity: ");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        if (type == 1) {
            System.out.print("Status: ");
            bookList.addBook(new TextBook(bookId, publisher, entryDate, unitPrice, quantity, scanner.nextLine()));
        } else {
            System.out.print("Tax: ");
            bookList.addBook(new ReferenceBook(bookId, publisher, entryDate, unitPrice, quantity, scanner.nextDouble()));
        }
    }

    private static void updateBook(Scanner scanner, BookList bookList) {
        System.out.print("Enter book ID to update: ");
        String bookId = scanner.nextLine();
        Book book = bookList.updateBook(bookId);
        if (book != null) {
            book.displayBook();
            System.out.print("New Publisher: ");
            book.setPublisher(scanner.nextLine());
        }
    }

    private static void deleteBook(Scanner scanner, BookList bookList) {
        System.out.print("Enter book ID to delete: ");
        if (bookList.deleteBook(scanner.nextLine())) {
            System.out.println("Book deleted.");
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void findBook(Scanner scanner, BookList bookList) {
        System.out.print("Enter book ID to find: ");
        Book book = bookList.updateBook(scanner.nextLine());
        if (book != null) {
            book.displayBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}
