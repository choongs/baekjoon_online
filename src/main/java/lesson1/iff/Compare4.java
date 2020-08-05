package lesson1.iff;

import java.util.Scanner;

public class Compare4 {
  public static void main(String[] args) {

    do {
      Scanner scanner1 = new Scanner(System.in);
      int a = scanner1.nextInt();

      Scanner scanner2 = new Scanner(System.in);
      int b = scanner2.nextInt();

      if ((-1000 <= a && a <= 1000 && a != 0) && (-1000 <= b && b <= 1000 && b != 0)) {

        if (a > 0 && b > 0) {
          System.out.println("1");
        } else if ( a > 0 && b < 0){
          System.out.println("4");
        } else if (b > 0) {
          System.out.println("2");
        } else {
          System.out.println("3");
        }

        break;
      }
    } while (true);
  }
}
