package p_1016;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int distancia, total_minutos;

        distancia = sc.nextInt();

        total_minutos = distancia * 2;

        System.out.printf("%d minutos\n", total_minutos);

    }
}
