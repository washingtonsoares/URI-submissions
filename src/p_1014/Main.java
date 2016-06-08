package p_1014;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x;
        float y, consumo_medio;

        x = sc.nextInt();
        y = sc.nextFloat();

        consumo_medio = x / y;

        System.out.printf("%.3f km/l\n", consumo_medio);

    }
}
