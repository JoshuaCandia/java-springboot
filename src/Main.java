import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*double sueldo_repositor = 15890 + (15890 * 0.10);
        double sueldo_cajero = 25630.89;
        double sueldo_supervisor = 35560.20 - (35560.20 * 0.10);
        String categoria;

        System.out.println("Ingrese el tipo de categoría que deseas calcular");
        Scanner teclado = new Scanner(System.in);

        categoria = teclado.nextLine();
        if (categoria.equals("repositor")) {
            System.out.println(sueldo_repositor);
        } else if (categoria.equals("cajero")) {
            System.out.println(sueldo_cajero);

        } else {
            System.out.println(sueldo_supervisor);
        }*/

 /*       Scanner scanner = new Scanner(System.in);
        int limite;
        int contador = 0;

        System.out.println("Ingresar número hasta el que quiere contar");
        limite = scanner.nextInt();

        while (contador < limite) {
            contador++;
            System.out.println(contador);
    }*/

      /*  int contador = 200;


        while (contador <= 250){
            System.out.println(contador);
            contador += 2;
        }*/

        /*Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        while (!word.equals("salir")) {
            System.out.println(word);
            word = scanner.next();
        }*/

       /* Scanner scanner = new Scanner(System.in);
        String nombre;
        int dni;
        int edad;

        System.out.println("Ingrese su nombre:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su dni:");
        dni = scanner.nextInt();

        System.out.println("Ingrese su edad:");
        edad = scanner.nextInt();

        String mensaje = nombre + " con dni nro " + dni + ", tu categoría es la de ";

        if (edad >= 6 && edad <= 10) {
            System.out.println(mensaje + "Menores A");
        } else if (edad >= 11 && edad <= 16) {
            System.out.println(mensaje + "Menores B");
        } else if (edad >= 17 && edad <= 29) {
            System.out.println(mensaje + "Juveniles");
        } else if (edad >= 30 && edad <= 50) {
            System.out.println(mensaje + "Adultos");
        } else if (edad >= 51) {
            System.out.println(mensaje + "Adultos mayores");
        } else {
            System.out.println("No hay categoría para tu edad.");
        }

        scanner.close();*/

        int altura = 4;

        for (int fila = 0; fila < altura; fila++) {

            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.println(" ");
            }
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.println("*");
            }
            System.out.println("");
        }

    }
}