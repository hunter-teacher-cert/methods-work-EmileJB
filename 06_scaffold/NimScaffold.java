/*
GOAL:
Be the player to remove the last stone.

RULES: * bag contains 12 stones initially * a move consists of removing 1-3 stones from the bag

YOUR CODING MISSION:
Write a program that will allow a human at console to play against your “AI” a game of NIM.
  * prompt user for number of stones they wish to remove each turn 
  * tell user how many stones the AI removed and how many stones remain 
  * facilitate play until human or AI wins, and announce winner 
*/

import java.io.*;
import java.util.*;

public class Nim {

  // Variables needed for the game
  static int stones = 12;
  static String winner = "";

  // Variables needed to get random numbers and user input specifically
  static Random rand = new Random();
  static Scanner user_input = new Scanner(System.in);

  //main() should do the following
  //1. let the player take their turn
  //2. If the player didn't already win, let the computer take their turn
  //3. Display the results of the round
  //4. Repeats steps 1-3 until there are no more stones in the bag and someone wins the game
  //5. Display who won the game 

  //NOTE: This main method should use all of the functions below, 
  //take_player_turn()
  //take_computer_turn()
  //display_round_results()
  //display_game_winner()
  //but you may use more if you wish
  public static void main(String[] args) {

  }

//take_player_turn() should do the following
//1. Get input fromm the user for how many stones they want to remove
//(Optional):Add validation for the users input to make sure they pick between 1-3 stones
//2. Take the amount of stones the user removed and subtract that from the class variable stones
//3. If there are no more stones, that means the user won and class variable winner should be set to "Player"
  
  static ____ take_player_turn() {
    
  }

  //take_computer_turn() should do the following
  //1. Generate a random number between 1 and 3 for the computer
  //(Optional): Code the computer so that it goes for the win if possible
  //2. Take the random number and subtract that from the class variable stones
  //3. If there are no more stones, that means the computer won and the class variable computer should be set to "Computer"
  static ____ take_computer_turn() {

  }

  //display_round_results() should do the following
  //1. Display how many stones the computer removed on their turn
  //2. Display how many stones are remaining in the bag
  static ____ display_round_results() {
    
  }

  //display_game_winner() should do the following
  //1.Display who won the game of Nim with a congratulatory message
  static ____ display_game_winner() {
    
  }

}
