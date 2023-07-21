package com.example.cardapio.food;

public record FoodResponseDTO(Long id, String title, String Image) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage());
    }

}
