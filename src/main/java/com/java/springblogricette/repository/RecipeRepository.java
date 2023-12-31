package com.java.springblogricette.repository;

import com.java.springblogricette.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    List<Recipe> findByNameContaining(String nameSearch);

}
