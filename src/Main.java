import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        // ask the player what type of game they would like to play.
        System.out.println("What kind of game would you like to play?");
        System.out.println("Guess the number");
        System.out.println("Guess the color");
        System.out.println("Guess the animal");
        System.out.println("Type what game you want to play.");
        String games = object.nextLine();
        //System.out.println(games);
        // put the player in the game they chose.
        if(games.equalsIgnoreCase("guess the number")) {
            // randomize the number and ask the person to enter a number.
            Random randomNum = new Random(15);
            System.out.println("Welcome to guess the number.");
            System.out.println("What number am i thinking of?");
            int Gtn = object.nextInt();
            if(Gtn == randomNum) {
                System.out.println("You got it correct!");
            } else {
                System.out.println("You got it incorrect! Try again.");
            }

        } else if (games.equalsIgnoreCase("guess the color")) {
            // randomize the listed stuff and ask the player what the random color code is.
            System.out.println("Welcome to guess the color.");
            System.out.println("What color is this?");
            String Gtc = object.nextLine();
        } else if (games.equalsIgnoreCase("guess the animal")) {
            // randomize the type of feature for an animal and ask the player what animal it is.
            System.out.println("Welcome to guess the animal.");
            System.out.println("What animal has this type of feature to their body?");
            String Gta = object.nextLine();
        }
    }
}
