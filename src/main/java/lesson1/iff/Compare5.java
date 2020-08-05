package lesson1.iff;

import java.util.Scanner;

public class Compare5 {
  public static void main(String[] args) {

    do {
      Scanner scanner1 = new Scanner(System.in);
      int a = scanner1.nextInt();

      Scanner scanner2 = new Scanner(System.in);
      int b = scanner2.nextInt();
      int minusMinute = 45;
      if ((0 <= a && a <= 23 ) && (0 <= b && b <= 59 )) {
        int hour = 0;
        int minute = 0;
        if (b >= minusMinute) {
          hour = a;
          minute = b - minusMinute;
        } else {
          hour = a == 0 ? 23 : a -1;
          minute = b + 60 - minusMinute;
        }
        System.out.println(String.format("%d %d",hour, minute));
        break;
      }
    } while (true);
  }
}
