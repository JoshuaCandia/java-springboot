import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[15];
        int i = 0;
        int counterOfThree = 0;
        while (i < 15) {
            System.out.println("Ingrese un número positivo");
            int number = scanner.nextInt();
            if (number > 0) {
                if (number == 3) {
                    counterOfThree++;
                }
                vector[i] = number;
                i++;
            } else {
                System.out.println("El número debe ser mayor a 0");
            }
        }
        System.out.println("El número 3 se agregó " + counterOfThree + " veces.");
    }
}
