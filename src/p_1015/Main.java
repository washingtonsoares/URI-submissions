package p_1015;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distancia = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));

        System.out.printf("%.4f\n", distancia);

    }
}
