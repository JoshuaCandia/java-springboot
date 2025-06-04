public class Arrays {
    public static void main(String[] args) {
        //Declaración
        int[] calificaciones;
        calificaciones = new int[5];
        int[][] numeros;
        numeros = new int[3][4];
        String[] nombres;
        int[][] matriz = new int[3][3];


        //Asignación (Manual)

        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 24;
        matriz[1][0] = 6;
        matriz[1][1] = 14;
        matriz[1][2] = 25;
        matriz[2][0] = 7;
        matriz[2][1] = 15;
        matriz[2][2] = 26;

        // Recorrido

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posicion f: "+ f + " c: " + c);
                System.out.println("es de: "+ matriz[f][c]);
            }
        }



        //Declaración y asignación
        String[] frutas = {"manzana", "banana", "pera"};


    }
}
