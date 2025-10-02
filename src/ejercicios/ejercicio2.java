import java.sql.SQLOutput;
import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A: ");
        double a = sc.nextDouble();
        System.out.print("Lado B: ");
        double b = sc.nextDouble();
        System.out.print("Lado C: ");
        double c = sc.nextDouble();

        if (a == b && b == c) {
            System.out.println("Triángulo Equilátero");
        } else {
            if (a == b) {
                System.out.println("Triángulo Isósceles");
            } else if (a == c) {
                System.out.println("Triángulo Isósceles");
            } else if (b == c) {
                System.out.println("Triángulo Isósceles");
            } else {
                System.out.println("Triángulo Escaleno");
            }
        }

        sc.close();
    }
    }
