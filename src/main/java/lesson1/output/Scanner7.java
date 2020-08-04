package lesson1.output;

import java.util.Scanner;

public class Scanner7 {
  public static void main(String[] args) {

    do {
      Scanner scanner1 = new Scanner(System.in);
      int a = scanner1.nextInt();
      Scanner scanner2 = new Scanner(System.in);
      int b = scanner2.nextInt();
      if ((a > 99 && a < 1000) && (b > 99 && b < 1000)) {
        System.out.println((b % 10) * a);
        System.out.println(((b % 100)/10) * a);
        System.out.println((b / 100) * a);
        System.out.println(a * b);
        break;
      }
    } while(true);
  }
}
