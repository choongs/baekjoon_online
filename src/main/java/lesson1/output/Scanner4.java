package lesson1.output;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// a * b

public class Scanner4 {
  public static void main(String[] args) {

    do{
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if (a > 0 && b < 10) {
        System.out.println(a * b);
        break;
      }
    } while(true);


  }
}
