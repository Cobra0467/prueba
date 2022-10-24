import java.util.Scanner;
 
public class Ej7P2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
 
        System.out.print("Introduzca la longitud del lado 1: ");
        double lado1 = in.nextDouble();
 
        System.out.print("Introduzca la longitud del lado 2: ");
        double lado2 = in.nextDouble();
 
        System.out.print("Introduzca la longitud del lado 3: ");
        double lado3 = in.nextDouble();
 
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
        {
            System.out.println("Los lados deben ser positivos.");
        }
        else
        {
            double s = (lado1 + lado2 + lado3) / 2;
            double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
 
            System.out.println("El área del triángulo es " + area);
        }
    }
}