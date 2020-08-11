package lesson1.loop_for;

import java.io.*;

public class FastSum {
  public static void main(String[] args) {
    do {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      try {
        int t = Integer.parseInt(reader.readLine());
        if (t > 1000000) continue;

        for (int i = 0; i < t; i++) {
          String[] line = reader.readLine().split(" ");
          int a = Integer.parseInt(line[0]);
          int b = Integer.parseInt(line[1]);
          if ((a >= 1 && a <= 1000) && (b >= 1 && b <= 1000)) {
            bw.write(Integer.toString(a + b) + "\n");
          }
        }
        bw.flush();
        bw.close();
      } catch (IOException e) {}
      break;
    } while (true);
  }
}
