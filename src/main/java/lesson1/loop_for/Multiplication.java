package lesson1.loop_for;

import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) {
    do{
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      if (n >= 1 && n <= 9) {
        for (int i = 1; i < 10; i++) {
          System.out.println(String.format("%d * %d = %d", n, i , (n*i)));
        }
      }
    } while (true);
  }
}
