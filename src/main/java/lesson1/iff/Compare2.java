package lesson1.iff;

import java.util.Scanner;

// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

// 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

public class Compare2 {
  public static void main(String[] args) {

    do {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();

      if (0 <= a && a <= 100) {
        if (a >= 90 ){
          System.out.println("A");
        } else  if (a >= 80){
          System.out.println("B");
        } else if (a >= 70) {
          System.out.println("C");
        } else if (a >= 60){
          System.out.println("D");
        } else {
          System.out.println("F");
        }

        break;
      }
    } while (true);
  }
}
