package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String publisherName;
    private String addressLine;
    private String city;
    private String state;
    private int zip;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher() {
    }

    public Publisher(String publisherName, String addressLine, String city, String state, int zip) {
        this.publisherName = publisherName;
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getPublisher() {
        return publisherName;
    }

    public void setPublisher(String publisherName) {
        this.publisherName = publisherName;
    }

}
