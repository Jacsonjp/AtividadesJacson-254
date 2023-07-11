import java.util.Scanner;

public class aleto {

        public static void main(String[] args) {
            double m, p,t;
            Scanner submarino=new Scanner(System.in);
            System.out.println("valor:");
            m=submarino.nextDouble();
            System.out.println("porcetagem");
            p=submarino.nextDouble();
            t=p/m;
            System.out.println(t);
        }
    }


