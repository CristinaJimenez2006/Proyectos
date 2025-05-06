package gestió_de_fitxers;

//import java.io.File;
//import java.io.IOException;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.io.BufferedWriter;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gestió_de_fitxers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Es crida al mètode 'menu', passant-li el Scanner creat com a paràmetre.
        // Aquest mètode mostrarà un menú d'opcions a l'usuari.
        menu(scn);

        // Es tanca el Scanner per evitar possibles fuites de memòria.
        scn.close();
    }

    // Mètode que mostra un menú interactiu amb diverses opcions, permetent a l'usuari triar què vol fer, com: gestionar fitxers, inserir dades, llegir fitxers, gestionar un inventari, 
    // generar un diccionari o sortir del programa.
    public static void menu(Scanner scn) {
        int opcio = 0;

        while (opcio != 6) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Menú");
            System.out.println("1. Gestió d'un fitxer de text o un directori (verificació, creació o eliminació).");
            System.out.println("2. Inserció de dades en un fitxer de text.");
            System.out.println("3. Lectura del contingut d'un fitxer de text.");
            System.out.println("4. Gestió d'un inventari.");
            System.out.println("5. Diccionari de paraules.");
            System.out.println("6. Sortir del programa.");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Escull una opció (introdueix el número de l'opció escollida): ");

            try {
                opcio = scn.nextInt();
                // S'utilitza per netejar el salt de línia pendent que queda després de llegir un número.
                // D'aquesta manera, s'evita que afecti les següents lectures de línies de text.
                scn.nextLine();

                switch (opcio) {
                    case 1:
                        gestioFitxerODirectori(scn);
                        break;
                    case 2:
                        escripturaFitxer(scn);
                        break;
                    case 3:
                        lecturaFitxer(scn);
                        break;
                    case 4:
                        gestioInventariInici(scn);
                        break;
                    case 5:
                        GenerarDiccionari(scn);
                        break;
                    case 6:
                        System.out.println("S'ha sortit del programa.");
                        break;
                    default:
                        System.out.println("Opció no vàlida. Torna a provar.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no vàlida. Has d'introduir un número.");
                scn.nextLine();
            }
            // Espai per separar entre operacions
            System.out.println();
        }
    }

    // Exercici 1
    // Mètode que comprova l'existència d'un fitxer o directori amb el nom proporcionat per l'usuari i crida un mètode per crear-lo si no existeix.
    // En el cas contrari, si existeix, crida un altre mètode per eliminar-lo o mostrar informació d'aquest. 
    public static File gestioFitxerODirectori(Scanner scn) {
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("Benvingut al programa de verificació, eliminació o creació d'un fitxer/directori.");
        System.out.println("--------------------------------------------------------------------------------\n");

        try {
            String nomPath = "";
            String caractersProhibits = "<>:\"/\\|?*";

            // Repeteix fins que el nom sigui vàlid.
            while (nomPath.isEmpty()) {
                System.out.print("Introdueix el nom del fitxer o directori: ");
                nomPath = scn.nextLine().trim();

                // Si el nom està buit, es demana un nom vàlid.
                if (nomPath.isEmpty()) {
                    System.out.println("\nEl nom del fitxer o directori no pot estar buit. Si us plau, introdueix un nom vàlid.\n");
                } else {
                    boolean esNomValid = true;

                    // Valida que no conté caràcters prohibits.
                    for (int i = 0; i < nomPath.length(); i++) {
                        if (caractersProhibits.indexOf(nomPath.charAt(i)) != -1) {
                            esNomValid = false;
                            i = nomPath.length();
                        }
                    }

                    // Si el nom no és vàlid, es torna a demanar un nou nom.
                    if (!esNomValid) {
                        System.out.println("\nEl nom conté caràcters no vàlids. Si us plau, introdueix un nom vàlid.\n");
                        // Es neteja el nom per tornar a intentar-lo.
                        nomPath = "";
                    }
                }
            }

            File path = new File(nomPath);

            // Si el fitxer o directori existeix, es presenta un menú per gestionar-lo.
            if (path.exists()) {
                int opcio = 0;
                boolean utilitzat = false;

                while (opcio != 4) {
                    try {
                        System.out.println("\n'" + path.getName() + "' ja existeix. Què vols fer?");
                        System.out.println("1. Mostrar informació.");
                        System.out.println("2. Eliminar.");
                        System.out.println("3. Fer ús d'aquest en un exercici.");
                        System.out.println("4. Sortir.");
                        System.out.print("\nSelecciona una opció: ");
                        opcio = scn.nextInt();
                        scn.nextLine();

                        switch (opcio) {
                            case 1:
                                // Mostrar informació sobre el fitxer/directori.
                                mostrarInformacio(path);
                                if (path.isDirectory()) {
                                    // Si és un directori, es pregunta si vol llistar el seu contingut.
                                    System.out.println("\nVols llistar el contingut d'aquest directori? (s/n)");
                                    String resposta = scn.nextLine().toLowerCase();
                                    if (resposta.equals("s")) {
                                        // Si la resposta és 's', es llistaran els fitxers del directori.
                                        llistarContingutDirectori(path);
                                    }
                                }
                                break;

                            case 2:
                                // Confirma si l'usuari vol eliminar el fitxer/directori.
                                System.out.println("\nEstàs segur que vols eliminar '" + path.getName() + "'? (s/n)");
                                String confirmacio = scn.nextLine().toLowerCase();

                                // Si la resposta no és 's' o 'n', es repeteix fins a obtenir una resposta vàlida.
                                while (!confirmacio.equals("s") && !confirmacio.equals("n")) {
                                    System.out.println("\nResposta no vàlida. Si us plau, introdueix 's' per confirmar o 'n' per cancel·lar.");
                                    confirmacio = scn.nextLine().toLowerCase();
                                }

                                // Si es confirma, s'elimina el fitxer/directori.
                                if (confirmacio.equals("s")) {
                                    eliminarFitxerODirectori(path, scn);
                                    // Un cop eliminat, el mètode retorna 'null' per indicar que ja no existeix.
                                    return null;
                                } else {
                                    System.out.println("\nEliminació cancel·lada.");
                                }
                                break;

                            case 3:
                                utilitzat = true;
                                break;

                            case 4:
                                System.out.println("\nS'ha sortit.");
                                break;

                            default:
                                System.out.println("\nOpció no vàlida. Si us plau, selecciona una opció de les següents.");
                        }
                    } catch (InputMismatchException e) {
                        // Si l'usuari introdueix un valor que no és un número vàlid, es gestiona l'excepció.
                        System.err.println("\nError: Has d'introduir un número vàlid.");
                        // Es consumeix la línia per evitar problemes de bucles infinits.
                        scn.nextLine();
                    } catch (Exception e) {
                        // Captura altres errors inesperats.
                        System.err.println("\nError inesperat: " + e.getMessage());
                    }
                }

                // Quan l'usuari selecciona l'opció 3, el booleà utilitzat s'estableix a 'true' (el que indica que el fitxer/directori s'ha de tornar per fer-se servir en un altre exercici).
                // En les opcions anteriors, com la 1 (mostra informació) o 2 (eliminar), el valor 'utilitzat' no canvia, però l'usuari pot interactuar amb el fitxer sense sortir immediatament del menú.
                // Es controla el valor 'null' (en tots el mètodes) per assegurar-se que les operacions següents no tractin amb un fitxer/directori inexistent.
                if (utilitzat) {
                    return path;
                }
            } else {
                // Si el fitxer/directori no existeix, es crea un de nou.
                return crearFitxerODirectori(path, scn);
            }
        } catch (InputMismatchException e) {
            System.err.println("\nError: Has d'introduir un número vàlid.");
            // Es consumeix la línia per evitar problemes de bucles infinits.
            scn.nextLine();
        } catch (Exception e) {
            // Captura altres errors inesperats.
            System.err.println("\nError inesperat: " + e.getMessage());
        }

        // Si alguna cosa va malament o si no es fa cap acció, es retorna 'null'.
        return null;
    }

    // Mètode per mostrar informació detallada d'un fitxer o directori.
    public static void mostrarInformacio(File path) {
        try {
            // Mostra la informació bàsica del fitxer/directori.
            System.out.println("\nInformació de '" + path.getName() + "':");

            if (path.isFile()) {
                System.out.println("Tipus: Fitxer");
            } else if (path.isDirectory()) {
                System.out.println("Tipus: Directori");
            } else {
                System.out.println("Tipus: Desconegut");
            }

            System.out.println("Nom: " + path.getName());
            System.out.println("Ruta absoluta: " + path.getAbsolutePath());
            // Mostra la mida del fitxer en bytes (en el cas d'un directori es mostrarà la mida total del directori, inclòs el contingut).
            System.out.println("Mida (bytes): " + path.length());

        } catch (SecurityException e) {
            System.err.println("No tens permisos per accedir a aquest fitxer/directori.");
            System.err.println("Detall: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("S'ha produït un error inesperat.");
            System.err.println("Detall: " + e.getMessage());
        }
    }

    // Mètode que llista el contingut d'un directori.
    public static void llistarContingutDirectori(File directori) {
        try {
            if (directori == null) {
                System.out.println("El directori proporcionat és null.");
                return;
            }

            System.out.println("\nContingut del directori '" + directori.getName() + "':");

            // Obté una llista de fitxers i directoris dins del directori especificat.
            File[] contingut = directori.listFiles();

            // Si el directori té contingut, es llista el seu contingut.
            if (contingut != null) {
                if (contingut.length == 0) {
                    System.out.println("El directori està buit.");
                } else {
                    // Llista els elements dins del directori.
                    for (int i = 0; i < contingut.length; i++) {
                        File element = contingut[i];
                        String tipus = "";

                        // Comprova el tipus de cada element (fitxer o directori).
                        if (element.isDirectory()) {
                            tipus = "És un directori: ";
                        } else if (element.isFile()) {
                            tipus = "És un fitxer: ";
                        } else {
                            tipus = "És un element desconegut: ";
                        }

                        // Mostra el nom de cada element amb el seu tipus
                        System.out.println(tipus + element.getName() + "\n");
                    }
                }
            } else {
                System.out.println("No s'ha pogut llistar el contingut del directori.\n");
            }

        } catch (SecurityException e) {
            System.err.println("Error de seguretat: No es poden llegir els continguts del directori.");
            System.err.println("Detall: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("S'ha produït un error inesperat.");
            System.err.println("Detall: " + e.getMessage());
        }
    }

    // Mètode que crea un fitxer o un directori.
    public static File crearFitxerODirectori(File path, Scanner scn) {
        int opcio = 0;
        while (opcio != 3) {
            try {
                System.out.println("\n'" + path.getName() + "' no existeix. Què vols fer?\n");
                System.out.println("1. Crear un fitxer.");
                System.out.println("2. Crear un directori.");
                System.out.println("3. Sortir.\n");
                System.out.print("Selecciona una opció: ");
                opcio = scn.nextInt();
                scn.nextLine();

                switch (opcio) {
                    case 1:
                        // Cas 1: Crea un fitxer.
                        if (path.createNewFile()) {
                            System.out.println("\nFitxer creat amb èxit.\n");
                            // Mostra informació sobre el fitxer creat.
                            mostrarInformacio(path);
                            // Retorna el fitxer creat.
                            return path;
                        } else {
                            System.out.println("\nNo s'ha pogut crear el fitxer.\n");
                        }
                        break;
                    case 2:
                        // Cas 2: Crea un directori.
                        if (path.mkdirs()) {
                            System.out.println("\nDirectori creat amb èxit.\n");
                            // Mostra informació sobre el directori creat.
                            mostrarInformacio(path);
                            // Retorna el directori creat.
                            return path;
                        } else {
                            System.out.println("\nNo s'ha pogut crear el directori.\n");
                        }
                        break;
                    case 3:
                        System.out.println("\nS'ha sortit.\n");
                        // Retorna 'null' perquè no es crea res.
                        return null;
                    default:
                        System.out.println("\nOpció no vàlida.\n");
                }
            } catch (IOException e) {
                System.err.println("\nError d'entrada/sortida: " + e.getMessage() + "\n");
                // Retorna 'null' si es produeix un error d'entrada/sortida.
                return null;
            } catch (SecurityException e) {
                System.err.println("\nError de seguretat: No tens permisos per crear el fitxer/directori '" + path.getName() + "'.\n");
                return null;
            } catch (InputMismatchException e) {
                System.err.println("\nError: Has d'introduir un número vàlid.\n");
                // Neteja el buffer per evitar un bucle infinit.
                scn.nextLine();
            } catch (Exception e) {
                System.err.println("\nError inesperat: " + e.getMessage() + "\n");
                // Retorna 'null' per assegurar-se que no es crea res si es produeix un error inesperat.
                return null;
            }
        }

        // Si es surt del bucle sense crear res, es retorna 'null'.
        return null;
    }

    // Mètode que elimina un fitxer o un directori.
    public static void eliminarFitxerODirectori(File path, Scanner scn) {
        try {
            if (path.isDirectory()) {
                // Obté el contingut del directori (fitxers i subdirectoris).
                File[] contingut = path.listFiles();

                // Si el directori no està buit:
                if (contingut != null && contingut.length > 0) {
                    // Pregunta a l'usuari si vol eliminar tot el contingut (fitxers i subdirectoris).
                    System.out.println("\nEl directori no està buit. Segur que vols eliminar-lo amb tot el seu contingut? (s/n)");
                    String resposta = scn.nextLine().toLowerCase();

                    // Si l'usuari no confirma, es cancel·la l'operació.
                    if (!resposta.equals("s")) {
                        System.out.println("\nEliminació cancel·lada.\n");
                        return;
                    }

                    // Recorre i eliminar cada element del directori.
                    for (int i = 0; i < contingut.length; i++) {
                        File element = contingut[i];

                        if (element.isDirectory()) {
                            // Si és un directori, s'elimina de forma recursiva.
                            eliminarFitxerODirectori(element, scn);
                        } else {
                            // Si és un fitxer, s'elimina directament.
                            element.delete();
                        }
                    }
                }
            }

            // Intenta eliminar el fitxer o el directori buit.
            if (path.delete()) {
                System.out.println("\nS'ha eliminat correctament '" + path.getName() + "'.\n");
            } else {
                System.out.println("\nNo s'ha pogut eliminar '" + path.getName() + "'.\n");
            }

        } catch (SecurityException e) {
            System.err.println("\nError de seguretat: No tens permisos per eliminar '" + path.getName() + "'.\n");
        } catch (Exception e) {
            System.err.println("\nError inesperat en eliminar '" + path.getName() + "': " + e.getMessage() + "\n");
        }
    }

    // Exercici 2
    // Mètode per veure de prop el funcionament de les classes FileWriter i PrintWriter escrivint dades en un fitxer de text. 
    public static void escripturaFitxer(Scanner scn) {
        System.out.println(".................................................................");
        System.out.println("Benvingut al programa d'inserció de dades en un fitxer de text.");
        System.out.println(".................................................................\n");
        System.out.println("A continuació, se't conduirà a un programa que comprovarà si existeix el fitxer.");
        System.out.println("Si no existeix, se't donarà l'opció de crear-lo.\n");

        // Crida a la funció per verificar que existeix el fitxer, si no es dona l'opció de crear-ne un.
        File fitxer = gestioFitxerODirectori(scn);
        System.out.println("\nHas tornat al programa 'Inserció de dades en un fitxer de text'.\n");

        if ((fitxer != null) && (fitxer.isFile())) {
            int opcio = 0;

            try {
                while (opcio != 5) {
                    System.out.println("Què vols fer?");
                    System.out.println("1. Sobreescriure el fitxer amb FileWriter.");
                    System.out.println("2. Afegir línies en el fitxer amb FileWriter.");
                    System.out.println("3. Utilitzar PrintWriter per sobreescriure el fitxer.");
                    System.out.println("4. Utilitzar PrintWriter per afegir línies el fitxer.");
                    System.out.println("5. Sortir del programa.");
                    System.out.print("Selecciona una opció: ");

                    try {
                        opcio = scn.nextInt();
                        scn.nextLine();

                        String[] linies = null;

                        if (opcio != 5) {
                            System.out.print("Quantes línies de text vols introduir? ");
                            int numLinies = scn.nextInt();
                            scn.nextLine();

                            // Guarda les línies introduïdes per l'usuari.
                            linies = new String[numLinies];
                            for (int i = 0; i < numLinies; i++) {
                                System.out.print("Introdueix la línia " + (i + 1) + ": ");
                                linies[i] = scn.nextLine();
                            }
                        }

                        switch (opcio) {
                            case 1:
                                // Sobreescriure el fitxer amb FileWriter.
                                FileWriter fileWriterSobreescriure = null;
                                try {
                                    fileWriterSobreescriure = new FileWriter(fitxer);
                                    for (int i = 0; i < linies.length; i++) {
                                        fileWriterSobreescriure.write(linies[i] + "\n");
                                    }
                                    System.out.println("\nFitxer '" + fitxer.getName() + "' escrit (sobreescrit).\n");
                                } catch (IOException e) {
                                    System.err.println("\nError escrivint amb FileWriter (sobreescrivint): " + e.getMessage() + "\n");
                                } finally {
                                    // Tanca el FileWriter.
                                    if (fileWriterSobreescriure != null) {
                                        try {
                                            fileWriterSobreescriure.close();
                                        } catch (IOException e) {
                                            System.err.println("\nError tancant el FileWriter: " + e.getMessage() + "\n");
                                        }
                                    }
                                }
                                break;

                            case 2:
                                // Afegeix línies al fitxer amb FileWriter. 
                                FileWriter fileWriterAfegint = null;
                                try {
                                    fileWriterAfegint = new FileWriter(fitxer, true);
                                    for (int i = 0; i < linies.length; i++) {
                                        fileWriterAfegint.write(linies[i] + "\n");
                                    }
                                    System.out.println("\nFitxer '" + fitxer.getName() + "' escrit (afegint).\n");
                                } catch (IOException e) {
                                    System.err.println("\nError escrivint amb FileWriter (afegint): " + e.getMessage() + "\n");
                                } finally {
                                    // Tanca el FileWriter.
                                    if (fileWriterAfegint != null) {
                                        try {
                                            fileWriterAfegint.close();
                                        } catch (IOException e) {
                                            System.err.println("\nError tancant el FileWriter: " + e.getMessage() + "\n");
                                        }
                                    }
                                }
                                break;

                            case 3:
                                // Sobreescriure el fitxer amb PrintWriter.
                                PrintWriter printWriterSobreescriure = null;
                                try {
                                    printWriterSobreescriure = new PrintWriter(fitxer);
                                    for (int i = 0; i < linies.length; i++) {
                                        printWriterSobreescriure.println(linies[i]);
                                    }
                                    System.out.println("\nFitxer '" + fitxer.getName() + "' escrit amb PrintWriter.\n");
                                } catch (IOException e) {
                                    System.err.println("\nError escrivint amb PrintWriter: " + e.getMessage() + "\n");
                                } finally {
                                    // Tanca el PrintWriter.
                                    if (printWriterSobreescriure != null) {
                                        printWriterSobreescriure.close();
                                    }
                                }
                                break;

                            case 4:
                                // Afegeix línies el fitxer amb PrintWriter.
                                PrintWriter printWriterAfegir = null;
                                try {
                                    printWriterAfegir = new PrintWriter(new FileWriter(fitxer, true)); // <-- 'true' per afegir
                                    for (int i = 0; i < linies.length; i++) {
                                       printWriterAfegir.println(linies[i]);
                                    }
                                    System.out.println("\nLínies afegides al fitxer '" + fitxer.getName() + "' amb PrintWriter.\n");
                                } catch (IOException e) {
                                    System.err.println("\nError escrivint amb PrintWriter: " + e.getMessage() + "\n");
                                } finally {
                                    // Tanca el PrintWriter.
                                    if (printWriterAfegir != null) {
                                       printWriterAfegir.close();
                                    }
                               }
                               break;

                            case 5:
                                System.out.println("\nS'ha sortit del programa.\n");
                                break;

                            default:
                                System.out.println("\nOpció no vàlida. No s'ha fet cap escriptura.\n");
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("\nError: Has d'introduir un número vàlid.\n");
                        // Neteja el buffer per evitar bucles infinits.
                        scn.nextLine();
                    }
                }
            } catch (Exception e) {
                System.err.println("\nS'ha produït un error inesperat: " + e.getMessage() + "\n");
            }
        } else {
            System.out.println("\nNo s'ha pogut obtenir un fitxer vàlid per a l'escriptura.\n");
        }
    }

    // Exercici 3
    // Mètode per llegir el contingut d'un fitxer de text amb diferents tècniques de lectura.
    public static void lecturaFitxer(Scanner scn) {
        System.out.println("...................................................................");
        System.out.println("Benvingut al programa de lectura del contingut d'un fitxer de text.");
        System.out.println("...................................................................\n");
        System.out.println("A continuació, se't conduirà a un programa que comprovarà si existeix el fitxer.");
        System.out.println("Si no existeix, se't donarà l'opció de crear-lo.\n");

        // Crida al mètode per verificar si el fitxer existeix, i sinó, permet crear-lo.
        File fitxerLectura = gestioFitxerODirectori(scn);
        System.out.println("\nHas tornat al programa 'Lectura del contingut d'un fitxer de text'.\n");

        if ((fitxerLectura != null) && (fitxerLectura.isFile())) {
            int opcio = 0;

            while (opcio != 5) {
                System.out.println("Quina lectura vols realitzar?");
                System.out.println("1. Lectura amb FileReader.");
                System.out.println("2. Lectura amb BufferedReader.");
                System.out.println("3. Lectura línia a línia amb Scanner.");
                System.out.println("4. Lectura paraula a paraula amb Scanner.");
                System.out.println("5. Sortir del programa.");
                System.out.print("Selecciona una opció: ");

                try {
                    opcio = scn.nextInt();
                    scn.nextLine();

                    switch (opcio) {
                        case 1:
                            // Lectura amb FileReader caràcter a caràcter.
                            System.out.println("\n--- Lectura amb FileReader ---\n");
                            FileReader fileReader = null;
                            try {
                                fileReader = new FileReader(fitxerLectura);
                                int caracter;
                                while ((caracter = fileReader.read()) != -1) {
                                    System.out.println("Caràcter: '" + (char) caracter + "' (Unicode: " + caracter + ")");
                                }
                                System.out.println("\nLectura de '" + fitxerLectura.getName() + "' amb FileReader completada.\n");
                            } catch (FileNotFoundException e) {
                                System.err.println("\nError: El fitxer '" + fitxerLectura.getName() + "' no s'ha trobat.\n");
                            } catch (IOException e) {
                                System.err.println("\nError d'entrada/sortida durant la lectura amb FileReader: " + e.getMessage() + "\n");
                            } catch (SecurityException e) {
                                System.err.println("\nError de seguretat: No tens permís per llegir el fitxer '" + fitxerLectura.getName() + "'.\n");
                            } finally {
                                if (fileReader != null) {
                                    try {
                                        // Tanca el FileReader.
                                        fileReader.close();
                                    } catch (IOException e) {
                                        System.err.println("\nError al tancar FileReader: " + e.getMessage() + "\n");
                                    }
                                }
                            }
                            break;

                        case 2:
                            // Lectura amb BufferedReader línia a línia.
                            System.out.println("\n--- Lectura amb BufferedReader ---\n");
                            BufferedReader bufferedReader = null;
                            try {
                                bufferedReader = new BufferedReader(new FileReader(fitxerLectura));
                                String linia;
                                while ((linia = bufferedReader.readLine()) != null) {
                                    System.out.println("Línia: " + linia);
                                }
                                System.out.println("\nLectura de '" + fitxerLectura.getName() + "' amb BufferedReader completada.\n");
                            } catch (FileNotFoundException e) {
                                System.err.println("\nError: El fitxer '" + fitxerLectura.getName() + "' no s'ha trobat.\n");
                            } catch (IOException e) {
                                System.err.println("\nError d'entrada/sortida durant la lectura amb BufferedReader: " + e.getMessage() + "\n");
                            } catch (SecurityException e) {
                                System.err.println("\nError de seguretat: No tens permís per llegir el fitxer '" + fitxerLectura.getName() + "'.\n");
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        // Tanca el BufferedReader.
                                        bufferedReader.close();
                                    } catch (IOException e) {
                                        System.err.println("\nError al tancar BufferedReader: " + e.getMessage() + "\n");
                                    }
                                }
                            }
                            break;

                        case 3:
                            // Lectura línia a línia amb Scanner.
                            System.out.println("\n--- Lectura línia a línia amb Scanner ---\n");
                            Scanner scannerLinia = null;
                            try {
                                scannerLinia = new Scanner(fitxerLectura);
                                while (scannerLinia.hasNextLine()) {
                                    System.out.println("Línia: " + scannerLinia.nextLine());
                                }
                                System.out.println("\nLectura de '" + fitxerLectura.getName() + "' línia a línia amb Scanner completada.\n");
                            } catch (FileNotFoundException e) {
                                System.err.println("\nError: El fitxer '" + fitxerLectura.getName() + "' no s'ha trobat.\n");
                            } catch (SecurityException e) {
                                System.err.println("\nError de seguretat: No tens permís per llegir el fitxer '" + fitxerLectura.getName() + "'.\n");
                            } finally {
                                // Tanca el Scanner.
                                if (scannerLinia != null) {
                                    scannerLinia.close();
                                }
                            }
                            break;

                        case 4:
                            // Lectura paraula a paraula amb Scanner.
                            System.out.println("\n--- Lectura de paraules amb Scanner ---\n");
                            Scanner scannerParaula = null;
                            try {
                                scannerParaula = new Scanner(fitxerLectura);
                                while (scannerParaula.hasNext()) {
                                    System.out.println("Paraula: " + scannerParaula.next());
                                }
                                System.out.println("\nLectura de '" + fitxerLectura.getName() + "' paraula a paraula amb Scanner completada.\n");
                            } catch (FileNotFoundException e) {
                                System.err.println("\nError: El fitxer '" + fitxerLectura.getName() + "' no s'ha trobat.\n");
                            } catch (SecurityException e) {
                                System.err.println("\nError de seguretat: No tens permís per llegir el fitxer '" + fitxerLectura.getName() + "'.\n");
                            } finally {
                                // Tanca el Scanner.
                                if (scannerParaula != null) {
                                    scannerParaula.close();
                                }
                            }
                            break;

                        case 5:
                            System.out.println("\nSortint del programa...\n");
                            break;

                        default:
                            System.out.println("\nOpció no vàlida. Si us plau, selecciona una opció vàlida del menú.\n");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.err.println("\nError: Has d'introduir un número sencer vàlid.\n");
                    scn.nextLine();
                }
            }
        } else {
            System.out.println("\nNo s'ha pogut obtenir un fitxer vàlid per a la lectura.\n");
        }
        // Diferències de les diferents tècniques de lectura
        // 1. FileReader
        // - Permet llegir el fitxer caràcter a caràcter. Cada caràcter és llegit com un número (Unicode).
        // - És útil si vols analitzar exactament cada símbol que hi ha dins del fitxer.
        // - Per exemple: si vols comptar quantes lletres “a” hi ha, et pot anar bé.
        // - Però no et permet llegir línies senceres o paraules directament. Ho hauries de fer tu manualment.
        // - És més lent amb fitxers grans, perquè llegeix un caràcter cada vegada.
        // 2. BufferedReader
        // - Llegeix línies senceres de manera molt eficient. Usa una memòria intermèdia (buffer) per fer-ho més ràpid.
        // - Ideal si vols processar el text línia per línia, com per exemple imprimir cada frase del fitxer.
        // - No serveix per llegir paraules o caràcters directament com el Scanner o el FileReader, però pots combinar-ho amb altres eines.
        // - No és tan pràctic si vols analitzar números o paraules específiques dins d’una línia, ho hauries de separar tu amb `.split()`.
        // 3. Scanner
        // - És molt flexible i fàcil d’utilitzar. Pots llegir línies (`nextLine()`), paraules (`next()`), o fins i tot números (`nextInt()`, `nextDouble()`, etc.).
        // - És ideal si el teu fitxer té dades estructurades, com llistes de noms, números, etc.
        // - No és tan ràpid com BufferedReader si només vols llegir línia a línia sense fer gaire processament.
        // - No pot llegir caràcters sols de manera directa com FileReader, però pots simular-ho si ho necessites.
        //Conclusió
        // Si només vols llegir i mostrar tot el contingut del fitxer de forma ràpida → utilitza BufferedReader.
        // Si vols analitzar números o paraules específiques → utilitza Scanner.
        // Si necessites controlar caràcter per caràcter (per exemple, per comptar símbols) → utilitza FileReader.
    }

    // Exercici 4
    // Aquest programa permet a l'usuari introduir des de la pantalla les dades dels productes (nom, preu i quantitat), que es desaran automàticament en el fitxer que l'usuari creï o triï. 
    // Després, el programa pot llegir la informació d'aquest fitxer per calcular el valor total de tots els productes emmagatzemats, mostrant així el cost complet de l'inventari.
    // Mètode per iniciar la gestió d'un inventari.
    // Aquest mètode demana a l'usuari quants productes vol afegir a un inventari i guarda la informació en un fitxer.
    // Després mostra el contingut d'aquest fitxer. 
    public static void gestioInventariInici(Scanner scn) {
        System.out.println("...............................................");
        System.out.println("Benvingut al programa de gestió d'un inventari.");
        System.out.println("...............................................\n");
        System.out.println("Per fer ús d'aquest programa, es necessita un fitxer.");
        System.out.println("A continuació, se't conduirà a un programa que comprovarà si existeix el fitxer.");
        System.out.println("Si no existeix, se't donarà l'opció de crear-lo.\n");

        // Es verifica si ja existeix un fitxer d'inventari, sinó es dona l'opció de crear-ne un.
        File fitxerInventari = gestioFitxerODirectori(scn);
        System.out.println("\nHas tornat al programa 'Gestió d'un inventari'.\n");

        if ((fitxerInventari != null) && (fitxerInventari.isFile())) {
            int numProductes = 0;
            boolean numValid = false;

            while (!numValid) {
                System.out.print("Quants productes vols afegir a l'inventari? ");
                try {
                    numProductes = Integer.parseInt(scn.nextLine());
                    numValid = true;
                } catch (NumberFormatException e) {
                    System.err.println("\nError: Has d'introduir un número sencer vàlid.\n");
                }
            }

            // Si el nombre de productes és positiu, s'inicia el procés de guardar-los al fitxer.
            if (numProductes > 0) {
                // Crida al mètode per guardar la informació dels productes al fitxer.
                gestioInventariGuardarInformacio(fitxerInventari.getName(), numProductes, scn);
            } else {
                // Si l'usuari introdueix 0 o un nombre negatiu, es mostra un missatge.
                System.out.println("\nNo s'afegiran productes a l'inventari.\n");
            }

            // Després de guardar les dades, es mostra el contingut de l’inventari.
            gestioInventariLlegirInformacio(fitxerInventari.getName());

        } else {
            System.out.println("\nNo s'ha pogut inicialitzar la gestió de l'inventari.\n");
        }
    }

    // Aquest mètode permet introduir un conjunt de productes (nom, preu i quantitat) i guardar-los en un fitxer de text.
    // Cada producte es guarda en una línia amb el format: nom preu quantitat.
    public static void gestioInventariGuardarInformacio(String nomFitxer, int numProductes, Scanner scn) {
        BufferedWriter writer = null;

        try {
            // Obre el fitxer per escriure-hi (sobreescriu si ja existeix).
            writer = new BufferedWriter(new FileWriter(nomFitxer));

            System.out.println("\nIntroducció de productes:\n");

            // Bucle per demanar dades de cada producte (nom, preu i quantitat).
            for (int i = 0; i < numProductes; i++) {
                System.out.println("Producte " + (i + 1) + ":");

                // Es demana el nom del producte.
                System.out.print("Nom del producte: ");
                String nomProducte = scn.nextLine();

                double preuProducte = 0;
                int quantitatProducte = 0;

                // Es demana el preu del producte, controlant errors de format.
                boolean preuValid = false;
                while (!preuValid) {
                    System.out.print("Preu unitari: ");
                    try {
                        preuProducte = Double.parseDouble(scn.nextLine());
                        preuValid = true;
                    } catch (NumberFormatException e) {
                        System.err.println("Format incorrecte. Torna a introduir un preu vàlid.\n");
                    }
                }

                // Es demana la quantitat del producte, controlant errors de format.
                boolean quantitatValida = false;
                while (!quantitatValida) {
                    System.out.print("Quantitat disponible: ");
                    try {
                        quantitatProducte = Integer.parseInt(scn.nextLine());
                        quantitatValida = true;
                    } catch (NumberFormatException e) {
                        System.err.println("Format incorrecte. Torna a introduir una quantitat vàlida.\n");
                    }
                }

                // Escriu la informació del producte en el fitxer.
                writer.write(nomProducte + " " + preuProducte + " " + quantitatProducte);
                writer.newLine();
            }

            // Missatge de confirmació després de desar les dades en el fitxer.
            System.out.println("\nS'han inserit les dades de l'inventari correctament al fitxer '" + nomFitxer + "'.");

        } catch (IOException e) {
            System.err.println("Error en escriure al fitxer '" + nomFitxer + "': " + e.getMessage());
        } catch (Exception e) {
            System.err.println("S'ha produït un error inesperat: " + e.getMessage());
        } finally {
            // Es tanca el BufferedWriter per evitar fuites de recursos.
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Error en tancar el fitxer: " + e.getMessage());
                }
            }
        }
    }

    // Mètode per llegir la informació d’un fitxer d’inventari.
    // Llegeix el nom, preu i quantitat de cada producte, calcula el valor total i el mostra per pantalla.
    public static void gestioInventariLlegirInformacio(String nomFitxer) {
        double costTotalInventari = 0;
        BufferedReader reader = null;

        try {
            // Obro el fitxer per llegir-lo.
            reader = new BufferedReader(new FileReader(nomFitxer));
            String linia;

            System.out.println("\nContingut de l'inventari i valor per producte:\n");

            // Llegeixo cada línia del fitxer.
            while ((linia = reader.readLine()) != null) {
                // Separo cada línia pels espais per obtenir els diferents valors.
                String[] parts = linia.trim().split("\\s+");

                // Comprovo que hi hagi exactament 3 valors: nom, preu i quantitat.
                if (parts.length == 3) {
                    String nomProducte = parts[0];

                    try {
                        // Converteixo el preu i la quantitat a valors numèrics.
                        double preu = Double.parseDouble(parts[1]);
                        int quantitat = Integer.parseInt(parts[2]);

                        // Calculo el valor total del producte i l'acumulo en el cost total de l'inventari.
                        double valorProducte = preu * quantitat;
                        costTotalInventari += valorProducte;

                        // Mostro el resultat per cada producte.
                        System.out.printf("\n%s: %d unitats x %.2f€/u = %.2f€", nomProducte, quantitat, preu, valorProducte);
                    } catch (NumberFormatException e) {
                        System.err.println("Error de format numèric a la línia: \"" + linia + "\".");
                    }
                } else if (!linia.trim().isEmpty()) {
                    System.err.println("Format de línia incorrecte: \"" + linia + "\" (s'esperaven 3 camps separats per espais).");
                }
            }

            // Mostro el cost total de l'inventari.
            System.out.printf("\nEl cost total de l'inventari és de: %.2f €\n", costTotalInventari);

        } catch (FileNotFoundException e) {
            System.err.println("No s'ha trobat el fitxer '" + nomFitxer + "'.");
        } catch (IOException e) {
            System.err.println("Error en llegir el fitxer '" + nomFitxer + "': " + e.getMessage());
        } catch (Exception e) {
            System.err.println("S'ha produït un error inesperat: " + e.getMessage());
        } finally {
            // Tanco el BufferedReader per evitar fuites de recursos.
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error en tancar el fitxer: " + e.getMessage());
                }
            }
        }
    }

    // Exercici 5
    // Aquest programa extreu totes les paraules d’un fitxer de text i genera un "diccionari" de paraules úniques, 
    // ordenades alfabèticament, eliminant duplicats i netejant-les de caràcters no permesos.
    public static void GenerarDiccionari(Scanner scn) {
        System.out.println("....................................");
        System.out.println("Benvinguts al diccionari de Paraules");
        System.out.println("....................................");
        System.out.println("Per fer ús d'aquest programa, es necessita un fitxer.");
        System.out.println("A continuació, se't conduirà a un programa que comprovarà si existeix el fitxer.");
        System.out.println("Si no existeix, se't donarà l'opció de crear-lo.");

        try {
            // Crida al mètode que comprova si el fitxer existeix (i dona opció de crear-lo si no existeix).
            File fitxer = gestioFitxerODirectori(scn);
            System.out.println("Has tornat al programa 'Diccionari de paraules'.");

            if (fitxer != null && fitxer.isFile()) {
                // Llegeix totes les paraules del fitxer i les guarda en un array.
                String[] totesLesParaules = llegirFitxerIObtenirParaules(fitxer.getName());

                if (totesLesParaules != null) {
                    // Elimina les paraules duplicades.
                    String[] paraulesUniques = eliminarDuplicats(totesLesParaules);
                    System.out.println("S'han eliminat les paraules duplicades.");

                    if (paraulesUniques != null) {
                        // Ordena les paraules úniques alfabèticament.
                        ordenarParaules(paraulesUniques);
                        System.out.println("Les paraules úniques s'han ordenat alfabèticament.");

                        // Genera un fitxer amb les paraules úniques i ordenades.
                        generarFitxerDiccionari(fitxer.getName(), paraulesUniques);
                        System.out.println("S'ha generat el fitxer " + fitxer.getName() + " amb les paraules úniques i ordenades.");

                        // Mostra un informe final amb informació del procés.
                        mostrarInformeFinal(totesLesParaules, paraulesUniques, fitxer.getName(), scn);
                    } else {
                        System.err.println("Error: No s'han pogut eliminar els duplicats.");
                    }
                } else {
                    System.err.println("Error: No s'han pogut llegir les paraules del fitxer.");
                }
            } else {
                System.err.println("Error: No s'ha proporcionat un fitxer vàlid.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Error: Entrada no vàlida. " + e.getMessage());
            scn.nextLine(); // Netegem l'entrada en cas d'error de tipus.
        } catch (SecurityException e) {
            System.err.println("Error: No tens permisos per accedir al fitxer o directori. " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Error inesperat: S'ha produït un problema amb valors nuls. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperat: " + e.getMessage());
        }
    }

    // Mètode que llegeix un fitxer de text, compta les paraules, crida a un altre mètode per netejar-les de caràcters no permesos 
    // i les guarda en un array. També retorna aquest array amb les paraules netejades.  
    public static String[] llegirFitxerIObtenirParaules(String nomFitxer) {
        int contadorParaules = 0;
        BufferedReader br = null;

        // Primer pas: comptar quantes paraules hi ha al fitxer.
        try {
            br = new BufferedReader(new FileReader(nomFitxer));
            String linia = "";
            // Llegeixo el fitxer línia per línia.
            while ((linia = br.readLine()) != null) {
                // Es divideix cada línia en paraules, separant per espais o tabulacions.
                String[] paraulesLinia = linia.split("\\s+");
                // S'afegeix el nombre de paraules trobades a la línia al comptador total.
                contadorParaules += paraulesLinia.length;
            }
        } catch (IOException e) {
            System.err.println("Error en llegir el fitxer: " + e.getMessage());
            return null;
        } finally {
            // Es tanca el BufferedReader després de llegir el fitxer per evitar fuites de recursos.
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error en tancar el fitxer: " + e.getMessage());
                }
            }
        }

        // Es crea un array per guardar totes les paraules, amb la mida exacta segons el comptador.
        String[] paraules = new String[contadorParaules];
        // Índex per controlar a quina posició de l'array guardo la següent paraula.
        int index = 0;

        br = null;

        // Segon pas: llegir el fitxer novament per omplir l'array amb les paraules netejades.
        try {
            br = new BufferedReader(new FileReader(nomFitxer));
            String linia = "";
            // Es llegeix el fitxer línia per línia.
            while ((linia = br.readLine()) != null) {
                // Converteix tota la línia a minúscules i la divideix en paraules.
                String[] paraulesLinia = linia.toLowerCase().split("\\s+");
                // Recorre totes les paraules de la línia.
                for (int i = 0; i < paraulesLinia.length; i++) {
                    // Neteja cada paraula, eliminant caràcters no permesos (signes de puntuació, etc.).
                    String paraulaNetajada = netejarParaula(paraulesLinia[i]);
                    // Si la paraula no és buida després de netejar-la.
                    if ((paraulaNetajada != null) && (!paraulaNetajada.isEmpty())) {
                        // Es guarda la paraula netejada a l'array en la posició corresponent.
                        paraules[index] = paraulaNetajada;
                        // S'incrementa l'índex per afegir la següent paraula.
                        index++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error en llegir el fitxer: " + e.getMessage());
            return null;
        } finally {
            // Es tanca el BufferedReader després de llegir el fitxer per evitar fuites de recursos.
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error en tancar el fitxer: " + e.getMessage());
                }
            }
        }

        // Si el nombre de paraules netejades és menor que la mida de l'array inicial, s'ajusta la mida de l'array.
        if (index < paraules.length) {
            // Es crea un nou array amb la mida exacta i es copia les paraules netejades.
            String[] resultat = new String[index];
            for (int i = 0; i < index; i++) {
                resultat[i] = paraules[i];
            }
            // Es retorna l'array ajustat amb les paraules netejades.
            return resultat;
        }

        // Si no cal ajustar la mida, es retorna l'array original.
        return paraules;
    }

    // Mètode que elimina els caràcters no permesos d'una paraula, retornant una versió "netejada" d'aquesta.
    public static String netejarParaula(String paraula) {
        // Si la paraula és 'null', retorno una cadena buida.
        if (paraula == null) {
            return "";
        } else {
            // Es defineix els caràcters no permesos que vull eliminar de la paraula.
            String simbolsNoPermesos = "\\.,;!?()[]{}\"'<>@#$%^&*+=-_";

            // Es crea una cadena buida per anar construint la paraula netejada.
            String paraulaNetajada = "";

            // Es recorre cada caràcter de la paraula original.
            for (int i = 0; i < paraula.length(); i++) {
                // S'agafa el caràcter actual.
                char caracter = paraula.charAt(i);

                // Si el caràcter no és un símbol no permès, l'afegeixo a la nova paraula.
                if (simbolsNoPermesos.indexOf(caracter) == -1) {
                    paraulaNetajada += caracter;
                }
            }

            // Es retorna la paraula ja netejada, sense símbols no permesos.
            return paraulaNetajada;
        }
    }

    // Mètode que elimina les paraules duplicades d'un array de Strings i retorna un nou array només amb les paraules úniques.
    public static String[] eliminarDuplicats(String[] paraules) {

        // Es crea un array temporal per guardar les paraules úniques (sense duplicats).
        String[] paraulesUniques = new String[paraules.length];

        // Variable per portar el compte de les paraules úniques trobades.
        int countUniques = 0;

        // Variable booleana per controlar si una paraula ja ha estat afegida.
        boolean duplicat = false;

        // Recorro totes les paraules de l'array original per verificar si són duplicades.
        for (int i = 0; i < paraules.length; i++) {
            duplicat = false;

            // Es comprova si la paraula actual ja existeix entre les paraules úniques trobades fins ara.
            for (int j = 0; j < countUniques; j++) {
                // Si es troba una coincidència, es marca 'duplicat' com 'true' i es surt del bucle.
                if (paraules[i].equals(paraulesUniques[j])) {
                    duplicat = true;
                    break;
                }
            }

            // Si la paraula no és duplicada, la guarda a l'array de paraules úniques.
            if (!duplicat) {
                paraulesUniques[countUniques] = paraules[i];
                // S'incrementa el comptador de paraules úniques.
                countUniques++;
            }
        }

        // Es crea un nou array amb la mida exacta per contenir només les paraules úniques.
        String[] resultat = new String[countUniques];

        // Es copia les paraules úniques a l'array resultat.
        for (int i = 0; i < countUniques; i++) {
            resultat[i] = paraulesUniques[i];
        }

        // Es retorna l'array amb només les paraules úniques.
        return resultat;
    }

    // Programa que ordena alfabèticament un array de paraules comparant-les i inserint cada paraula en la seva posició correcta amb el mètode 'insertion sort'.
    public static void ordenarParaules(String[] paraulesUniques) {
        // Comença des de la segona paraula (índex 1), ja que la primera ja es considera ordenada.
        for (int i = 1; i < paraulesUniques.length; i++) {
            // Guarda la paraula actual que es vol inserir a la seva posició correcta.
            String key = paraulesUniques[i];

            // Índex de la paraula anterior, per començar la comparació cap enrere.
            int j = i - 1;

            // Mentre hi hagi paraules a l'esquerra i la paraula anterior sigui major (alfabèticament) que la 'key'.
            while (j >= 0 && paraulesUniques[j].compareTo(key) > 0) {
                // Desplaça la paraula cap a la dreta per fer espai a la 'key'.
                paraulesUniques[j + 1] = paraulesUniques[j];
                j--;
            }
            // Insereix la 'key' en la seva posició correcta dins de l'array ordenat.
            paraulesUniques[j + 1] = key;
        }
    }

    // Mètode que genera un fitxer amb les paraules úniques ordenades alfabèticament, afegint també, en la línia final, el total de paraules úniques que hi ha.
    public static void generarFitxerDiccionari(String nomFitxer, String[] paraulesUniquesOrdenades) {
        PrintWriter printWriter = null;
        FileWriter fileWriter = null;

        try {
            // Obre el fitxer amb FileWriter i després utilitza PrintWriter per escriure text en ell de manera més fàcil i controlada.
            fileWriter = new FileWriter(nomFitxer);
            printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < paraulesUniquesOrdenades.length; i++) {
                printWriter.println(paraulesUniquesOrdenades[i]);
            }

            printWriter.println("Total de paraules úniques: " + paraulesUniquesOrdenades.length);

        } catch (IOException e) {
            System.err.println("Error en escriure al fitxer '" + nomFitxer + "': " + e.getMessage() + "\n");

        } catch (Exception e) {
            System.err.println("Ha ocorregut un error inesperat: " + e.getMessage() + "\n");

        } finally {
            // Es tanca els recursos utilitzats (FileWriter i PrintWriter) per evitar fuites de recursos.
            try {
                if (printWriter != null) {
                    printWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Error en tancar els recursos: " + e.getMessage() + "\n");
            }
        }
    }

    // Mètode per validar el nombre de línies a llegir, assegurant que no siguin negatives ni superin el total disponible.
    public static int validarNombreLinies(int linies, int totalLinies, Scanner scn) {
        // Mentre alguna de les dues variables sigui negativa, demano de nou els valors.
        while (linies < 0 || totalLinies < 0) {
            try {
                System.out.println("El nombre de línies no pot ser negatiu. Torna a introduir els valors:\n");
                System.out.print("Nombre de línies a llegir: ");
                linies = scn.nextInt();
                System.out.print("Total de línies disponibles: ");
                totalLinies = scn.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no vàlida. Has d'introduir un número enter.\n");
                // Neteja el buffer per evitar bucles infinits.
                scn.nextLine();
            }
        }

        // Si el nombre de línies a llegir és superior al total disponible, l'ajusta a la quantitat màxima disponible.
        if (linies > totalLinies) {
            System.out.println("El fitxer només té " + totalLinies + " línies. Es mostraran aquestes.\n");
            linies = totalLinies;
        }

        // Retorna el nombre de línies vàlid.
        return linies;
    }

    // Mètode per llegir i mostrar les primeres línies d'un fitxer.
    // Aquest crida a un altre mètode que valida el nombre de línies a llegir i, si és vàlid, les mostra a la consola.
    public static void llegirPrimeresLinies(String nomFitxer, int linies, int totalLinies, Scanner scn) {
        BufferedReader reader = null;
        try {
            // Obre el fitxer per llegir-lo línia per línia.
            reader = new BufferedReader(new FileReader(nomFitxer));
            String linia = "";
            int cont = 0;

            // Es comprova si el fitxer està buit.
            if (totalLinies == 0) {
                System.out.println("El fitxer està buit.\n");
            } else {
                // Es valida el nombre de línies a llegir (m'asseguro que no sigui negatiu ni superior al total de línies disponibles).
                linies = validarNombreLinies(linies, totalLinies, scn);

                // Llegeix i mostra les primeres línies fins arribar al límit especificat per 'linies'.
                while ((linia = reader.readLine()) != null && cont < linies) {
                    System.out.println(linia);
                    cont++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage() + "\n");
        } finally {
            try {
                // Es tanca el BufferedReader per evitar fuites de recursos.
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error tancant el fitxer: " + e.getMessage() + "\n");
            }
        }
    }

    // Mètode per llegir i mostrar les últimes línies d'un fitxer.
    // Aquest crida a un altre mètode que valida el nombre de línies a llegir i, si és vàlid, mostra les últimes línies del fitxer.
    public static void llegirUltimesLinies(String nomFitxer, int linies, int totalLinies, String[] paraulesUniques, Scanner scn) {
        BufferedReader reader = null;
        try {
            // Obre el fitxer per llegir-lo.
            reader = new BufferedReader(new FileReader(nomFitxer));

            // Es comprova si el fitxer està buit.
            if (totalLinies == 0) {
                System.out.println("El fitxer està buit.\n");
            } else {
                // Es valida el nombre de línies a llegir (m'asseguro que no sigui negatiu ni superior al total de línies disponibles).
                linies = validarNombreLinies(linies, totalLinies, scn);

                // Mostra les últimes línies de l'array de paraules úniques.
                for (int i = totalLinies - linies; i < totalLinies; i++) {
                    System.out.println(paraulesUniques[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage() + "\n");
        } finally {
            try {
                // Es tanca el BufferedReader per evitar fuites de recursos.
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error tancant el fitxer: " + e.getMessage() + "\n");
            }
        }
    }

    // Mètode per llegir i mostrar tot el contingut d'un fitxer.
    // Aquest mètode llegeix el fitxer línia per línia i mostra el seu contingut per la consola.
    public static void llegirTotElFitxer(String nomFitxer) {
        BufferedReader reader = null;

        try {
            // Es crea un BufferedReader per llegir el fitxer línia per línia.
            reader = new BufferedReader(new FileReader(nomFitxer));
            String linia = "";

            // Es llegeix cada línia del fitxer fins arribar al final (quan el valor retornat és 'null').
            while ((linia = reader.readLine()) != null) {
                // Es mostra la línia llegida per pantalla.
                System.out.println(linia);
            }

        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage() + "\n");

        } finally {
            try {
                // Es tanca el BufferedReader per evitar fuites de recursos.
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error tancant el fitxer: " + e.getMessage() + "\n");
            }
        }
    }

    // Mètode principal per mostrar un informe final amb opcions per llegir el fitxer.
    // Aquest mètode mostra per pantalla quantes paraules ha trobat en total al principi (abans d’eliminar duplicats)
    // i quantes han quedat després de treure’n les repeticions.
    // A més, permet a l'usuari triar diferents opcions per llegir el fitxer.
    public static void mostrarInformeFinal(String[] totesLesParaules, String[] paraulesUniques, String nomFitxer, Scanner scn) {
        System.out.println("--------------");
        System.out.println("Informe Final");
        System.out.println("--------------");

        // Mostra el nombre total de paraules trobades en el fitxer inicial (abans de l'eliminació de duplicats).
        if (totesLesParaules != null) {
            System.out.println("Nombre total de paraules trobades al principi: " + totesLesParaules.length);
        } else {
            System.out.println("No s'han trobat paraules.\n");
        }

        // Mostra el nombre de paraules úniques després d'eliminar duplicats.
        if (paraulesUniques != null) {
            System.out.println("Nombre de paraules úniques després d'eliminar duplicats: " + paraulesUniques.length);

            int opcio = 0;
            while (opcio != 4) {
                try {
                    System.out.println("\nQuè vols fer?");
                    System.out.println("1. Llegir primeres línies.");
                    System.out.println("2. Llegir últimes línies.");
                    System.out.println("3. Llegir tot el fitxer.");
                    System.out.println("4. Sortir del programa.");
                    System.out.print("Escull una opció: \n");
                    opcio = scn.nextInt();
                    scn.nextLine();

                    switch (opcio) {
                        case 1:
                            // Crida al mètode 'llegirPrimeresLinies' per llegir les primeres línies del fitxer.
                            System.out.println("Quantes línies vols llegir del principi del fitxer?");
                            int liniesPrimeres = scn.nextInt();
                            llegirPrimeresLinies(nomFitxer, liniesPrimeres, paraulesUniques.length, scn);
                            break;
                        case 2:
                            // Crida al mètode 'llegirUltimesLinies' per llegir les últimes línies del fitxer.
                            System.out.println("Quantes línies vols llegir del final del fitxer?");
                            int liniesUltimes = scn.nextInt();
                            llegirUltimesLinies(nomFitxer, liniesUltimes, paraulesUniques.length, paraulesUniques, scn);
                            break;
                        case 3:
                            // Crida al mètode 'llegirTotElFitxer' per llegir tot el fitxer.
                            llegirTotElFitxer(nomFitxer);
                            break;
                        case 4:
                            System.out.println("S'ha sortit del programa.\n");
                            break;
                        default:
                            System.out.println("Opció no vàlida.\n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no vàlida. Has d'introduir un número.\n");
                    // Es neteja el buffer de l'input per evitar bucles infinits.
                    scn.nextLine();
                }
            }

        } else {
            System.out.println("No s'han trobat paraules úniques.\n");
        }
    }
}
