import java.util.Scanner;
import java.util.Arrays;

public class EJER4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduzca el tercer número: ");
        int num3 = scanner.nextInt();

        System.out.print("Seleccione el orden de ordenamiento (ascendente o descendente): ");
        String orden = scanner.next();

        int[] numeros = {num1, num2, num3};

        if (orden.equalsIgnoreCase("ascendente")) {
            Arrays.sort(numeros);
        } else if (orden.equalsIgnoreCase("descendente")) {
            Arrays.sort(numeros);
            for (int i = 0; i < numeros.length / 2; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = temp;
            }
        } else {
            System.out.println("Orden no válido. Por favor, introduzca 'ascendente' o 'descendente'.");
            return;
        }

        System.out.println("Números en orden " + orden + ": ");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
