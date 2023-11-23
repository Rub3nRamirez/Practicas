import java.util.Scanner;

public class EJER2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresado;
        do {
            System.out.print("Introduzca un número positivo: ");
            numeroIngresado = scanner.nextInt();
        } while (numeroIngresado <= 0);

        System.out.println("Los primeros 20 números consecutivos a " + numeroIngresado + " son:");
        for (int i = 1; i <= 20; i++) {
            System.out.println(numeroIngresado + i);
        }

        scanner.close();
    }
}
