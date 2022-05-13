public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public Book(String title) {
        this.title = title;
    }
    public Book(int pages, int year) {
        this.pages = pages;
        this.year = year;
    }
    public Book(int year) {
        this.year = year;
    }
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public Book() {

    }
    public String getTitle() {
        return this.title;
    }
    public int getPages() {
        return this.pages;
    }
    public int getYear() {
        return this.year;
    }

    public String toString(String answer) {
        System.out.print("What information will be printed?");
        String message = null;
        if (answer.equalsIgnoreCase("everything")) {
            message = "The title of the book is " + getTitle() + ".\nThe amount of pages is " + getPages() +".\nThe publication year is " + getYear() + ".";
        }
        else if (answer.equalsIgnoreCase("name")) {

            message = "The title of the books are " + getTitle() + ".";
        }
        return message;
    }

    public static void main(String[] args) {
        Book catInHat = new Book("The Cat In The Hat", 20, 1990);
        Book daVinci = new Book("The Da Vinci Code", 578, 2010);
        Book harryPotter = new Book("Harry Potter", 999, 2005);
    }
}