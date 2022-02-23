package ru.skypro;

public class Book {
    private final String publisherName;
    private final Author authorName;
    private int publishingYear;

    public Book(String publisherName, Author authorName, int publishingYear) {
        this.publisherName = publisherName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Название книги:" + this.publisherName + "; Имя и Фамилия автора:" + this.authorName + "; год издания:" + this.publishingYear + ".";
    }
}
