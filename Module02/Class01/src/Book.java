public class Book {
    String title;
    String author;
    int year;
    String gender;
    boolean isBusy;

    public Book () {
        title = "Sin titulo";
        author = "N/A";
        year = 0;
        gender = "N/A";
        isBusy = false;
    }

    public Book (String title, String author,int year, String gender, boolean isBusy) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = isBusy;
    }
}   
