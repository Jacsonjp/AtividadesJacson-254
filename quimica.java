
//cupreto de indio
import java.util.Scanner;

import java.lang.Math;
public class quimica {
    public static void main(String[] args) {
        Scanner janela = new Scanner(System.in);
        double eloa, pedro, quimica;
        System.out.println("pona numerico:");
        pedro= janela.nextDouble();
        System.out.println("potenia:");
        eloa = janela.nextDouble();
       quimica= Math.pow(pedro,eloa);
        System.out.println(quimica);

    }
}

