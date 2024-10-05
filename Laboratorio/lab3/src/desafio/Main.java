package desafio;


public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Pepito grillo");

        author1.addBook(new Book("Salud en la manaña", author1, 70.34));
        author1.addBook("Suciedad en el pueblo", 25.76);

        for (Book book : author1.getBooks()) {
            System.out.println(book.getInfo());
        }
    }
}
