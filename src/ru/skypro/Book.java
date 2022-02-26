package ru.skypro;

import java.util.Objects;

public class Book {
    private final String publisherName;
    private final Author author;
    private int publishingYear;

    public Book(String publisherName, Author author, int publishingYear) {
        this.publisherName = publisherName;
        this.author = author;
        this.publishingYear = publishingYear;

    }

    public String getPublisherName() {
        return this.publisherName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(publisherName, book.publisherName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherName, author, publishingYear);
    }

    @Override
    public String toString() {
        return "Название книги: " + this.publisherName + "; " + "Имя и фамилия писателя: " + this.author + "; " + "Год издания: " + this.publishingYear + ".";
    }
}
