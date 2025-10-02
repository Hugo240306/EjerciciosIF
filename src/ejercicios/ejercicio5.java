import java.sql.SQLOutput;
import java.util.Scanner;


public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un año");
        int anho = sc.nextInt();

        if (anho % 4==0){
          if (anho % 100==0){
              if (anho % 400==0){
                  System.out.println();
              }
          }
        }
    }
}