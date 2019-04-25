package com.thiagomuller.PraticingHibernate.Model;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "content")
    private String content;

    @OneToOne(mappedBy = "comment", cascade = CascadeType.ALL)
    private Author author;

    public Comment(){}

    public Comment(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Id=" + Id +
                ", content='" + content + '\'' +
                '}';
    }
}
