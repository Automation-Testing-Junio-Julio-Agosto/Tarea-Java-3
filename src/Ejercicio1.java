import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner scanner = new Scanner(System.in); //inicializamos el scanner
        System.out.print("Ingresar cadena 1: ");
        var cadena1 = scanner.nextLine().toUpperCase();
        System.out.print("Ingresar cadena 2: ");
        var cadena2 = scanner.nextLine().toUpperCase();
        System.out.print("Ingresar cadena 3: ");
        var cadena3 = scanner.nextLine().toUpperCase();
        System.out.print("Ingresar cadena 4: ");
        var cadena4 = scanner.nextLine().toUpperCase();
        scanner.close(); //cerrando el scanner

        System.out.println(
                        cadena1 + " " +
                        cadena2 + " " +
                        cadena3 + " " +
                        cadena4
        );
    }
}
