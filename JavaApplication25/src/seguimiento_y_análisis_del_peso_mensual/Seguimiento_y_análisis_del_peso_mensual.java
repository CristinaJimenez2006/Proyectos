package seguimiento_y_análisis_del_peso_mensual;

import java.util.Scanner;

public class Seguimiento_y_análisis_del_peso_mensual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Bienvenidos al programa de seguimiento y análisis del peso mensual");
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        
        float pesoActual, pesoAnterior = 0;
        float max = 0, min = 0, media, sumaPesos = 0;
        float pesoPrimero = 0, pesoUltimo = 0;

        int i = 0, meses = 3;
        int aumentado = 0, disminuido = 0, mantenido = 0;

        for (i = 1; i <= meses; i++) {
            System.out.println("Mes " + i);
            System.out.print("Peso actual (en kg): ");
            pesoActual = sc.nextFloat();
            System.out.println();

            sumaPesos += pesoActual;

            if (pesoActual > max) {
                max = pesoActual;
            }
            if (pesoActual < min) {
                min = pesoActual;
            }

            // Primera iteración 
            if (i == 1) {
                max = pesoActual;
                min = pesoActual;
                pesoPrimero = pesoActual;
            } else {
                System.out.println("La variación es de" + (pesoActual - pesoAnterior) + ".");
                System.out.println("");

                if (pesoActual - pesoAnterior > 0) {
                    aumentado++;
                } else if (pesoActual - pesoAnterior < 0) {
                    disminuido++;
                } else {
                    mantenido++;
                }

                if (i == meses) {
                    pesoUltimo = pesoActual;
                }
            }
            pesoAnterior = pesoActual;
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Peso máximo: " + max + " kg.");
        System.out.println("Peso mínimo: " + min + " kg.");
        System.out.println("Media: " + (sumaPesos / (i - 1)) + ".");
        System.out.println("Diferencia entre el primer y el último peso: " + (pesoUltimo
                - pesoPrimero) + " kg.");
        System.out.println("Aumentos: " + aumentado + ".");
        System.out.println("Disminuciones: " + disminuido + ".");
        System.out.println("Mantenido: " + mantenido + ".");
        System.out.println("-----------------------------------------------------------");
    }
}
