

//potencialização
import java.util.Scanner;

import java.lang.Math;
public class potencia {
    public static void main(String[] args) {
        Scanner janela = new Scanner(System.in);
        double eloa, pedro, indio;
        System.out.println("pona numerico:");
        pedro= janela.nextDouble();
        System.out.println(" potenia:");
        eloa = janela.nextDouble();
        indio= Math.pow(pedro,eloa);
        System.out.println(indio);

    }
}
