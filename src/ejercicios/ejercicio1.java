import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buenas, ¿qué edad tienes?");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        double precioEvento = 20;

        if (edad < 5) {
            System.out.println("Entras al evento gratis");
        }

        if (edad >= 5 && edad <= 12) {
            precioEvento = precioEvento * 0.5;
            System.out.println("Tu entrada cuesta: " + precioEvento);
        }

        if (edad >= 13 && edad <= 64) {
            System.out.println("Tu entrada cuesta: " + precioEvento);
        }

        if (edad >= 65) {
            precioEvento = precioEvento * 0.25;
            System.out.println("Tu entrada cuesta: " + precioEvento);
        }

        sc.close();
    }
