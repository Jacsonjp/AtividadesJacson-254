//matomatica 1 da 4


import java.util.Scanner;
import java.lang.Math;
public class matomatica {
    public static void main(String[] args) {
        Scanner gb =new Scanner(System.in);
        float g;
        double b;
        System.out.println("ponha numerico:");
        g = gb.nextFloat();
        b = Math.sqrt(g);
        System.out.println("fica"+ g+"="+b);
    }
}