package lesson1.loop_for;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NaturalNumberReverse {
  public static void main(String[] args) {
    do {
      // 0은 자연수인가?
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      if (n >= 0 && n <= 100000) {
        if (n != 0) {
          for (int i = n; i > 0; i--) {
            System.out.println(i);
          }
        }
        break;
      }
    } while (true);
  }
}
