import java.io.*;
import java.util.*;

public class Nim {

  // Variables needed for the game
  static int stones = 12;
  static String winner = "";

  // Variables needed to get random numbers and user input specifically
  static Random rand = new Random();
  static Scanner user_input = new Scanner(System.in);

  public static void main(String[] args) {

    // The game only goes on so long as there are still stones in the bag
    while (stones > 0) {
      take_player_turn();
      // If the player already won, there's no need for the computer to take a turn or
      // to display the round results
      if (winner != "Player") {
        // computer_stones_removed is stored in a variable so that it can be used as
        // part of display_round_results
        int computer_stones_removed = take_computer_turn_unfair();
        display_round_results(computer_stones_removed);
      }
    }

    // once the while loop ends, it's time to display who won the game
    determine_game_winner();
  }

  static void take_player_turn() {
    // This gets the input from the user
    System.out.println("Enter how many stones you want to remove below (Choose between 1-3): ");
    int player_stones_removed = user_input.nextInt();

    // The while loop below makes sure that the input from the user is a valid
    // integer (but it will still cause errors id other data types are entered)
    while (player_stones_removed < 1 || player_stones_removed > 3) {
      System.out.println("Invalid Input, choose either 1, 2, or 3.");
      System.out.println("Enter how many stones you want to remove below (Choose between 1-3): ");
      player_stones_removed = user_input.nextInt();
    }
    // This represents removing the stones from the bag
    stones = stones - player_stones_removed;

    // If there are no stones left in the bag, the player won
    if (stones <= 0) {
      winner = "Player";
    }
  }

  static int take_computer_turn() {
    int computer_stones_removed;
    // The computer's stones removed are based on random numbers, unless it has a
    // chance to win
    if (stones <= 3) {
      computer_stones_removed = stones;
    } else {
      computer_stones_removed = (rand.nextInt(3)) + 1;
    }
    // This represents removing the stones from the bag
    stones = stones - computer_stones_removed;

    // If there are no stones left in the bag, the computer won
    if (stones <= 0) {
      winner = "Computer";
      stones = 0;
    }

    return computer_stones_removed;
  }

  static void display_round_results(int computer_stones) {
    System.out.println("The computer removed " + computer_stones + " stones");
    System.out.println("There are " + stones + " remaining");
  }

  static void determine_game_winner() {
    if (winner == "Player") {
      System.out.println("You Won!!");
    } else if (winner == "Computer") {
      System.out.println("The Computer Won.");
    }
  }

}
