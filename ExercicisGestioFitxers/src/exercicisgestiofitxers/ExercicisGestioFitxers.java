package exercicisgestiofitxers;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExercicisGestioFitxers {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        File[] directoris = new File[4];
        directoris[0] = new File("./Prova");
        directoris[1] = new File("C:/exemple/absolut");
        directoris[2] = new File("./Text");
        directoris[3] = new File("./Prova2");

        File[] fitxers = new File[4];
        fitxers[0] = new File("Text1.txt");
        fitxers[1] = new File("C:/exemple/Text1.txt");
        fitxers[2] = new File("Text2.txt");
        fitxers[3] = new File("Carpeta");

        for (int i = 0; i < directoris.length; i++) {
            File dir = directoris[i];
            File file = fitxers[i];

            try {
//                //1
//                llistarFitxers(dir);
//                //2
//                comprovarExistencia(dir);
//                //3
//                comprovarPermisos(dir);
//                //4
//                tipusFitxerODirectori(dir);
//                //5
//                mostrarMidaFitxer(dir);
//                //6
//                crearOEsborrarDirectori(dir);
//                //7
//                mostrarInformacioRuta(dir);
//                //8
//                mostrarFitxersGrans(dir, 1024); // > 1KB
//                //9
//                // mostrarDetallsFitxer(file); // 
//                //10
//                crearOEliminarFitxerCarpeta("NovaCarpeta" + i, "fitxer" + i + ".txt");
//                //11
//                canviarNoms(dir, file, "NouDir" + i, "NouFitxer" + i + ".txt");
//                //12
//                llistarContingut(directoris);
//                //13
                fitxer(fitxers, directoris, str);

            } catch (SecurityException e) {
                System.out.println("Error d'accés a l'arxiu o directori: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ha ocorregut un error inesperat: " + e.getMessage());
            }

            System.out.println("=====================================");
        }
    }

    public static void llistarFitxers(File dir) {
        try {
            if (dir.exists() && dir.isDirectory()) {
                System.out.println("Fitxers dins de " + dir.getPath() + ":");
                File[] fitxers = dir.listFiles();
                if (fitxers != null) {
                    for (int i = 0; i < fitxers.length; i++) {
                        System.out.println(" - " + fitxers[i].getName());
                    }
                } else {
                    System.out.println("No es poden llistar els fitxers de " + dir.getPath());
                }
            }
        } catch (SecurityException e) {
            System.out.println("Error de seguretat al llegir el directori: " + e.getMessage());
        }
    }

    public static void comprovarExistencia(File ruta) {
        try {
            System.out.println(ruta.getPath() + " existeix? " + ruta.exists());
        } catch (SecurityException e) {
            System.out.println("Error al comprovar l'existència de la ruta: " + e.getMessage());
        }
    }

    public static void comprovarPermisos(File ruta) {
        try {
            System.out.println("Lectura: " + ruta.canRead() + ", Escriptura: " + ruta.canWrite());
        } catch (SecurityException e) {
            System.out.println("Error al comprovar permisos: " + e.getMessage());
        }
    }

    public static void tipusFitxerODirectori(File ruta) {
        try {
            if (ruta.exists()) {
                System.out.println("És fitxer? " + ruta.isFile());
                System.out.println("És directori? " + ruta.isDirectory());
            }
        } catch (SecurityException e) {
            System.out.println("Error al comprovar tipus: " + e.getMessage());
        }
    }

    public static void mostrarMidaFitxer(File f) {
        try {
            if (f.exists() && f.isFile()) {
                long mida = f.length();
                System.out.println("Mida: " + mida + " bytes, " + mida / 1024 + " KB, " + mida / (1024 * 1024) + " MB");
            }
        } catch (SecurityException e) {
            System.out.println("Error al mostrar mida del fitxer: " + e.getMessage());
        }
    }

    public static void crearOEsborrarDirectori(File dir) {
        try {
            if (!dir.exists()) {
                if (dir.mkdir()) {
                    System.out.println("Carpeta creada: " + dir.getName());
                }
            } else {
                // Utilitzant un 'for' normal per esborrar els fitxers dins del directori
                File[] fitxers = dir.listFiles();
                if (fitxers != null) {
                    for (int i = 0; i < fitxers.length; i++) {
                        fitxers[i].delete();
                    }
                }
                if (dir.delete()) {
                    System.out.println("Carpeta esborrada: " + dir.getName());
                }
            }
        } catch (SecurityException e) {
            System.out.println("Error al crear o esborrar directori: " + e.getMessage());
        }
    }

    public static void mostrarInformacioRuta(File ruta) {
        try {
            System.out.println("Nom: " + ruta.getName());
            System.out.println("Directori pare: " + ruta.getParent());
            System.out.println("Ruta absoluta: " + ruta.getAbsolutePath());
        } catch (SecurityException e) {
            System.out.println("Error al mostrar informació de la ruta: " + e.getMessage());
        }
    }

    public static void mostrarFitxersGrans(File dir, long midaMinima) {
        try {
            if (dir.exists() && dir.isDirectory()) {
                File[] fitxers = dir.listFiles(); // Obtenim els fitxers dins del directori
                if (fitxers != null) {
                    for (int i = 0; i < fitxers.length; i++) {
                        if (fitxers[i].isFile() && fitxers[i].length() > midaMinima) {
                            System.out.println(fitxers[i].getName() + " supera " + midaMinima + " bytes");
                        }
                    }
                } else {
                    System.out.println("No es poden llistar els fitxers de " + dir.getPath());
                }
            }
        } catch (SecurityException e) {
            System.out.println("Error al llistar fitxers grans: " + e.getMessage());
        }
    }

    public static void crearOEliminarFitxerCarpeta(String nomCarpeta, String nomFitxer) {
        File carpeta = new File(nomCarpeta);
        File fitxer = new File(carpeta, nomFitxer);

        try {
            if (!carpeta.exists()) {
                if (carpeta.mkdir()) {
                    if (fitxer.createNewFile()) {
                        System.out.println("Creats: " + carpeta.getName() + " i " + nomFitxer);
                    }
                }
            } else {
                if (fitxer.exists()) {
                    fitxer.delete();
                }
                if (carpeta.delete()) {
                    System.out.println("Esborrats: " + carpeta.getName() + " i " + nomFitxer);
                }
            }
        } catch (IOException e) {
            System.out.println("Error creant o esborrant fitxer o carpeta: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Error de seguretat en el maneig de fitxers: " + e.getMessage());
        }
    }

    public static void canviarNoms(File dir, File fitxer, String nouNomDir, String nouNomFitxer) {
        try {
            if (dir.exists()) {
                File nouDir = new File(nouNomDir);
                if (dir.renameTo(nouDir)) {
                    System.out.println("Directori renombrat a: " + nouNomDir);
                }
            }

            if (fitxer.exists()) {
                File nouFitxer = new File(nouNomFitxer);
                if (fitxer.renameTo(nouFitxer)) {
                    System.out.println("Fitxer renombrat a: " + nouNomFitxer);
                }
            }
        } catch (SecurityException e) {
            System.out.println("Error canviant els noms de la carpeta o fitxer: " + e.getMessage());
        }
    } 
    
    public static void llistarContingut(File[] directoris) {
        for (int i = 0; i < directoris.length; i++) {
            if (directoris[i] != null) {
                if (directoris[i].isFile()) {
                    System.out.println("És un fitxer: " + directoris[i].getName());
                } else if (directoris[i].isDirectory()) {
                    System.out.println("És un directori: " + directoris[i].getName());
                    System.out.println("Fitxers");
                    File[] auxiliar = directoris[i].listFiles();
                    llistarContingut(auxiliar);
                }

            }
        }
    }

    public static void fitxer(File[] fitxers, File[] directoris, Scanner str) {
        try {
            boolean existeix = true;
            System.out.println("Introdueix el nom del fitxer...");
            String fitxer = str.nextLine();
            for (int i = 0; i < fitxers.length; i++) {
                if (fitxer.toLowerCase().equals(fitxers[i].getName().toLowerCase())) {
                    System.out.println("Hi ha un fitxer que coincideix amb aquest nom.");
                    for (int j = 0; j < directoris.length; j++) {
                        if ( fitxers[i].getAbsoluteFile().getParent().equals(directoris[j].getAbsolutePath())) {
                            System.out.println("El fitxer "+fitxer+" existeix. Aquest es troba dins del directori "+directoris[j].getName());
                            j = directoris.length;
                        }
                    }
                    i=fitxers.length; 
                }
            }
            if (!existeix) {
                System.out.println("No hi ha cap fitxer que coincideixi amb aquest nom. Introdueix un altre nom.");
                fitxer(fitxers,directoris,str); 
            }
        } catch (SecurityException e) {
            System.out.println("Error al comprovar tipus: " + e.getMessage());
        }
    }

}
