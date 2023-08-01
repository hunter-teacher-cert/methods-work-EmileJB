import java.util.*;

class Main {
  public static void main(String[] args) {
    //This program should take all the grades in the grade_array and print out their equivalent letter grades, going through the list in reverse order
    int[] grade_array = new int[] {85,77,50,65,91};
    System.out.println("Converting number grades to letters\n");
    for (int i = grade_array.length; i >= 0; i--) {
      String letter_grade = convertGradeToLetter(grade_array[i]);
      System.out.println(grade_array[i] + " becomes a(n) " + letter_grade);
    }
  }

  public static convertGradeToLetter(grade) {
    String return_result = "";
    if (grade < 60) {
      return_result = "F";
    }
    else if (grade >= 60) {
      return_result = "D";
    }
    else if (grade >= 70) {
      return_result = "C";
    }
    else if (grade >= 80) {
      return_result = "B";
    }
    else if (grade >= 90) {
      return_result = "A";
    }
    return return_result;
  } 
}