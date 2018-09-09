package com.springframework.services;

import java.util.Set;

import com.springframework.commands.RecipeCommand;
import com.springframework.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
	
	Recipe findById(Long id);
	
	RecipeCommand findCommandById(Long id);

	RecipeCommand saveRecipeCommand(RecipeCommand command);
	
	void deleteById(Long idToDelete);
}
