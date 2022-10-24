
import java.util.Scanner;

public class Ej5P2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float C1 = sc.nextFloat();
    float C2 = sc.nextFloat();
    float x = -C2/C1;
    System.out.println("La solución de la ecuación es: "+ x);
  }
}