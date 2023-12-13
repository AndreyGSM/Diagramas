import java.util.Scanner;

public class MatrizConCancelacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño de la matriz
        int filas = 5; 
        int columnas = 5; 

        // Crear la matriz
        int[][] matriz = generarMatriz(filas, columnas);

        // Mostrar la matriz inicial
        System.out.println("Matriz inicial:");
        imprimirMatriz(matriz);

        // Cancelar números según la entrada del usuario
        cancelarNumeros(matriz, scanner);

        // Mostrar la matriz final después de la cancelación
        System.out.println("\nMatriz después de la cancelación:");
        imprimirMatriz(matriz);

        scanner.close();
    }

    private static int[][] generarMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * (50 - 24 + 1)) + 24;
            }
        }
        return matriz;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para cancelar números según la entrada del usuario
    private static void cancelarNumeros(int[][] matriz, Scanner scanner) {
        System.out.println("\nIngrese la posición (fila y columna) del número que desea cancelar.");
        System.out.println("Ingrese '0 0' para salir.");

        while (true) {
            System.out.print("Fila: ");
            int fila = scanner.nextInt();

            System.out.print("Columna: ");
            int columna = scanner.nextInt();

            // Verificar si el usuario desea salir
            if (fila == 0 && columna == 0) {
                break;
            }

            // Verificar si la posición ingresada es válida
            if (fila >= 1 && fila <= matriz.length && columna >= 1 && columna <= matriz[0].length) {
                // Cancelar el número en la posición dada
                matriz[fila - 1][columna - 1] = 0;
                System.out.println("Número cancelado correctamente.");
            } else {
                System.out.println("Posición inválida. Inténtelo de nuevo.");
            }
        }
    }
}
