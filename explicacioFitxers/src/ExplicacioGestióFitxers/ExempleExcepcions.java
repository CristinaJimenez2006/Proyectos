/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicacioGestióFitxers;
import java.util.Scanner;
/**
 *
 * @author david
 */

/*

===== EXCEPCIONS =====

Les excepcions són errors que poden aparèixer durant l’execució d’un programa,
és a dir, mentre el programa està funcionant.

En lloc que el programa es tanqui de cop quan apareix un error, Java permet "capturar" aquest error
i gestionar-lo d’una manera controlada, gràcies al mecanisme de les excepcions.

===== EXEMPLE TÍPIC D'ERRORE =====

int resultat = 10 / 0; 

Això provoca un error en temps d'execució
Aquest codi dona un error perquè no es pot dividir entre zero. 
Això genera una excepció que es diu ArithmeticException.
Si no es controla, el programa fallarà i es tancarà mostrant un missatge d’error per pantalla.


===== PER A QUÈ SERVEIXEN LES EXCEPCIONS??? =====

Les excepcions serveixen per:

- Evitar que el programa es tanqui sobtadament.
- Donar un missatge clar i personalitzat a l’usuari.
- Continuar amb l’execució del programa d’una forma segura.
- Gestionar situacions imprevistes com:
    Divisions entre zero
    Accés a fitxers que no existeixen
    Lectura incorrecta de dades
    Connexions a internet o a bases de dades que fallen

===== PARTS DEL CONTROL D'EXEPCIONS EN JAVA =====

try {
    // Codi que pot causar un error
} catch (NomDeLExcepcio e) {
    // Què fer si es produeix aquest error
} finally {
    // (Opcional) Codi que sempre s’executa, passi el que passi
}

try:
    On posem el codi que podria fallar.

catch:
    Serveix per capturar i gestionar l’error si realment passa. 
    Aquí podem mostrar un missatge o prendre una acció alternativa.

finally (opcional):
    S’executa sempre, hagi passat una excepció o no. Serveix, per exemple, 
    per tancar recursos (com fitxers o connexions).


===== EXCEPCIONS TÍPIQUES EN JAVA ===== 
   
ArithmeticException:

    Quan passa? Quan es fa una operació aritmètica il·legal, com dividir entre zero.
    Exemple: 

    int x = 10 / 0;

NullPointerException:
    Quan passa? Quan intentem accedir a un objecte que no ha estat inicialitzat (és null).
    Exemple:

    String nom = null;
    System.out.println(nom.length());

ArrayIndexOutOfBoundsException:
    Quan passa? Quan intentem accedir a una posició d’un array que no existeix.
    Exemple:

    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]);

*/


public class ExempleExcepcions {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); // Per llegir dades de l'usuari
        int dividend, divisor, resultat;

        System.out.print("Introdueix el dividend (nombre a dividir): ");
        dividend = entrada.nextInt();

        System.out.print("Introdueix el divisor (nombre pel qual es divideix): ");
        divisor = entrada.nextInt();

        try {
            // Bloc "try": aquí posem el codi que pot generar errors (excepcions)
            resultat = dividend / divisor; // Això pot fallar si divisor = 0
            System.out.println("Resultat de la divisio: " + resultat);
            
        // la variable e conté tota la informació sobre l'error que ha passat
        } catch (ArithmeticException e) {
            // Bloc "catch": s’executa si hi ha una excepció del tipus especificat
            System.out.println("Error: no es pot dividir entre zero!");
            //e.printStackTrace();

        } finally {
            // Bloc "finally": s’executa SEMPRE, passi el que passi
            System.out.println("Fi de loperacio de divisio.");
        }

        entrada.close(); // Tanquem l'entrada
    }    
}
