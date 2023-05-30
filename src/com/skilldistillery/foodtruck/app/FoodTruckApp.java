package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;

import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];
	private int currentNumOfTrucks;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruckApp app = new FoodTruckApp();
		app.run(sc);

	}

	public void run(Scanner sc) {
		boolean appRunning = true;
		boolean finished = false;
		while (appRunning) {
			for (int f = 0; f < 5; f++) {
				System.out.print("Enter the name of the food truck: ");
				String foodTruckName = sc.nextLine();
				if (foodTruckName.equalsIgnoreCase("quit")) {
					finished = true;
					currentNumOfTrucks = f;
					f = 5;
					break;
				}
				System.out.print("Enter the type of food the food truck has: ");
				String foodItems = sc.nextLine();
				System.out.println("Enter the food truck's rating 1-5: ");
				int rating = sc.nextInt();
				sc.nextLine();
				FoodTruck foodtruck = new FoodTruck(foodTruckName, foodItems, rating);
				fleet[f] = foodtruck;
				System.out.println(foodtruck.getFoodTruckName());
				System.out.println(foodtruck.getFoodItems());
				System.out.println(foodtruck.getRating());
				if (f == 4) {
					finished = true;
					currentNumOfTrucks = 5;
				}
			}
			while (finished) {
				userMenu();
				String choice = sc.nextLine();

				switch (choice) {

				case "1":
					listOfAllFoodTrucks(fleet);
					break;
				case "2":
					findAverage(fleet);
					break;
				case "3":
					highestRated(fleet);
					break;
				case "4":
					System.out.println("Exiting program");
					finished = false;
					appRunning = false;
					break;
				default:
					System.out.println("Invalid selection");
				}
			}
		}
	}

	public void findAverage(FoodTruck[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				sum += array[i].getRating();
			}
		}
		double finalSum = (double) sum / currentNumOfTrucks;
		System.out.println("The average of the food trucks' rating is " + finalSum);

	}

	public void listOfAllFoodTrucks(FoodTruck[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println(array[i].toString());
			}
		}
	}

	public void highestRated(FoodTruck[] array) {
		FoodTruck currentHighest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] != null) {
				if (array[i].getRating() > currentHighest.getRating()) {
					currentHighest = array[i];
				}
			}
		}
		System.out.println("The highest rated food truck is " + currentHighest.getFoodTruckName());
	}

	public void userMenu() {
		System.out.println();
		System.out.println("========= MENU ==============================");
		System.out.println("|                                           |");
		System.out.println("|    1. List food trucks                    |");
		System.out.println("|    2. Find Average of rated food trucks   |");
		System.out.println("|    3. Display highest rated food truck    |");
		System.out.println("|    4. Quit program                        |");
		System.out.println("|                                           |");
		System.out.println("=============================================");
		System.out.println();
	}
}
