/*
package com.zeta.spotlight.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class BookPublisher {

    @Embeddable
    public static class BookPublisherId implements Serializable {

        @Column(name = "fk_book")
        protected Integer bookId;

        @Column(name = "fk_publisher")
        protected Integer publisherId;

        public BookPublisherId() {
        }

        public BookPublisherId(Integer bookId, Integer publisherId) {
            this.bookId = bookId;
            this.publisherId = publisherId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BookPublisherId)) return false;
            BookPublisherId that = (BookPublisherId) o;
            return bookId.equals(that.bookId) &&
                    publisherId.equals(that.publisherId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bookId, publisherId);
        }
    }

    @EmbeddedId
    private BookPublisherId bookPublisherId;

    @ManyToOne
    @JoinColumn(name = "fk_book", insertable = false, updatable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "fk_publisher", insertable = false, updatable = false)
    private Publisher publisher;

    private String metaData;

    public BookPublisher() {
    }

    public BookPublisher(Book book, Publisher publisher, String metaData) {
        this.book = book;
        this.publisher = publisher;
        this.metaData = metaData;
    }
}
*/
