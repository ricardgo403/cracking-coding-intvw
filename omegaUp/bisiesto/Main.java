package omegaUp.bisiesto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in))) {
          int amountYears = Integer.parseInt(br.readLine());
          for (int i = 0; i < amountYears; i++) {
            int actualYear = Integer.parseInt(br.readLine());
            System.out.print("" + isBisiesto(actualYear));
            if (i < amountYears - 1) {
              System.out.print("\n");
            }
          }
        }
    }

    public static String isBisiesto(int year) {
        if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
          return "S";
        } else {
          return "N";
        }
    }
    
}
