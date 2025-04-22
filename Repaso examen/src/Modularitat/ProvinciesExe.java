package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ProvinciesExe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        Província[] provincies = new Província[4];
        exemples(provincies);
        int opcio = 0;
        while (opcio != 5) {
            opcio = menu(in);
            if (opcio == 1) {
                Província provincia1 = cerca(provincies);
                if (provincia1 != null) {
                    double densitat = provincia1.densitat();
                    System.out.println("La poblacio " + provincia1.getNom() + " té una densitat de població de " + densitat);
                } else {
                    System.out.println("Error");
                }
            } else if (opcio == 2) {
                comunitatmesdensitat(provincies);
            } else if (opcio == 3) {
                incrementrenda(provincies, in);
            } else if (opcio == 4) {
                teclat(provincies, in);
            } else if (opcio == 5) {
                System.out.println("S'ha sortit del programa.");
                opcio = 5;
            } else {
                System.out.println("Error, introdueix una altra opció.");
                opcio = 0;
            }
        }
    }

    public static void teclat(Província[] provincies, Scanner in) {
        System.out.println("Introdueix una província...");
        String provincia = in.nextLine();

        for (int i = 0; i < provincies.length; i++) {
            if (provincies[i] != null) {
                if (provincies[i].getNom().toLowerCase().equals(provincia.toLowerCase())) {
                    int numprovincies = provincies[i].getProvinciescontacte().split(",").length; 
                    for (int j = 0; j < numprovincies; j++) {
                        String [] provinciacontacte =  provincies[i].getProvinciescontacte().split(","); 
                        String provincia1 = provinciacontacte[i]; 
                        for (int k = 0; k < provincies.length; k++) {
                            if (provincies[i] != null) {
                            if (provincies[i].getNom().toLowerCase().equals(provincia1.toLowerCase())) {
                                double densitat = provincies[i].densitat();
                                System.out.println("La poblacio " + provincies[i].getNom() + " té una densitat de població de " + densitat);
                            }
                        }
                    }
                    
                }
            }
        }
    }
    }
    
    public static void incrementrenda(Província[] provincies, Scanner in) {
        System.out.println("Introdueix un increment de renda");
        double increment = in.nextDouble();
        for (int i = 0; i < provincies.length; i++) {
            Província provincia = cerca(provincies);
            if (provincia != null) {
                provincia.actualitzacio(increment);
                System.out.println(provincia);
            }
        }
    }

    public static void comunitatmesdensitat(Província[] provincies) {
        double max = 0;
        String poblacio = "";
        double densitat = 0;
        for (int i = 0; i < provincies.length; i++) {
            Província provincia = cerca(provincies);
            if (provincia != null) {
                densitat = provincia.densitat();
                if (i == 0) {
                    max = densitat;
                    poblacio = provincia.getNom();
                } else {
                    if (densitat > max) {
                        max = densitat;
                        poblacio = provincia.getNom();
                    }
                }
            } else {
                System.out.println("No existeix cap província en aquesta casella");
            }

        }
        System.out.println("La província amb major densitat és " + poblacio + " amb una densitat de " + densitat);
    }

    public static Província cerca(Província[] provincies) {
        for (int i = 0; i < provincies.length; i++) {
            if (provincies[i] != null) {
                return provincies[i];
            }
        }
        return null;
    }

    public static void exemples(Província[] provincies) {
        provincies[0] = new Província("Barcelona", 5660000, 7728, 30947, "Girona,Lleida,Tarragona");
        provincies[1] = new Província("Girona", 781000, 5910, 28184, "Barcelona,Lleida");
        provincies[2] = new Província("Lleida", 440000, 12150, 28456, "Barcelona,Girona,Tarragona");
        provincies[3] = new Província("Tarragona", 810000, 6303, 30810, "Lleida,Barcelona");

    }

    public static int menu(Scanner in) {
        System.out.println("Escull una opció...");
        System.out.println("1. Densitat de població");
        System.out.println("2. Comunitat amb més densitat de població");
        System.out.println("3. Increment de renda per capità");
        System.out.println("4. Densitat de població de le sprovíncies col.lindants. ");
        System.out.println("5. Sortir");
        int opcio = in.nextInt();
        return opcio;
    }
}
