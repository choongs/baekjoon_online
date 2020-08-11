package lesson1.loop_for;

import java.io.*;

public class AplusB {
  public static void main(String[] args) {

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    do {

      try {
        int t = Integer.parseInt(reader.readLine());
        if (t < 1) continue;

        for (int i =1;  i <= t; i++){
            String[] line = reader.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            if (a > 0 && b < 10){
                bw.write(String.format("Case #%d: %d \n", i, a+b));
            }
        }
        bw.flush();
        bw.close();
        break;

      } catch (IOException e) {
      }
    } while (true);
  }
}
