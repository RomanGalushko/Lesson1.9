package ru.skypro;

public class Main {

    public static void main(String[] args) {

//Task1
        Author firstAuthor = new Author(" Tom"," DeMarco");
        Author secondAuthor = new Author(" Лев", " Толстой");

        Book firstBook = new Book(" Deadline", firstAuthor, 1997);
        Book secondBook = new Book(" Война и мир", secondAuthor, 1865);

        System.out.println("firstBook = " + firstBook);
        System.out.println("secondBook = " + secondBook + "\n");

        secondBook.setPublishingYear(1869);
        System.out.println("secondBook = " + secondBook + "\n");


//Task2

        Book[] books = {firstBook, secondBook};
        for (int i = 0; i < books.length - 1; i++) {
            Book oneOfBooks = books[i];
            Book secondOfBooks = books[i + 1];

            System.out.println("Book1 = " + oneOfBooks + "\n" + "Book2 = " + secondOfBooks + "\n");
        }

//Task3

    }

}