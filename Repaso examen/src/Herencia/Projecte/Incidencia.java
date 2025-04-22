package Herencia.Projecte;

import java.util.Scanner;
import static Herencia.Projecte.Executable.*;

/**
 *
 * @author crist
 */
public class Incidencia {

    public static void menu2(Scanner in, Scanner str, vehicles[] vehicle, incidencies[] incidencia) {
        emplenaIncidencia(in, incidencia);
        int opcio = 0;
        while (opcio != 5) {
            System.out.println("Benvingut al programa d'incidències.");
            System.out.println("Escull una opció");
            System.out.println("Menú:");
            System.out.println("1. Obrir o crear una incidència.");
            System.out.println("2. Consultar incidències.");
            System.out.println("3. Mostrar totes les incidències.");
            System.out.println("4. Tancar una incidència.");
            System.out.println("5. Sortir.");
            opcio = in.nextInt();
            switch (opcio) {
                case 1:
                    obrirIncidencia(str, vehicle, incidencia);
                    break;
                case 2:
                    consultarIncidencia(in, str, vehicle, incidencia);
                    break;
                case 3:
                    mostrarIncidencia(incidencia);
                    break;
                case 4:
                    tancarIncidencia(in, str, vehicle, incidencia);
                    break;
                case 5:
                    System.out.println("S'ha sortir del programa.");
                    menu(in, str, vehicle, incidencia);
                    break;
                default:
                    System.out.println("Opció no vàlida. Introdueix un altre número.");
                    break;
            }
        }
    }

    public static void obrirIncidencia(Scanner str, vehicles[] vehicle, incidencies[] incidencia) {
        System.out.println("Introdueix una matrícula...");
        String matricula = str.nextLine();
        boolean trobat = true;
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null) {
                if (matricula.toLowerCase().equals(vehicle[i].getMatricula())) {
                    for (int j = 0; j < incidencia.length; j++) {
                        if (incidencia[j] == null) {
                            System.out.println("Estàs obrint o creant una incidència.");
                            System.out.println("Indica quin és el problema");
                            String problema = str.nextLine();
                            incidencia[j] = new incidencies(matricula, problema);
                            j = incidencia.length;
                        }
                    }
                } else {
                    trobat = false;
                }
            }
        }
        if (!trobat) {
            System.out.println("No s'ha trobat cap vehicle amb aquesta matrícula: " + matricula);
        }
    }

    public static void consultarIncidencia(Scanner in, Scanner str, vehicles[] vehicle, incidencies[] incidencia) {
        System.out.println("Introdueix una matrícula...");
        String matricula = str.nextLine();
        boolean trobat = true;
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null) {
                if (matricula.toLowerCase().equals(vehicle[i].getMatricula())) {
                    for (int j = 0; j < incidencia.length; j++) {
                        if (incidencia[j] != null) {
                            if (vehicle[i].getMatricula().toLowerCase().equals(incidencia[j].getMatricula())) {
                                System.out.println("Vols sortir del programa, consultar una incidència concreta o les incidències que coincideixen amb la matrícula introduida anteriorment?");
                                System.out.println("1. Tancar una incidència (p).");
                                System.out.println("2. Tancar varies incidències (o).");
                                System.out.println("3. Sortir del programa.");
                                String lletra = str.nextLine();
                                if ((lletra.toLowerCase().equals("p")) || (lletra.toLowerCase().equals("s")) || (lletra.toLowerCase().equals("o"))) {
                                    if (lletra.toLowerCase().equals("p")) {
                                        System.out.println("Introdueix el id");
                                        int id = in.nextInt();
                                        if (id == incidencia[i].getId()) {
                                            System.out.println(incidencia[i].toString());
                                            j = incidencia.length;
                                        } else {
                                            System.out.println("L'id introduit és incorrecte. Introdueix un altre id.");
                                        }
                                    } else if (lletra.toLowerCase().equals("o")) {
                                        System.out.println(incidencia[j].toString());
                                    } else {
                                        j = incidencia.length;
                                    }
                                } else {
                                    System.out.println("La lletra introduida és incorrecte. Introdueix una altra lletra (p, o, s");
                                }
                            } else {
                                trobat = false;
                            }
                        }

                    }
                } else {
                    trobat = false;
                }
            }
        }

        if (!trobat) {
            System.out.println("No hi ha cap coincidència amb aquesta matrícula: " + matricula);
        }
    }

    public static void mostrarIncidencia(incidencies[] incidencia) {
        for (int i = 0; i < incidencia.length; i++) {
            if (incidencia[i] != null) {
                System.out.println(incidencia[i].toString());
            }
        }
    }

    public static void tancarIncidencia(Scanner in, Scanner str, vehicles[] vehicle, incidencies[] incidencia) {
        System.out.println("Introdueix una matrícula...");
        String matricula = str.nextLine();
        boolean trobat = true;
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null) {
                if (matricula.toLowerCase().equals(vehicle[i].getMatricula())) {
                    for (int j = 0; j < incidencia.length; j++) {
                        if (incidencia[j] != null) {
                            if (vehicle[i].getMatricula().toLowerCase().equals(incidencia[j].getMatricula())) {
                                System.out.println("Vols sortir del programa, tancar una incidència concreta o les incidències que coincideixen amb la matrícula introduida anteriorment?");
                                System.out.println("1. Tancar una incidència (p).");
                                System.out.println("2. Tancar varies incidències (o).");
                                System.out.println("3. Sortir del programa. (s)");
                                String lletra = str.nextLine();
                                if ((lletra.toLowerCase().equals("p")) || (lletra.toLowerCase().equals("o")) || (lletra.toLowerCase().equals("s"))) {
                                    if (lletra.toLowerCase().equals("p")) {
                                        System.out.println("Introdueix el id");
                                        int id = in.nextInt();
                                        if (id == incidencia[j].getId()) {
                                            incidencia[j].setEstat(true);
                                            System.out.println("Indica les hores de mà d'obra que han fet falta.");
                                            double hores = in.nextDouble();
                                            incidencia[j].setHores(hores);
                                            System.out.println(incidencia[i].toString());
                                            j = incidencia.length;
                                        } else {
                                            System.out.println("L'id introduit és incorrecte. Introdueix un altre id.");
                                        }
                                    } else if (lletra.toLowerCase().equals("o")) {
                                        incidencia[j].setEstat(true);
                                        System.out.println("Indica les hores de mà d'obra que han fet falta.");
                                        double hores = in.nextDouble();
                                        incidencia[j].setHores(hores);
                                        System.out.println(incidencia[i].toString());

                                    } else {
                                        j = incidencia.length;
                                    }
                                } else {
                                    System.out.println("La lletra introduida és incorrecte. Introdueix una altra lletra (p, o, s");
                                    j--;
                                }
                            } else {
                                trobat = false;
                            }
                        }
                    }
                } else {
                    trobat = false;
                }
            }
        }
        if (!trobat) {
            System.out.println("No hi ha cap coincidència amb aquesta matrícula: " + matricula);
        }
    }
}
