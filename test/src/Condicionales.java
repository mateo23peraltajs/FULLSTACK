
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su opinion acerca de la pelicula:");
        opinion = leer.nextInt();
        int numero = opinion;

        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Wow! ¿tán mala es la pelicula?");
                    break;
                case 3:
                    System.out.println("OK! la peli puede mejorar");
                    break;
                case 4:
                    System.out.println("te encanto, no? pero parece que no lo suficiente.");
                    break;
                case 5:
                    System.out.println("Te encanto! nos alegramos");
                    break;

            }
        } else if (opinion < 0) {
            System.out.println("tan mala fue la pelicula?");
        } else if (opinion == 0) {
            System.out.println("la calificacion no es valida, lo sentimos");
        } else {
            System.out.println("que bueno que te haya gustado tanto!");
        }
        System.out.println("");
    }

    String nombre;
    boolean bandera;
    char caracter;
    int o = 1;

    double decimales = 3.55;
    boolean vandera = false;
}
