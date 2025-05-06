package juego_encuentra_las_fichas;

import java.util.Scanner;

public class Juego_encuentra_las_fichas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tamaño = 5;
        int fichas = 10;
        int intentosPosibles = 30;
        char[][] tablero = new char[tamaño][tamaño];
        
        // Inicializar el tablero con espacios en blanco.
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                tablero[i][j] = '-';
            }
        }

        // Carga automática de las fichas.
        int x, y;
        for (int i = 0; i < fichas; i++) {
            x = (int) (Math.random() * tamaño);
            y = (int) (Math.random() * tamaño);
            if (tablero[x][y] == 'X') {
                i--; // Si ya hay una ficha, repetir iteración
            } else {
                tablero[x][y] = 'X';
            }
        }
        
        // Comienza el juego.
        int intentos = 0;
        int aciertos = 0;
        while ((intentos < intentosPosibles) && (aciertos < fichas)) {

            // Mostrar el tablero oculto (sin mostrar las fichas 'X').
            System.out.println("\nTablero actual:");
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {

                    if (tablero[i][j] == 'X' || tablero[i][j] == '0') {
                        System.out.print("- "); // No muestra las fichas X.
                    } else {
                        System.out.print(tablero[i][j] + " ");
                    }
                }
                System.out.println();
            }
            // Pedir coordenadas al usuario.
            System.out.print("\nIntroduce la coordenada X (0-4): ");
            x = in.nextInt();
            System.out.print("Introduce la coordenada Y (0-4): ");
            y = in.nextInt();

            // Validación de coordenadas.
            if (x < 0 || x >= tamaño || y < 0 || y >= tamaño) {
                System.out.println("Coordenadas fuera de límite. Intenta de nuevo.");
                continue; // Vuelve a pedir las coordenadas.
            }
            intentos++;

            // Comprobar la posición.
            if (tablero[x][y] == 'X') {
                System.out.println("🎯 ¡Has acertado una ficha!");
                aciertos++;
                tablero[x][y] = '0'; // Marcamos la ficha encontrada.
            } else if (tablero[x][y] == '0') {
                System.out.println("⚠️ ¡Ya habías disparado aquí!");
            } else {
                System.out.println("❌ Has fallado.");
                tablero[x][y] = '*'; // Marcamos los intentos fallidos.
            }
            System.out.println("Aciertos: " + aciertos + "/" + fichas);
            System.out.println("Intentos restantes: " + (intentosPosibles - intentos));
        }

        // Mostrar el resultado del juego.
        if (aciertos == fichas) {
            System.out.println("\n🏆 ¡Felicidades! ¡Has encontrado todas las fichas!");
        } else {
            System.out.println("\n😞 ¡Has perdido! No has encontrado todas las fichas.");
        }

        // Mostrar el tablero final con las fichas descubiertas.
        System.out.println("\nTablero final:");

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    }
