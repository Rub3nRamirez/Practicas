public class EJER3 {
    public static void main(String[] args) {
        int contadorMultiplosDeDos = 0;
        int contadorMultiplosDeTres = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es múltiplo del número 2");
                contadorMultiplosDeDos++;
            }
            if (i % 3 == 0) {
                System.out.println(i + " es múltiplo del número 3");
                contadorMultiplosDeTres++;
            }
        }

        System.out.println("El total de los múltiplos de 2 son: " + contadorMultiplosDeDos);
        System.out.println("El total de los múltiplos de 3 son: " + contadorMultiplosDeTres);
    }
}

