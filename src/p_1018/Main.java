package p_1018;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Long valor;

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        valor = sc.nextLong();

        System.out.printf("%d\n", valor);
        for(int i=0; i < cedulas.length; i++){
            int auxDiv = (int) (valor / cedulas[i]);
            System.out.printf("%d nota(s) de R$ %d,00\n", auxDiv, cedulas[i]);
            valor = valor % cedulas[i];
        }

    }
}
