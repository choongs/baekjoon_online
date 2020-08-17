package lesson1.loop_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Star1 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    do {
      try {
        int n = Integer.parseInt(reader.readLine());
        if (n >= 1 && n <= 100) {
          IntStream.range(1, n+1)
              .forEach(data -> {
                  IntStream.range(1, data+1)
                          .forEach(star -> System.out.print("*"));
                  System.out.println("");
              });
        }
        break;
      } catch (IOException e) {
      }
    } while (true);
  }
}
