package com.java.class39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTrickyExample {
	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<>();
		Map<String, List<String>> foodIngredients = new HashMap<>();

		ingredients.add("Raw rice");
		ingredients.add("Water");
		ingredients.add("Air");
		foodIngredients.put("Boiled Rice", ingredients);

		ingredients = new ArrayList<>();

		ingredients.add("Vegetable");
		ingredients.add("Oil");
		ingredients.add("Water");
		foodIngredients.put("Vegetable curry", ingredients);
	}
}





