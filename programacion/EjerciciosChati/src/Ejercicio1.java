public class Ejercicio1 {
    static void main(String[] args) {
        int multiplo;

        for (int i = 1; i < 151; i++) {
            multiplo = i%5;
            if (multiplo == 0) {
                System.out.printf("El numero %d es multiplo de 5 %n", i);
            }
        }
    }
}
