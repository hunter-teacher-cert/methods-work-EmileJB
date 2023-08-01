import java.util.*;

class ReverseArray {
  public static void main(String[] args) {
    //This program should an array of Strings and print them out as a sentence, but in reverse order.
    String[] sentence_array = new String[] {"Us","Among","Imposter","1","Is","There"};
    int front_index = 0;
    int back_index = sentence_array.length - 1;
    while (front_index < back_index) {
      swap(sentence_array,front_index,back_index);
      front_index = front_index + 1;
      back_index = back_index - 1;
    }

    System.out.println("Printing the array in reverse as a sentence");
    for (int i = 0; i < sentence_array.length; i++) {
      System.out.print(sentence_array[i] + " ");
    }
  }

  public static void swap(String[] string_array, int index1, int index2) {
    String temp = string_array[index1];
    string_array[index1] = string_array[index2];
    string_array[index2] = temp;
  }
}