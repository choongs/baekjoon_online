package lesson1.loop_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberLessThanX {
  public static void main(String[] args) {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      do{
          try {
              String input = reader.readLine();
              int n = Integer.parseInt(input.split(" ")[0]);
              int x = Integer.parseInt(input.split(" ")[1]);
              if ( n >= 1  && x <= 10000){
                String inputX = reader.readLine();
                List<Integer> result = Arrays.stream(inputX.split(" ")).map(Integer::parseInt)
                        .filter(number -> x > number).collect(Collectors.toList());

                if (result.size() > 0 ) {
                    result.forEach(num -> System.out.print(String.format("%d ", num)));
                    break;
                }
              }

          } catch (IOException e) {}

      } while (true);
  }
}
