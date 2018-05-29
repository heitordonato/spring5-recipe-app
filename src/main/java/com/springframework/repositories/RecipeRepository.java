package com.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
