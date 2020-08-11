package lesson1.loop_for;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NaturalNumber {
  public static void main(String[] args) {
    do {
      // 0은 자연수인가?
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      if (n >= 0 && n <= 100000) {
        if (n != 0) {
          IntStream.range(1, n+1).forEach(System.out::println);
        }
        break;
      }
    } while (true);
  }
}
