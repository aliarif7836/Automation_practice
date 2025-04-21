public class constExam {
    public static void main(String[] args) {
        Book b1 = new Book("Hindi","test author",100);
        Book b2 = new Book("Maths","RD Sharma",500);
        b1.getSummary();
        b2.getSummary();


    }
}

class Book{
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void getSummary(){
        System.out.println("Book name "+title);
        System.out.println("Book author "+author);
        System.out.println("Book page "+pages);
    }

}
