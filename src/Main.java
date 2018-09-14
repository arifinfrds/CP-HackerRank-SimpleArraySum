import java.util.Scanner;

public class Main {

  // https://www.hackerrank.com/challenges/simple-array-sum/problem
  // Given an array of integers, find the sum of its elements.


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int arraySize = scanner.nextInt();

    scanner.nextLine();

    if (!isArraySizeValid(arraySize)) {
      return;
    }

    String numbersString = scanner.nextLine();

    int[] numbers = getNumbers(numbersString);

    for (int number : numbers) {
      if (!isValueValid(number)) {
        return;
      }
    }

    int sum = getSum(numbers);
    System.out.println(sum);
  }

  private static int[] getNumbers(String numbersString) {
    String[] numbersInString = numbersString.split(" ");
    int[] numbers = new int[numbersInString.length];
    for (int i = 0; i < numbersInString.length; i++) {
      numbers[i] = Integer.parseInt(numbersInString[i]);
    }
    return numbers;
  }

  private static int getSum(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  private static boolean isArraySizeValid(int arraySize) {
    return (arraySize > 0 && arraySize <= 1000);
  }

  private static boolean isValueValid(int value) {
    return (value > 0 && value <= 1000);
  }

}
