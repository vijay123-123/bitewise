package com.supreme.bitewise_backend.controller;

import com.supreme.bitewise_backend.dto.IngredientsRequest;
import com.supreme.bitewise_backend.service.RecipeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {

    private final RecipeService service;

    RecipeController(RecipeService service) {
        this.service = service;
    }

    @PostMapping("/ingredients")
    String getRecipes(@RequestBody IngredientsRequest ingredients) {
        service.suggestRecipes(ingredients);
        return "ingredients send";
    }
}
