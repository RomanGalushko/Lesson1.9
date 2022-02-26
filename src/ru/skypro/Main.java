package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Tom ","DeMarco");
        Author secondAuthor = new Author("Лев ", "Толстой");

        Book firstBook = new Book("Deadline", firstAuthor, 1997);
        Book secondBook = new Book("Война и мир", secondAuthor, 1865);

        System.out.println("firstBook = " + firstBook);
        System.out.println("secondBook = " + secondBook + "\n");

        System.out.println("Изменение года публикации: \n");
        secondBook.setPublishingYear(1869);
        System.out.println("secondBook = " + secondBook + "\n");


        System.out.println("Сравнение для Author: \n");
        Author tomDeMarco = new Author("Tom ", "DeMarco");
        Author tomDeMarco2 = new Author("Tom ", "DeMarco");
        Author levTolstoy = new Author("Лев ", "Толстой");
        System.out.println("Author copies equals: " + tomDeMarco.equals(tomDeMarco2));
        System.out.println("Author copies equals by hashCode: " + (tomDeMarco.hashCode() == tomDeMarco2.hashCode()));
        System.out.println("Author copies equals: " + tomDeMarco2.equals(levTolstoy) + "\n");


        System.out.println("Сравнение для Book: \n");
        Book tomDeMarcoBook = new Book("Deadline", new Author("Tom", "DeMarco"), 1997);
        Book levTolstoyBook = new Book("Война и мир", new Author("Лев", "Тольстой"), 1865);
        Book levTolstoyBook2 = new Book("Война и мир", new Author("Лев", "Тольстой"), 1869);
        System.out.println("Book copies equals: " + tomDeMarcoBook.equals(levTolstoyBook));
        System.out.println("Book copies equals: " + tomDeMarcoBook.equals(levTolstoyBook2));
        System.out.println("Book copies equals by hashCode: " + (levTolstoyBook.hashCode() == levTolstoyBook2.hashCode()));

    }
}