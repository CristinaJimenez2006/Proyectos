package tasca_gestió_de_fitxers;

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

public class Tasca_Gestió_de_fitxers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Aquest mètode mostrarà un menú d'opcions a l'usuari.
        menu(scn);

        // Es tanca el Scanner per evitar possibles fuites de memòria.
        scn.close();
    }

    public static void menu(Scanner scn) {
        int opcio = 0;
        while (opcio != 6) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Menú");
            System.out.println("1. Verificació i creació (si no existeix) d'un fitxer de text o un directori.");
            System.out.println("2. Inserció de dades en un fitxer de text.");
            System.out.println("3. Lectura del contingut d'un fitxer de text.");
            System.out.println("4. Gestió d'un inventari.");
            System.out.println("5. Diccionari de paraules.");
            System.out.println("6. Sortir del programa.");
            System.out.println("---------------------------------------------------------------");
            System.out.println("Escull una opció (introdueix el número de l'opció escollida)...");
            opcio = scn.nextInt();
            // Per consumir el salt de línia pendent després de nextInt(). 
             scn.nextLine(); 
             
            switch (opcio) {
                // Si l'usuari selecciona l'opció 1, es crida al mètode 'verificarCrearFitxer' per crear o verificar un fitxer.
                case 1:
                    verificarCrearFitxer(scn);
                    break;

                // Si l'usuari selecciona l'opció 2, es crida al mètode 'escripturaFitxer' per escriure en un fitxer.
                case 2:
                    escripturaFitxer(scn);
                    break;

                // Si l'usuari selecciona l'opció 3, es crida al mètode 'lecturaFitxer' per llegir el contingut d'un fitxer.
                case 3:
                    lecturaFitxer(scn);
                    break;

                // Si l'usuari selecciona l'opció 4, es crida al mètode 'gestioInventariInici' per gestionar un inventari.
                case 4:
                    gestioInventariInici(scn);
                    break;

                // Si l'usuari selecciona l'opció 5, es crida al mètode 'GenerarDiccionari' per generar un diccionari de paraules.
                case 5:
                    GenerarDiccionari(scn);
                    break;

                // Si l'usuari selecciona l'opció 6, es mostra un missatge de sortida del programa i el bucle s'acaba.
                case 6:
                    System.out.println("S'ha sortit del programa.");
                    break;

                // Si l'usuari introdueix qualsevol opció que no existeixi al menú, es mostra un missatge d'error.
                default:
                    System.out.println("Opció no vàlida. Torna a provar.");
            }
        }
    }

    // Exercici 1
    // Mètode que comprova l'existència d'un fitxer o directori amb el nom proporcionat per l'usuari i el crea si no existeix.
    public static File verificarCrearFitxer(Scanner scn) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Benvingut al programa de verificació i creació (si no existeix) d'un fitxer de text o un directori.");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Introdueix el nom del fitxer o directori: ");
        String nomPath = scn.nextLine();

        File path = new File(nomPath);

        if (path.exists()) {
            System.out.println("'" + nomPath + "' ja existeix.");
            // Es crida al mètode per mostrar informació detallada sobre el fitxer o directori.
            mostrarInformacio(path);
            if (path.isDirectory()) {
                System.out.println("\nVols llistar el contingut d'aquest directori? (s/n)");
                String resposta = scn.nextLine().toLowerCase();
                // Si la resposta és sí (s), es llista el contingut del directori.
                if (resposta.equals("s")) {
                    llistarContingutDirectori(path);
                }
                // Retorna null si el camí és un directori (el necessitarem en altres apartats), ja que no es crea un fitxer.
                return null;
            }
            // Si no és un directori, retorna l'objecte File.
            return path;
        } else {
            // Si el fitxer o directori no existeix, es mostra un menú amb opcions per crear-lo.
            int opcio = 0;
            while (opcio != 3) {
                System.out.println("'" + nomPath + "' no existeix. Què vols fer?");
                System.out.println("1. Crear un fitxer.");
                System.out.println("2. Crear un directori.");
                System.out.println("3. Sortir del programa.");
                System.out.print("Selecciona una opció: ");

                try {
                    opcio = scn.nextInt();
                    scn.nextLine();

                    switch (opcio) {
                        // Crea un fitxer si l'usuari selecciona l'opció 1.
                        case 1:
                            if (path.createNewFile()) {
                                System.out.println("El fitxer '" + nomPath + "' s'ha creat amb èxit.");
                                // Es mostra la informació del fitxer creat.
                                mostrarInformacio(path);
                                // Retorna el fitxer creat.
                                return path;
                            } else {
                                System.out.println("No s'ha pogut crear el fitxer '" + nomPath + "'.");
                            }
                            break;

                        // Crea un directori si l'usuari selecciona l'opció 2.
                        case 2:
                            if (path.mkdirs()) {
                                System.out.println("El directori '" + nomPath + "' s'ha creat amb èxit.");
                                // Es mostra la informació del directori creat.
                                mostrarInformacio(path);
                                // Retorna 'null' per indicar que s'ha creat un directori i no un fitxer.
                                return null;
                            } else {
                                System.out.println("No s'ha pogut crear el directori '" + nomPath + "'.");
                            }
                            break;

                        // Surt del programa si l'usuari selecciona l'opció 3.
                        case 3:
                            System.out.println("S'ha sortit del programa.");
                            break;

                        // Si l'usuari introdueix una opció invàlida, es mostra un missatge d'error.
                        default:
                            System.out.println("Opció no vàlida.");
                    }
                } catch (InputMismatchException e) {

                    System.err.println("Error: Has d'introduir un número sencer vàlid.");
                    // Neteja el buffer per evitar bucles infinits.
                    scn.nextLine();
                    // Reset de l'opció. 
                    opcio = 0;
                } catch (IOException e) {

                    System.err.println("Error d'entrada/sortida durant la creació: " + e.getMessage());
                } catch (SecurityException e) {

                    System.err.println("Error de seguretat: No es tenen permisos per crear. Detall: " + e.getMessage());
                } catch (Exception e) {

                    System.err.println("Error inesperat: " + e.getMessage());
                }
            }
            // Si no s'ha creat cap fitxer ni directori, retorna 'null' també.
            System.out.println("No s'ha creat cap fitxer ni directori.");
            return null;
        }
    }

    // Mètode per mostrar informació detallada d'un fitxer o directori.
    public static void mostrarInformacio(File path) {
        try {
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
            System.out.println("Mida (bytes): " + path.length());

        } catch (SecurityException e) {
            System.err.println("No tens permisos per accedir a aquest fitxer/directori. Detall: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("S'ha produït un error inesperat. Detall: " + e.getMessage());
        }
    }

    // Mètode que llista el contingut d'un directori.
    public static void llistarContingutDirectori(File directori) {
        try {
            if (directori == null) {
                System.out.println("El directori proporcionat és 'null'.");
                return;
            }
            System.out.println("\nContingut del directori '" + directori.getName() + "':");
            File[] contingut = directori.listFiles();

            if (contingut != null) {
                for (int i = 0; i < contingut.length; i++) {
                    File element = contingut[i];
                    String tipus = "";
                    if (element.isDirectory()) {
                        tipus = "És un directori: ";
                    } else if (element.isFile()) {
                        tipus = "És un fitxer: ";
                    } else {
                        tipus = "És un element desconegut: ";
                    }
                    System.out.println(tipus + element.getName());
                }
            } else {
                System.out.println("No s'ha pogut llistar el contingut del directori.");
            }
        } catch (SecurityException e) {
            System.err.println("Error de seguretat: No es poden llegir els continguts del directori. Detall: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("S'ha produït un error inesperat. Detall: " + e.getMessage());
        }
    }

    // Exercici 2
    // Mètode per veure de prop el funcionament de les classes FileWriter i PrintWriter escrivint dades en un fitxer de text. 
    public static void escripturaFitxer(Scanner scn) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Benvingut al programa d'inserció de dades en un fitxer de text.");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Crida a la funció per verificar que existeix el fitxer, sinó en crea un. 
        File fitxer = verificarCrearFitxer(scn);

        // Si el fitxer és vàlid (no és 'null'), s'inicia el procés d'escriptura. 
        if (fitxer != null) {
            int opcio = 0;

            try {
                while (opcio != 4) {
                    System.out.println("Què vols fer?");
                    System.out.println("1. Sobreescriure el fitxer.");
                    System.out.println("2. Afegir línies en el fitxer.");
                    System.out.println("3. Utilitzar PrintWriter per sobreescriure el fitxer.");
                    System.out.println("4. Sortir del programa.");
                    System.out.print("Selecciona una opció: ");

                    try {
                        opcio = scn.nextInt();
                        // Netejo el buffer per evitar errors.
                        scn.nextLine();
                        
                        String[] linies = null;

                        if(opcio!=4){
                        // Es demana quantes línies de text vol introduir l'usuari. 
                        System.out.print("Quantes línies de text vols introduir? ");
                        int numLinies = scn.nextInt();
                        scn.nextLine();

                        // Guardo les línies introduïdes per l'usuari en un array.
                        linies = new String[numLinies];
                        // Demano a l'usuari que introdueixi cada línia. 
                        for (int i = 0; i < numLinies; i++) {
                            System.out.print("Introdueix la línia " + (i + 1) + ": ");
                            // Es guarda la línia en l'array.
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
                                    System.out.println("Fitxer '" + fitxer.getName() + "' escrit (sobreescrivint).");
                                } catch (IOException e) {
                                    System.err.println("Error escrivint amb FileWriter (sobreescrivint): " + e.getMessage());
                                } finally {
                                    // Tanco el FileWriter per evitar fuites de recursos. 
                                    if (fileWriterSobreescriure != null) {
                                        try {
                                            fileWriterSobreescriure.close();
                                        } catch (IOException e) {
                                            System.err.println("Error tancant el FileWriter: " + e.getMessage());
                                        }
                                    }
                                }
                                break;

                            case 2:
                                // Afegir línies al fitxer amb FileWriter.
                                FileWriter fileWriterAfegint = null;
                                try {
                                    fileWriterAfegint = new FileWriter(fitxer, true);
                                    for (int i = 0; i < linies.length; i++) {
                                        fileWriterAfegint.write(linies[i] + "\n");
                                    }
                                    System.out.println("Fitxer '" + fitxer.getName() + "' escrit (afegint).");
                                } catch (IOException e) {
                                    System.err.println("Error escrivint amb FileWriter (afegint): " + e.getMessage());
                                } finally {
                                    // Tanco el FileWriter per evitar fuites de recursos.  
                                    if (fileWriterAfegint != null) {
                                        try {
                                            fileWriterAfegint.close();
                                        } catch (IOException e) {
                                            System.err.println("Error tancant el FileWriter: " + e.getMessage());
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
                                    System.out.println("Fitxer '" + fitxer.getName() + "' escrit amb PrintWriter.");
                                } catch (IOException e) {
                                    System.err.println("Error escrivint amb PrintWriter: " + e.getMessage());
                                } finally {
                                    // Tanco el PrintWriter per evitar fuites de recursos. 
                                    if (printWriterSobreescriure != null) {
                                        printWriterSobreescriure.close();
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("S'ha sortit del programa.");
                                break; 
                                
                            default:
                                System.out.println("Opció no vàlida. No s'ha fet cap escriptura.");
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Error: Has d'introduir un número vàlid.");
                        // Netegem el buffer per evitar bucles infinits.
                        scn.nextLine();
                    }
                }
            } catch (Exception e) {
                System.err.println("S'ha produït un error inesperat: " + e.getMessage());
            }
        } else {
            System.out.println("No s'ha pogut obtenir un fitxer vàlid per a l'escriptura.");
        }
    }

    // Exercici 3
    // Mètode per llegir el contingut d'un fitxer de text amb diferents tècniques de lectura.
    public static void lecturaFitxer(Scanner scn) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Benvingut al programa de lectura del contingut d'un fitxer de text.");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Crida al mètode per verificar si el fitxer existeix, i sinó, permet crear-lo.
        File fitxerLectura = verificarCrearFitxer(scn);

        if (fitxerLectura != null) {
            int opcio = 0;

            while (opcio != 5) {
                System.out.println("\nQuina lectura vols realitzar?");
                System.out.println("1. Lectura amb FileReader.");
                System.out.println("2. Lectura amb BufferedReader.");
                System.out.println("3. Lectura línia a línia amb Scanner.");
                System.out.println("4. Lectura paraula a paraula amb Scanner.");
                System.out.println("5. Sortir del programa.");
                System.out.print("Selecciona una opció: ");

                try {
                    opcio = scn.nextInt();
                    scn.nextLine();
                } catch (InputMismatchException e) {
                    // Captura error si l'usuari introdueix un valor no vàlid (ex: text en lloc d’un número).
                    System.err.println("Error: Has d'introduir un número sencer vàlid.");
                    // Netejo el buffer per evitar bucles infinits si es crida novament.
                    scn.nextLine();
                }

                switch (opcio) {
                    case 1:
                        // Lectura amb FileReader.
                        System.out.println("\n--- Lectura amb FileReader ---");
                        FileReader fileReader = null;
                        try {
                            fileReader = new FileReader(fitxerLectura);
                            int caracter;
                            while ((caracter = fileReader.read()) != -1) {
                                // Mostra cada caràcter llegit i el seu codi Unicode.
                                System.out.println("Caràcter: '" + (char) caracter + "' (Unicode: " + caracter + ")");
                            }
                            System.out.println("Lectura de '" + fitxerLectura.getName() + "' amb FileReader completada.");
                        } catch (FileNotFoundException e) {
                            System.err.println("Error: El fitxer '" + fitxerLectura.getName() + "' no s'ha trobat.");
                        } catch (IOException e) {
                            System.err.println("Error d'entrada/sortida durant la lectura amb FileReader: " + e.getMessage());
                        } catch (SecurityException e) {
                            System.err.println("Error de seguretat: No tens permís per llegir el fitxer '" + fitxerLectura.getName() + "'.");
                        } finally {
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (IOException e) {
                                    System.err.println("Error al tancar FileReader: " + e.getMessage());
                                }
                            }
                        }
                        break;

                    case 2:
                        // Lectura amb BufferedReader.
                        System.out.println("\n--- Lectura amb BufferedReader ---");
                        BufferedReader bufferedReader = null;
                        try {
                            bufferedReader = new BufferedReader(new FileReader(fitxerLectura));
                            String linia;
                            while ((linia = bufferedReader.readLine()) != null) {
                                System.out.println("Línia: " + linia);
                            }
                            System.out.println("Lectura de '" + fitxerLectura.getName() + "' amb BufferedReader completada.");
                        } catch (FileNotFoundException e) {
                            System.err.println("Error: El fitxer '" + fitxerLectura.getName() + "' no s'ha trobat.");
                        } catch (IOException e) {
                            System.err.println("Error d'entrada/sortida durant la lectura amb BufferedReader: " + e.getMessage());
                        } catch (SecurityException e) {
                            System.err.println("Error de seguretat: No tens permís per llegir el fitxer '" + fitxerLectura.getName() + "'.");
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e) {
                                    System.err.println("Error al tancar BufferedReader: " + e.getMessage());
                                }
                            }
                        }
                        break;

                    case 3:
                        // Lectura amb Scanner línia a línia.
                        System.out.println("\n--- Lectura línia a línia amb Scanner ---");
                        Scanner scannerLinia = null;
                        try {
                            scannerLinia = new Scanner(fitxerLectura);
                            while (scannerLinia.hasNextLine()) {
                                System.out.println("Línia: " + scannerLinia.nextLine());
                            }
                            System.out.println("Lectura de '" + fitxerLectura.getName() + "' línia a línia amb Scanner completada.");
                        } catch (FileNotFoundException e) {
                            System.err.println("Error: El fitxer '" + fitxerLectura.getName() + "' no s'ha trobat.");
                        } catch (SecurityException e) {
                            System.err.println("Error de seguretat: No tens permís per llegir el fitxer '" + fitxerLectura.getName() + "'.");
                        } finally {
                            if (scannerLinia != null) {
                                scannerLinia.close();
                            }
                        }
                        break;

                    case 4:
                        // Lectura amb Scanner paraula a paraula.
                        System.out.println("\n--- Lectura de paraules amb Scanner ---");
                        Scanner scannerParaula = null;
                        try {
                            scannerParaula = new Scanner(fitxerLectura);
                            while (scannerParaula.hasNext()) {
                                System.out.println("Paraula: " + scannerParaula.next());
                            }
                            System.out.println("Lectura de '" + fitxerLectura.getName() + "' paraula a paraula amb Scanner completada.");
                        } catch (FileNotFoundException e) {
                            System.err.println("Error: El fitxer '" + fitxerLectura.getName() + "' no s'ha trobat.");
                        } catch (SecurityException e) {
                            System.err.println("Error de seguretat: No tens permís per llegir el fitxer '" + fitxerLectura.getName() + "'.");
                        } finally {
                            if (scannerParaula != null) {
                                scannerParaula.close();
                            }
                        }
                        break;

                    case 5:
                        System.out.println("S'ha sortit del programa.");
                        break;

                    default:
                        System.out.println("Opció no vàlida. Si us plau, selecciona una opció vàlida del menú.");
                        break;
                }
            }
        } else {
            System.out.println("No s'ha pogut obtenir un fitxer vàlid per a la lectura.");
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
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Benvingut al programa de gestió d'un inventari.");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Es verifica si ja existeix un fitxer d'inventari, sinó en crea un de nou.
        File fitxerInventari = verificarCrearFitxer(scn);

        if (fitxerInventari != null) {
            int numProductes = 0;
            boolean numValid = false;

            // S'assegura que l'entrada sigui un número sencer vàlid.
            while (!numValid) {
                System.out.print("Quants productes vols afegir a l'inventari? ");
                try {
                    numProductes = Integer.parseInt(scn.nextLine());
                    numValid = true;
                } catch (NumberFormatException e) {
                    System.err.println("Error: Has d'introduir un número sencer vàlid.");
                }
            }

            if (numProductes > 0) {
                // Crida al mètode per guardar la informació dels productes al fitxer.
                gestioInventariGuardarInformacio(fitxerInventari.getName(), numProductes, scn);
            } else {
                System.out.println("No s'afegiran productes a l'inventari.");
            }

            // Després de guardar les dades, es mostra el contingut de l’inventari.
            gestioInventariLlegirInformacio(fitxerInventari.getName());
        } else {
            System.out.println("No s'ha pogut inicialitzar la gestió de l'inventari.");
        }
    }

    // Aquest mètode permet introduir un conjunt de productes (nom, preu i quantitat) i guardar-los en un fitxer de text.
    // Cada producte es guarda en una línia amb el format: nom preu quantitat.
    public static void gestioInventariGuardarInformacio(String nomFitxer, int numProductes, Scanner scn) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(nomFitxer));

            System.out.println("Introducció de productes:");

            for (int i = 0; i < numProductes; i++) {
                System.out.println("Producte " + (i + 1) + ":");
                
                // Es demana el nom del producte,
                System.out.print("Nom del producte: ");
                String nomProducte = scn.nextLine();

                double preuProducte = 0;
                int quantitatProducte = 0;

                // Es demana el preu del producte, controlant errors de format.
                boolean preuValid = false;
                while (!preuValid) {
                    System.out.print("Preu unitari: ");
                    try {
                        preuProducte = Double.parseDouble(scn.nextLine()); // Intentem convertir el preu.
                        preuValid = true;
                    } catch (NumberFormatException e) {
                        System.err.println("Format incorrecte. Torna a introduir un preu vàlid.");
                    }
                }

                // Es demana la quantitat del producte, controlant errors de format.
                boolean quantitatValida = false;
                while (!quantitatValida) {
                    System.out.print("Quantitat disponible: ");
                    try {
                        quantitatProducte = Integer.parseInt(scn.nextLine()); // Intentem convertir la quantitat.
                        quantitatValida = true;
                    } catch (NumberFormatException e) {
                        System.err.println("Format incorrecte. Torna a introduir una quantitat vàlida.");
                    }
                }

                writer.write(nomProducte + " " + preuProducte + " " + quantitatProducte);
                writer.newLine();
            }

            System.out.println("\nS'han inserit les dades de l'inventari correctament al fitxer '" + nomFitxer + "'.");

        } catch (IOException e) {
            System.err.println("Error en escriure al fitxer '" + nomFitxer + "': " + e.getMessage());
        } catch (Exception e) {
            System.err.println("S'ha produït un error inesperat: " + e.getMessage());
        } finally {
            // Tanco el BufferedWriter per evitar fuites de recursos.
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
            reader = new BufferedReader(new FileReader(nomFitxer));
            String linia = "";

            System.out.println("Contingut de l'inventari i valor per producte:");

            while ((linia = reader.readLine()) != null) {
                // Separo cada línia pels espais per obtenir els diferents valors.
                String[] parts = linia.split(" ");

                // Comprovo que hi hagi exactament 3 valors: nom, preu i quantitat.
                if (parts.length == 3) {
                    String nomProducte = parts[0];

                    try {
                        double preu = Double.parseDouble(parts[1]);
                        int quantitat = Integer.parseInt(parts[2]);

                        double valorProducte = preu * quantitat;
                        costTotalInventari += valorProducte;
                        
                        System.out.printf("\n%s: %d unitats x %.2f€/u = %.2f€", nomProducte, quantitat, preu, valorProducte);
                    } catch (NumberFormatException e) {
                        System.err.println("Error de format numèric a la línia: " + linia);
                    }
                } else if (!linia.trim().isEmpty()) {
                    // Es mostra un missatge, també, si la línia no està buida, però no té el format esperat (no té 3 camps separats per espais).
                    System.err.println("Format de línia incorrecte: " + linia + " (s'esperaven 3 camps separats per espais).");
                }
            }

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
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Benvinguts al diccionari de Paraules");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Introdueix la ruta del fitxer de text: ");

        try {
            // Crida al mètode per verificar si el fitxer existeix, i si no, el crea.
            File fitxer = verificarCrearFitxer(scn);

            // Llegeix totes les paraules del fitxer i les emmagatzema en un array.
            String[] totesLesParaules = llegirFitxerIObtenirParaules(fitxer.getName());

            if (totesLesParaules != null) {
                // Elimina les paraules duplicades del conjunt llegit.
                String[] paraulesUniques = eliminarDuplicats(totesLesParaules);
                System.out.println("S'han eliminat les paraules duplicades.");

                if (paraulesUniques != null) {
                    // Ordena les paraules úniques alfabèticament.
                    ordenarParaules(paraulesUniques);
                    System.out.println("Les paraules úniques s'han ordenat alfabèticament.");

                    // Genera un fitxer amb les paraules úniques i ordenades.
                    generarFitxerDiccionari(fitxer.getName(), paraulesUniques);
                    System.out.println("S'ha generat el fitxer " + fitxer.getName() + " amb les paraules úniques i ordenades.");

                    // Mostra un informe final.
                    mostrarInformeFinal(totesLesParaules, paraulesUniques, fitxer.getName(), scn);
                } else {
                    System.err.println("No s'han pogut eliminar els duplicats.");
                }
            } else {
                System.err.println("No s'han pogut llegir les paraules del fitxer.");
            }
        } catch (Exception e) {
            System.err.println("S'ha produït un error inesperat: " + e.getMessage());
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
                // Divideixo cada línia en paraules, separant per espais o tabulacions.
                String[] paraulesLinia = linia.split("\\s+");
                // Afegeixo el nombre de paraules trobades a la línia al comptador total.
                contadorParaules += paraulesLinia.length;
            }
        } catch (IOException e) {
            System.err.println("Error en llegir el fitxer: " + e.getMessage());
            return null;
        } finally {
            // Tanco el BufferedReader després de llegir el fitxer per evitar fuites de recursos.
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error en tancar el fitxer: " + e.getMessage());
                }
            }
        }

        // Creo un array per guardar totes les paraules, amb la mida exacta segons el comptador.
        String[] paraules = new String[contadorParaules];
        // Índex per controlar a quina posició de l'array guardo la següent paraula.
        int index = 0;

        br = null;

        // Segon pas: llegir el fitxer novament per omplir l'array amb les paraules netejades.
        try {
            br = new BufferedReader(new FileReader(nomFitxer));
            String linia = "";
            // Llegeixo el fitxer línia per línia.
            while ((linia = br.readLine()) != null) {
                // Converteixo tota la línia a minúscules i la dividim en paraules.
                String[] paraulesLinia = linia.toLowerCase().split("\\s+");
                // Recórre totes les paraules de la línia.
                for (int i = 0; i < paraulesLinia.length; i++) {
                    // Netejo cada paraula, eliminant caràcters no permesos (signes de puntuació, etc.).
                    String paraulaNetajada = netejarParaula(paraulesLinia[i]);
                    // Si la paraula no és buida després de netejar-la i no és 'null'.
                    if ((paraulaNetajada != null) && (!paraulaNetajada.isEmpty())) {
                        // Guarda la paraula netejada a l'array en la posició corresponent.
                        paraules[index] = paraulaNetajada;
                        // Incrementa l'índex per afegir la següent paraula.
                        index++;
                    }
                }
            }
        } catch (IOException e) {
            // Si hi ha un error llegint el fitxer, mostrar missatge d'error i retornar 'null'.
            System.err.println("Error en llegir el fitxer: " + e.getMessage());
            return null;
        } finally {
            // Tanco el BufferedReader després de llegir el fitxer per evitar fuites de recursos.
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error en tancar el fitxer: " + e.getMessage());
                }
            }
        }

        // Si el nombre de paraules netejades és menor que l'array original, ajusto la mida de l'array.
        if (index < paraules.length) {
            // Crea un nou array amb la mida exacta del nombre de paraules netejades i copio les paraules netejjades al nou array.
            String[] resultat = new String[index];
            for (int i = 0; i < index; i++) {
                resultat[i] = paraules[i];
            }
            // Retorna l'array ajustat amb les paraules netejades.
            return resultat;
        }

        // Si no cal ajustar la mida, retorna l'array original amb totes les paraules.
        return paraules;
    }

    // Mètode que elimina els caràcters no permesos d'una paraula, retornant una versió "netejada" d'aquesta.
    public static String netejarParaula(String paraula) {
        
        if (paraula == null) {
            return "";
        } else {
            // Defineixo els caràcters no permesos que vui eliminar de la paraula.
            String simbolsNoPermesos = "\\.,;!?()[]{}\"'<>@#$%^&*+=-_";

            // Cadena buida per guardar la paraula netejada.
            String paraulaNetajada = "";

            // Recorrem cada caràcter de la paraula original.
            for (int i = 0; i < paraula.length(); i++) {
                // Obtinc el caràcter actual de la paraula.
                char caracter = paraula.charAt(i);

                // Si el caràcter no és un símbol no permès, l'afegeixo a la paraula netejada.
                if (simbolsNoPermesos.indexOf(caracter) == -1) {
                    paraulaNetajada += caracter;
                }
            }

            // Retorno la paraula netejada sense caràcters no permesos.
            return paraulaNetajada;
        }
    }

    // Mètode que elimina les paraules duplicades d'un array de Strings i retorna un nou array només amb les paraules úniques.
    public static String[] eliminarDuplicats(String[] paraules) {

        // Creo un array temporal on guardaré les paraules úniques (sense duplicats).
        String[] paraulesUniques = new String[paraules.length];

        // Variable per portar el compte de les paraules úniques trobades.
        int countUniques = 0;

        // Variable booleana per controlar si una paraula ja ha estat afegida (duplicada).
        boolean duplicat = false;

        // Recorro totes les paraules de l'array original per verificar si són duplicades.
        for (int i = 0; i < paraules.length; i++) {
            duplicat = false;

            // Comprovo si la paraula actual ja existeix entre les paraules úniques trobades fins ara.
            for (int j = 0; j < countUniques; j++) {
                // Si trobo una coincidència, marco 'duplicat' com 'true' i surto del bucle (no cal seguir comprovant més).
                if (paraules[i].equals(paraulesUniques[j])) {
                    duplicat = true;
                    break;
                }
            }

            // Si la paraula no és duplicada (la variable 'duplicat' està a 'false', la guardo a l'array de paraules úniques.
            if (!duplicat) {
                paraulesUniques[countUniques] = paraules[i];
                // Incremento el comptador de paraules úniques.
                countUniques++;
            }
        }

        // Creo un nou array amb la mida exacta per contenir només les paraules úniques.
        String[] resultat = new String[countUniques];

        // Copio les paraules úniques a l'array de resultat.
        for (int i = 0; i < countUniques; i++) {
            resultat[i] = paraulesUniques[i];
        }

        // Retorno l'array amb només les paraules úniques.
        return resultat;
    }

    // Programa que ordena alfabèticament un array de paraules comparant-les i inserint cada paraula en la seva posició correcta amb el mètode 'insertion sort'.
    public static void ordenarParaules(String[] paraulesUniques) {
        // Començo des de la segona paraula (index 1), ja que la primera està considerada ordenada.
        for (int i = 1; i < paraulesUniques.length; i++) {
            // Guardo la paraula actual que vui inserir en la seva posició correcta.
            String key = paraulesUniques[i];

            // Index de la paraula anterior a la que he de comparar.
            int j = i - 1;

            // Mentre tingui paraules a l'esquerra i la paraula anterior sigui alfabèticament més gran que la 'key'.
            while (j >= 0 && paraulesUniques[j].compareTo(key) > 0) {
                // Desplaço la paraula actual cap a la dreta per fer espai a la paraula.
                paraulesUniques[j + 1] = paraulesUniques[j];
                // Continuo comparant la 'key' amb la següent paraula a l'esquerra.
                j--;
            }

            // Quan trobo la posició correcta, insereixo la 'key' en la seva ubicació final.
            paraulesUniques[j + 1] = key;
        }
    }

    // Mètode que genera un fitxer amb les paraules úniques ordenades alfabèticament, afegint també, en la línia final, el total de paraules úniques que hi ha.
    public static void generarFitxerDiccionari(String nomFitxer, String[] paraulesUniquesOrdenades) {

        PrintWriter printWriter = null;
        FileWriter fileWriter = null;

        try {
            // Obro el fitxer amb FileWriter i després utilitzo PrintWriter per escriure text en ell de manera més fàcil i controlada.
            fileWriter = new FileWriter(nomFitxer);
            printWriter = new PrintWriter(fileWriter);

            // Recorro totes les paraules úniques ordenades i les escric al fitxer, una per línia.
            for (int i = 0; i < paraulesUniquesOrdenades.length; i++) {
                printWriter.println(paraulesUniquesOrdenades[i]);
            }
            printWriter.println("Total de paraules úniques: " + paraulesUniquesOrdenades.length);

        } catch (IOException e) {
            System.err.println("Error en escriure al fitxer '" + nomFitxer + "': " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ha ocorregut un error inesperat: " + e.getMessage());
        } finally {
            // Tanco els recursos utilitzats (FileWriter i PrintWriter) per evitar fuites de recursos.
            try {
                if (printWriter != null) {
                    printWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Error en tancar els recursos: " + e.getMessage());
            }
        }
    }

    // Mètode per validar el nombre de línies a llegir, assegurant que no siguin negatives ni superin el total disponible.
    public static int validarNombreLinies(int linies, int totalLinies, Scanner scn) {
        // Mentre alguna de les dues variables sigui negativa, demano de nou els valors.
        while (linies < 0 || totalLinies < 0) {
            try {
                System.out.println("El nombre de línies no pot ser negatiu. Torna a introduir els valors:");
                System.out.print("Nombre de línies a llegir: ");
                linies = scn.nextInt();
                System.out.print("Total de línies disponibles: ");
                totalLinies = scn.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no vàlida. Has d'introduir un número enter.");
                // Netejo el buffer per evitar bucles infinits.
                scn.nextLine();
            }
        }

        // Si el nombre de línies a llegir és superior al total disponible, l'ajusto a la quantitat màxima disponible.
        if (linies > totalLinies) {
            System.out.println("El fitxer només té " + totalLinies + " línies. Es mostraran aquestes.");
            linies = totalLinies;
        }

        // Retorno el nombre de línies vàlid.
        return linies;
    }

    // Mètode per llegir i mostrar les primeres línies d'un fitxer.
    // Aquest valida el nombre de línies a llegir i, si és vàlid, les mostra a la consola.
    public static void llegirPrimeresLinies(String nomFitxer, int linies, int totalLinies, Scanner scn) {
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(nomFitxer));
            String linia = "";
            int cont = 0;

            if (totalLinies == 0) {
                System.out.println("El fitxer està buit.");
            } else {
                // Es valida el nombre de línies a llegir (m'asseguro que no sigui negatiu ni superior al total de línies disponibles).
                linies = validarNombreLinies(linies, totalLinies, scn);

                // Llegim i mostrem les primeres línies fins arribar al límit especificat per 'linies'.
                while ((linia = reader.readLine()) != null && cont < linies) {
                    System.out.println(linia);
                    cont++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage());
        } finally {
            try {
                // Tanco el BufferedReader per evitar fuites de recursos.
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error tancant el fitxer: " + e.getMessage());
            }
        }
    }

    // Mètode per llegir i mostrar les últimes línies d'un fitxer.
    // Aquest valida el nombre de línies a llegir i, si és vàlid, mostra les últimes línies del fitxer.
    public static void llegirUltimesLinies(String nomFitxer, int linies, int totalLinies, String[] paraulesUniques, Scanner scn) {
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(nomFitxer));
            if (totalLinies == 0) {
                System.out.println("El fitxer està buit.");
            } else {
                // Es valida el nombre de línies a llegir (m'asseguro que no sigui negatiu ni superior al total de línies disponibles).
                linies = validarNombreLinies(linies, totalLinies, scn);

                // Mostro les últimes línies de l'array de paraules úniques.
                for (int i = totalLinies - linies; i < totalLinies; i++) {
                    System.out.println(paraulesUniques[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage());
        } finally {
            try {
                // Tanco el BufferedReader per evitar fuites de recursos.
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error tancant el fitxer: " + e.getMessage());
            }
        }
    }

    // Mètode per llegir i mostrar tot el contingut d'un fitxer.
    // Aquest llegeix el fitxer línia per línia i mostra el seu contingut per la consola.
    public static void llegirTotElFitxer(String nomFitxer) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(nomFitxer));
            String linia = "";

            // Llegeixo cada línia del fitxer fins arribar al final (quan el valor retornat és null).
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage());
        } finally {
            try {
                // Tanco el BufferedReader per evitar fuites de recursos.
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error tancant el fitxer: " + e.getMessage());
            }
        }
    }

    // Mètode principal per mostrar un informe final amb opcions per llegir el fitxer.
    // Aquest mètode mostra  per pantalla quantes paraules ha trobat en total al principi (abans d’eliminar duplicats) i quantes han quedat després de treure’n les repeticions.
    // A més, permet a l'usuari triar diferents opcions per llegir el fitxer.
    public static void mostrarInformeFinal(String[] totesLesParaules, String[] paraulesUniques, String nomFitxer, Scanner scn) {
        System.out.println("--------------");
        System.out.println("Informe Final");
        System.out.println("--------------");

        // Mostro el nombre total de paraules trobades en el fitxer inicial (abans de l'eliminació de duplicats).
        if (totesLesParaules != null) {
            System.out.println("Nombre total de paraules trobades al principi: " + totesLesParaules.length);
        } else {
            System.out.println("No s'han trobat paraules.");
        }

        // Mostro el nombre de paraules úniques després d'eliminar duplicats.
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
                    opcio = scn.nextInt();

                    switch (opcio) {
                        case 1:
                            // Crido al mètode per llegir les primeres línies del fitxer.
                            System.out.println("Quantes línies vols llegir del principi del fitxer?");
                            int liniesPrimeres = scn.nextInt();
                            llegirPrimeresLinies(nomFitxer, liniesPrimeres, paraulesUniques.length, scn);
                            break;
                        case 2:
                            // Crido al mètode per llegir les últimes línies del fitxer.
                            System.out.println("Quantes línies vols llegir del final del fitxer?");
                            int liniesUltimes = scn.nextInt();
                            llegirUltimesLinies(nomFitxer, liniesUltimes, paraulesUniques.length, paraulesUniques, scn);
                            break;
                        case 3:
                            // Crido al mètode per llegir tot el fitxer.
                            llegirTotElFitxer(nomFitxer);
                            break;
                        case 4:
                            // Sortida del programa.
                            System.out.println("S'ha sortit del programa.");
                            break;
                        default:
                            // Si l'usuari introdueix una opció no vàlida, es mostra un missatge d'error.
                            System.out.println("Opció no vàlida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no vàlida. Has d'introduir un número.");
                    // Netejo el buffer de l'input per evitar bucles infinits.
                    scn.nextLine();
                }
            }

        } else {
            System.out.println("No s'han trobat paraules úniques.");
        }
    }

}
