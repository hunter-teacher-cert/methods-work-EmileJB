import java.util.*;


class CurvedAverage {
  public static void main(String[] args) {
    //This program first makes an array of 5 random numbers between 50 and 100
    Random rand = new Random;
    grade_array = new int[5];
    for (int i = 1; i < 5; i++ ) {
      grade_array[i] = 50 + rand.nextInt(50);
    }
    int sum;
    Scanner user_input = new Scanner(System.in);
    //Once the array of grades is made, the program goes through the array again, asking for each grade how many points should be added. The program should then calculate the average of all the grades, after extra credit has been applied
    for (int i = 0; i <= grade_array.length; i++) {
      System.out.println("The current grade is " + grade_array[i] + ". How many points do you wish to add? ");
      int extra_credit = user_input.nextInt();
      sum = sum + grade_array[i];
      grade_array[i] = grade_array[i + extra_credit]; 
    }
    int average = (sum / (double) grade_array.length);
    System.out.println("The new average is " + average);
  }

}