import java.sql.SQLOutput;
import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        String ContrasenaCorrecta = "Mouris";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        String ContrasenaUsurario = sc.nextLine();

        if (ContrasenaUsurario .equals(ContrasenaCorrecta) ) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        sc.close();
    }
}

