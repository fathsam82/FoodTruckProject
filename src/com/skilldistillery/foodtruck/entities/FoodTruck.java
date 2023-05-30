package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int currentNumberOfTrucks;
	private int id;
	private String foodTruckName;
	private String foodItems;
	private int rating;

	public FoodTruck(String foodTruckName, String foodItems, int rating) {
		this.foodTruckName = foodTruckName;
		this.foodItems = foodItems;
		this.rating = rating;

		FoodTruck.currentNumberOfTrucks++;
		id = FoodTruck.currentNumberOfTrucks;
	}
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String foodItems) {
		this.foodItems = foodItems;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
		@Override
	public String toString() {
		return  "Name of food truck [" + foodTruckName + "], id of food truck " + id + " Type of food items [ " + foodItems
				+ "], Food truck's rating [ " + rating + "]";
	}

	

}