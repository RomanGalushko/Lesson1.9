package ru.skypro;

import java.util.Objects;

public class Author {
    private final String firstNameAuthor;
    private final String lastNameAuthor;

    public Author (String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return  this.lastNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstNameAuthor, author.firstNameAuthor) && Objects.equals(lastNameAuthor, author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }

    @Override
    public String toString() {
        return this.firstNameAuthor + this.lastNameAuthor;
    }
}
