package jpabook.jpashop.domain.item;

import jpabook.jpashop.web.BookForm;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@Getter
@Setter
public class Book extends Item {

    private String author;
    private String isbn;

    public void createBook(BookForm bookForm) {
        super.createItem(bookForm.getName(), bookForm.getPrice(), bookForm.getStockQuantity());
        this.author = bookForm.getAuthor();
        this.isbn = bookForm.getIsbn();
    }

    public void createBook(String name, int price, int stockQuantity, String author, String isbn) {
        super.createItem(name, price, stockQuantity);
        this.author = author;
        this.isbn = isbn;
    }
}