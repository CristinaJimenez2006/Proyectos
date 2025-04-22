/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicacioGestióFitxers;
import java.io.File;
/**
 *
 * @author david
 */


/*
===== MÈTODES MÉS UTILITZATS =====

File(String pathname) --> Crea un nou objecte de tipus File a partir de la seva ruta
boolean createNewFile() --> Crea un nou arxiu buit amb la ruta definida per l'objecte File.
boolean delete() --> Esborra el fitxer/directori
boolean exists() --> Indica si el fitxer/directori existeix
String getName() --> Retorna el nom del fitxer/directori (sense la ruta)
String getParent() --> Retorna la ruta al directori pare
File[] listFiles() --> Obté un llistat de fitxers dins del directori
boolean isDirectory() --> Indica si es tracta d'un directori
boolean isFile() --> Indica si es tracta d'un fitxer
getAbsolutePath() --> Retorna la ruta absoluta de l'arxiu o directori
mkdir() --> Crea un directori representat per l'objecte File

*/
public class IniciFile {
    public static void main(String[] args) {
        // Crear un objecte File utilitzant una cadena que representa la ruta
        File arxiu1 = new File("carpeta/carpeta2/arxiu.txt");

        // Crear un objecte File utilitzant un altre objecte File com a base i una cadena
        // que representa el nom de l’arxiu o directori
        File directori = new File("carpeta/carpeta2/directori");
        File arxiu2 = new File(directori, "arxiu.txt");
    }
}
