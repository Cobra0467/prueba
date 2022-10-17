import java.util.Scanner;

public class Ej3P2 {

    public static void main(String[] args) {

        double metros = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Cálculo de millas marinas a metros");
        System.out.println("----------------------------------");
        System.out.println("Escribe la distancia en millas marinas");
        double millas = sc.nextDouble();
         metros = millas * 1.852;
        System.out.println(millas + " millas marinas son " + metros + " metros");
       



    }
}
