package lesson1.loop_for;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Sum1ToN {
  public static void main(String[] args) {
    do {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      if (n >= 1 && n <= 10000) {
        System.out.println(IntStream.range(1, n + 1).sum());
        break;
      }
    } while (true);
  }
}
