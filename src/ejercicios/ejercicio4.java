import java.sql.SQLOutput;
import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu peso en kilogramos");
        double peso = sc.nextDouble();
        System.out.println("Dime tu altura en metros");
        double altura = sc.nextDouble();
        double Imc = peso/(altura);
        System.out.printf("Tu IMC es: %2f", Imc);


        if (Imc<18.5) {
            System.out.println(" Bajo Peso");
        }
        if (Imc>= 18.5 && Imc < 25) {
            System.out.println(" Peso Normal");
        }
        if (Imc >= 25 && Imc < 30) {
            System.out.println(" Sobrepeso");
        }
        if (Imc>=30 ) {
            System.out.println(" ");
        }





    }
    }