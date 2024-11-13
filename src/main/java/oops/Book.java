package oops;

public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalNoOfBooks = 0;
    }
    { //Object init
        totalNoOfBooks++;
    }

    Book(String isbn ,String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){

        this(isbn,"unknown","unknown");
    }
    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed =true;
            System.out.println("Enjoy the book " +this.title);
        }

    }

    public void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, please leave a review for " +this.title);
        }else {
            System.out.println("This book is already in the library");
        }

    }

    public static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    public static void main(String[] args) {
        Book investorEdge = new Book("001","Chanakya of Stock market","Neil");
        Book novelBook = new Book("0022");
        System.out.println(Book.getTotalNoOfBooks());
        investorEdge.borrowBook();
        novelBook.borrowBook();
        investorEdge.borrowBook();
        investorEdge.returnBook();
        novelBook.returnBook();
        investorEdge.returnBook();
    }
}

