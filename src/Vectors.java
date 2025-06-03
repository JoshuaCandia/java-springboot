import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vector[] = new int[4];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número");
            vector[i] = scanner.nextInt();
        }


        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice " + i);
            System.out.println("Tengo guardado un " + vector[i]);
        }
        scanner.close();
    }
}
