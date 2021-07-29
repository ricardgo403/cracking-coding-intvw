package omegaUp.aMAYUSCULAS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in))) {
      char[] buffer = new char[255];
      int amountCharsRead = br.read(buffer, 0, 255);
      String result;
      if (amountCharsRead != -1) {
          result = new String(buffer, 0, amountCharsRead);
          result = result.toUpperCase();
      } else {
          result = "";
      }
      System.out.print("" + result);

    }
    // TODO: fixme.
  }
}