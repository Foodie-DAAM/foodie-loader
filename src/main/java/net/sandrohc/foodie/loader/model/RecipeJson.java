/*
 * Copyright (c) 2020. Authored by SandroHc
 */

package net.sandrohc.foodie.loader.model;

import java.util.Collection;

public class RecipeJson {

	private String url;
	private String title;
	private String description;
	private Collection<String> ingredients;
	private Collection<String> instructions;
	private int total_time;
	private String yields;
	private String picture;
	private String nutrition_facts;

	public RecipeJson() {
	}

	public RecipeJson(String url, String title, String description, Collection<String> ingredients, Collection<String> instructions, int total_time, String yields, String picture, String nutrition_facts) {
		this.url = url;
		this.title = title;
		this.description = description;
		this.ingredients = ingredients;
		this.instructions = instructions;
		this.total_time = total_time;
		this.yields = yields;
		this.picture = picture;
		this.nutrition_facts = nutrition_facts;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Collection<String> ingredients) {
		this.ingredients = ingredients;
	}

	public Collection<String> getInstructions() {
		return instructions;
	}

	public void setInstructions(Collection<String> instructions) {
		this.instructions = instructions;
	}

	public int getTotal_time() {
		return total_time;
	}

	public void setTotal_time(int total_time) {
		this.total_time = total_time;
	}

	public String getYields() {
		return yields;
	}

	public void setYields(String yields) {
		this.yields = yields;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getNutrition_facts() {
		return nutrition_facts;
	}

	public void setNutrition_facts(String nutrition_facts) {
		this.nutrition_facts = nutrition_facts;
	}

	@Override
	public String toString() {
		return "Recipe[title='" + title + "']";
	}
}
