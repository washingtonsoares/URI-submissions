package p_1017;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int tempo, velocidade;
        float quantidadeLitrosNecessarios;
        final float consumoVeiculo = 12.0f;

        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        quantidadeLitrosNecessarios = (tempo * velocidade) / consumoVeiculo;

        System.out.printf("%.3f\n", quantidadeLitrosNecessarios);

    }
}
