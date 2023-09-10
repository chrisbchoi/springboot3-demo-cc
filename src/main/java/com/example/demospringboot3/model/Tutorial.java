package com.example.demospringboot3.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Table(name = "tutorials")
@Getter @Setter @Data @NoArgsConstructor
public class Tutorial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 0;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "published")
    private boolean published;

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}
