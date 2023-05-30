# FoodTruckProject
The overall goal of the project was to take in names of food trucks, the type of food they had and a numerical rating, in this case 1 to 5. Based off of the information the user provided, I gave them four different choices to perform. I could display all of the information about the food trucks they entered, including the name, an incrementing id for each food truck, the type of food and a numerical rating. I could display the average rating of all the food trucks. I could display the highest rated food truck if they wished. Then, to end the program, all the user would have to do is enter a number to terminate the program entirely. 

# Description
While the application was running, I used a for loop to loop through user input up to five times. Using a comparative string parameter within an if statement, I was able to prompt the user to a menu, whenever the user typed "quit", when it asked for a food truck name. I created the menu by using a switch block, with each case calling on a method with the parameter of fleet, which I used to help store the information. I was able to fulfill the request of the user, using the switch block.  One of my biggest struggles during the project was calculating a correct average for the ratings of all existing food trucks. I created a currentNumOfTrucks field within my code. Within the findAverage method, I looped through the array length until there was a null element. I then divided the sum by the number of existing elements which produced a correct average. Within a print line statement, I then called on a toString method to display the information for all existing food trucks. In the highestRated method, I looped through the array until the last element was greater than the current highest, which gave me the highest rated food truck. I then gave the user an option to quit the program.

# Technologies Use
-Java
-Eclipse

# Lessons Learned
I learned how important and effective passing arguments within a method is.
I reinforced my understanding of how to break out of a while loop when looping through user input.
I reinforced my understanding on how and when the appropriate time to store information in an array is. 
I learned how to implement a toString method, while solidifying my understanding of getters and setters.