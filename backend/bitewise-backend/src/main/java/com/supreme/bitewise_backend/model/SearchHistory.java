package com.supreme.bitewise_backend.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "searchHistory")
public class SearchHistory {

    @Id
    private String id;
    private List<String> ingredients;
    private LocalDateTime createdAt;

    SearchHistory() {
        createdAt = LocalDateTime.now();
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
