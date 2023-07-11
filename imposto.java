import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Scanner gb=new Scanner(System.in);
        double pr,par,t;
        System.out.println("peoduto preço:");
        pr= gb.nextDouble();
        System.out.println("quantas parcelas:");
        par= gb.nextDouble();
        t=pr/par;
        System.out.println("parcelado fica:"+t);
    }
}
