public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Novel", false);

        book1.title = "Programación Orientada a Objetos";
        book3.getBook();
        book3.returnBook();
        book3.getBook();
        book3.getBook();

        System.out.println("Book 1 Information:");
        book1.showInfo();
        System.out.println();
        System.out.println("Book 2 Information:");
        book2.showInfo();
        System.out.println();
        System.out.println("Book 3 Information:");
        book3.showInfo();



       

    
    }

}
