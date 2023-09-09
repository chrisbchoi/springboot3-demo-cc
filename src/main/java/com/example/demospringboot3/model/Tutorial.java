package com.example.demospringboot3.model;

import lombok.*;

import java.io.Serializable;

@Getter @Setter @Data @NoArgsConstructor
public class Tutorial implements Serializable {
    private long id = 0;
    private String title;
    private String description;
    private boolean published;

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}
