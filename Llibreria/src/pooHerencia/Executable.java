package pooHerencia;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author crist
 */
public class Executable {

    public static void main(String[] args) {
        Llibreria[] biblioteca = new Llibreria[10];
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        carregarInformacio(biblioteca);
        menu(in, str, biblioteca);
        System.out.println(Arrays.toString(biblioteca));
    }

    public static void menu(Scanner in, Scanner str, Llibreria[] biblioteca) {
        int opcio = 0;
        while (opcio != 10) {
            System.out.println("Menú:");
            System.out.println("1. Mostra l'informació de tots els elements de la biblioteca amb els seus atributs. ");
            System.out.println("2. Mostra l'informació de tots els elements de la biblioteca (general). ");
            System.out.println("3. Modifica el preu del llibre per ISBN.");
            System.out.println("4. Modifica els preus dels llibres dels mateixos tipus.");
            System.out.println("5. Disminuir el nombre d'exemplars del llibre.");
            System.out.println("6. Imprimir argument de les obres de teatre.");
            System.out.println("7. Mostrar obres de divulgació que contenen la paraula 'coronavirus'.");
            System.out.println("10. Sortir del programa.");
            System.out.println("Escull una opció...");
            opcio = in.nextInt();

            switch (opcio) {
                case 1:
                    mostrarTotaInformacioCadaElement(biblioteca, str);
                    break;
                case 2:
                    generarFitxa(biblioteca);
                    break;
                case 3:
                    modificarPreuIsbn(biblioteca, str);
                    break;
                case 4:
                    modificarPreuTipus(biblioteca, str);
                    break;
                case 5:
                    disminuirVenda(biblioteca, str);
                    break;
                case 6:
                    imprimirArgument(biblioteca);
                    break;
                case 7:
                    mostrarObresDivulgacio(biblioteca, str);
                    break;
                case 10:
                    System.out.println("S'ha sortit del programa.");
                    break;
                default:
                    System.out.println("Opció no vàlida. Introdueix un altre número.");
                    break;
            }
        }

    }

    public static void carregarInformacio(Llibreria[] biblioteca) {
        biblioteca[0] = new Narrativa("Fantasia", "Els tres porquets", "1", "Josep Tadarella", "CasaNova", 10, 28.95);
        biblioteca[1] = new Teatre("Formatge", "Maria i Josep ", "2", "Pilar Cardoso", "BoscVerd", 6, 10);
        biblioteca[2] = new Assaig(36, "Jo", "3 ", "ff", "j", 9, 13.29);
        biblioteca[3] = new Divulgacio("exterior", "tu", "4 ", "ff", "cap", 34, 59);
    }

    public static Llibreria trobarLlibrePerIsbn(Llibreria[] biblioteca, Scanner str) {
        System.out.println("Introdueix l'isbn del llibre...");
        String isbn = str.nextLine().toLowerCase();
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {
                if (isbn.equals(biblioteca[i].getIsbn().toLowerCase())) {
                    return biblioteca[i];
                }
            }
        }
        return null;
    }

    public static void mostrarTotaInformacioCadaElement(Llibreria[] biblioteca, Scanner str) {
        boolean trobat = false;
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {
                if (biblioteca[i] instanceof Narrativa) {
                    System.out.println(((Narrativa) biblioteca[i]).toString());
                } else if (biblioteca[i] instanceof Teatre) {
                    System.out.println(((Teatre) biblioteca[i]).toString());
                } else if (biblioteca[i] instanceof Assaig) {
                    System.out.println(((Assaig) biblioteca[i]).toString());
                } else if (biblioteca[i] instanceof Divulgacio) {
                    System.out.println(((Divulgacio) biblioteca[i]).toString());
                }
                trobat = true;
            }
        }

        if (!trobat) {
            System.out.println("La biblioteca està buida.");
        }

    }

    public static void generarFitxa(Llibreria[] biblioteca) {
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {
                biblioteca[i].generaFitxa();
            }
        }
    }

    public static void modificarPreuIsbn(Llibreria[] biblioteca, Scanner str) {
        Llibreria llibre = trobarLlibrePerIsbn(biblioteca, str);
        boolean trobat = false;
        while (!trobat) {
            if (llibre != null) {
                System.out.println("Introdueix un percentatge en el format demanat. Ex: (+5) o (-3).");
                String percentatge = str.nextLine();
                llibre.modificaPreuIsbn(percentatge);
                trobat = true;
            } else {
                System.out.println("No s'ha trobat el llibre demanat. Verifica que l'isbn que hagis introduit es correcte. Torna a provar.");
            }
        }
    }

    public static void modificarPreuTipus(Llibreria[] biblioteca, Scanner str) {
        System.out.println("Indica el tipus de llibre...");
        System.out.println("1. Narrativa (n).");
        System.out.println("2. Teatre (t).");
        System.out.println("3. Assaig (a).");
        System.out.println("4. Divulagacio (d).");
        String tipus = str.nextLine();
        System.out.println("Introdueix un percentatge en el format demanat. Ex: (+5) o (-3).");
        String percentatge = str.nextLine();
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {
                if (tipus.toLowerCase().equals("n")) {
                    if (biblioteca[i] instanceof Narrativa) {
                        ((Narrativa) biblioteca[i]).modificaPreuIsbn(percentatge);

                    }
                } else if (tipus.toLowerCase().equals("t")) {
                    if (biblioteca[i] instanceof Teatre) {
                        ((Teatre) biblioteca[i]).modificaPreuIsbn(percentatge);

                    }
                } else if (tipus.toLowerCase().equals("a")) {
                    if (biblioteca[i] instanceof Assaig) {
                        ((Assaig) biblioteca[i]).modificaPreuIsbn(percentatge);

                    }
                } else if (tipus.toLowerCase().equals("d")) {
                    if (biblioteca[i] instanceof Divulgacio) {
                        ((Divulgacio) biblioteca[i]).modificaPreuIsbn(percentatge);

                    }
                } else {
                    System.out.println("No s'ha trobat cap llibre amb el tipus indicat. Verifica que hagis introduit correctament la lletra. Torna a provar.");
                }
                i = biblioteca.length;
            }
        }
    }

    public static void disminuirVenda(Llibreria[] biblioteca, Scanner str) {
        System.out.println("Introdueix el títol del llibre....");
        String titol = str.nextLine();
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {
                if (titol.toLowerCase().replace(" ", "").equals(biblioteca[i].getTitol().toLowerCase().replace(" ", ""))) {
                    if (biblioteca[i].getExemplars() > 0) {
                        biblioteca[i].setExemplars(biblioteca[i].getExemplars() - 1);
                    } else {
                        System.out.println("Aquest llibre no té exemplars.");
                    }
                    i = biblioteca.length;
                }
            }
        }
    }

    public static void imprimirArgument(Llibreria[] biblioteca) {
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {
                if (biblioteca[i] instanceof Teatre) {
                    System.out.println(((Teatre) biblioteca[i]).getArgument());
                }
            }
        }
    }

    public static void mostrarObresDivulgacio(Llibreria[] biblioteca, Scanner str) {
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {
                if (biblioteca[i] instanceof Divulgacio) {
                    System.out.println("Introdueix la paraula que vols cercar...");
                    String paraula = str.nextLine().toLowerCase();
                    if (((Divulgacio) biblioteca[i]).getAmbit().toLowerCase().indexOf(paraula)!=-1) {
                            System.out.println(((Divulgacio)biblioteca[i]).toString());
                    }
                }

            }
        }
    }
}
