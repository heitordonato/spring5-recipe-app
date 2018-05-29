package com.springframework.services;

import java.util.Set;

import com.springframework.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}
