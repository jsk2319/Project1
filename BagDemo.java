import java.util.Scanner;

public class BagDemo {
    public static void main(String[] args) {

//Create a Scanner object called keyboard that takes input from System.in
        Scanner keyboard = new Scanner(System.in);
//Create an object of the Bag class refer to this object as myBag
        Bag myBag = new Bag();
//declare a variable called option of type int
        int option;
//Open a do/while loop
        do {
//Prompt the user to pick one of the following options:
//Press 1 to change the name of the bag
//Press 2 to add an item to the bag
//Press 3 to change the maximum weight of the bag
//Press 4 to view all information about the bag
//Press 5 to end the program
            System.out.println("Pick an option. " +
                    "\nPress 1 to change the name of the bag. " +
                    "\nPress 2 to add an item to the bag. " +
                    "\nPress 3 to change the maximum weight of the bag. " +
                    "\nPress 4 to view all information about the bag. " +
                    "\nPress 5 to end the program.");
//Save the user’s input into the option variable
            option = keyboard.nextInt();
            keyboard.nextLine();
//if the user picks option 1, prompt the user for the name of the bag
//then save the name of the bag in a variable called newName
//change the name of the bag to newName
            if (option == 1) {
                System.out.println("What should the name of the bag be?");
                String newName = keyboard.nextLine();
                myBag.setName(newName);
//else if the user picks option 2, prompt the user for the weight
//of the item and then save the weight of the item in a variable
//called newWeight
//add the new item to the bag
            }else if (option == 2) {
                System.out.println("What is the weight of the item?");
                double newWeight = keyboard.nextDouble();
                //myBag.addItem(newWeight);
//else if the user picks option 3, prompt the user for the new maximum
//weight of the bag and save the new maximum weight in a variable
//called newMaximumWeight
//change the maximum weight of the bag to newMaximumWeight
            }else if (option == 3) {
                System.out.println("What should the new maximum weight of the bag be?");
                double newMaximumWeight = keyboard.nextDouble();
                //myBag.setMaximumWeight(newMaximumWeight);
//else if the user picks option 4, display to the screen the name of
//the bag, the current weight of the bag, and the maximum weight
//of the bag
            }else if (option == 4) {
                System.out.println(myBag.getName());
//else if the user picks option 5, display Goodbye.
            }else if (option == 5) {
//else if the user picks any other option, display Error!
            }else {
                System.out.println("Error!");
            }
//close the do/while loop and make it so that it continues to run as
//long as the user does not pick option 5
        } while (option !=5 );
    }
}
