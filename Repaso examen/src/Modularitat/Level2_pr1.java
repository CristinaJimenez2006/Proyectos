package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Level2_pr1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = menu(in);
        double resultado = 0;
        while ((numero == 1) || (numero == 2) || (numero == 3)) {

            if (numero == 1) {
                resultado = circulo(in);
            } else if (numero == 2) {
                resultado = triangulo(in);
            } else if (numero == 3) {
                resultado = rectangulo(in);
            }
            if (resultado !=0){
                System.out.println("El resultado es " + resultado + ".");
            }
            menu(in); 
        }
            System.out.println("La opción no es válida.");
            menu(in); 
        }


    public static int menu(Scanner in) {
        System.out.println("Menú:");
        System.out.println("1.Círculo");
        System.out.println("2.Triángulo");
        System.out.println("3.Rectángulo");
        System.out.println();
        System.out.println("Escribe el número de la opción escojida");
        int num = in.nextInt();
        System.out.println("---------------------------------------- ");
        return num;
    }

    public static double circulo(Scanner in) {
        System.out.println("Introduce el valor del radio");
        double radio = in.nextInt();
        double resultado = 0;
        resultado = Math.PI * (Math.pow(radio, 2));
        return resultado;
    }

    public static double rectangulo(Scanner in) {
        System.out.println("Introduce el valor del costado 1");
        double costado1 = in.nextInt();
        System.out.println("Introduce el valor del costado 2");
        double costado2 = in.nextInt();
        double resultado = 0;
        if ((costado1 >= 0) && (costado2 >= 0)) {
            resultado = costado1 * costado2;
        } else {
              if (costado1<0){
                System.out.println("El valor introducido en el campo 'costado 1', no es válido.");
            }else{
                System.out.println("El valor introducido en el campo 'costado 2', no es válido."); 
            }
        }
        return resultado;

    }

    public static double triangulo(Scanner in) {
        System.out.println("Introduce el valor de la base");
        double base = in.nextInt();
        System.out.println("Introduce el valor de la altura");
        double altura = in.nextInt();
        double resultado = 0;
        if ((base >= 0) && (altura >= 0)) {
            resultado = (base * altura) / 2;
        } else {
            if (altura<0){
                System.out.println("El valor introducido en el campo 'altura', no es válido.");
            }else{
                System.out.println("El valor introducido en el campo 'base', no es válido."); 
            }
        }
        return resultado;
    }
}
