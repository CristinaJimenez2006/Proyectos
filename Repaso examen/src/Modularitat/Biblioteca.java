package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Biblioteca {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        Llibres[] biblioteca = new Llibres[10];
        emplenaExemples(biblioteca);
        int opcio = 0, posicion = 0;
        String isbn;

        while (opcio != 9) {
            opcio = menu(in);
            System.out.println("Intro ISBN");
            isbn = inStr.nextLine();
            switch (opcio) {
                case 1:
                    afegirLlibre(biblioteca, in, inStr);
                    break;
                case 2:
                    // Eliminar un llibre per isbn
                    posicion=cerca(biblioteca, inStr, isbn, posicion);
                    eliminarLlibre(biblioteca, isbn, posicion);
                    break;
                case 3:
                    // Mostra inventari i valor
                    posicion=cerca(biblioteca, inStr, isbn, posicion);
                    mostraInventari(biblioteca, posicion);
                    break;
                case 4:
                    // Edita informació
                    posicion=cerca(biblioteca, inStr, isbn, posicion);
                    editarInfo(biblioteca, inStr, in, posicion);
                case 5:
                    // Afegeix IVA 
                    posicion=cerca(biblioteca, inStr, isbn, posicion);
                    // Crida no estàtica
                    System.out.println(biblioteca[posicion].afegeixIVA());
                    // Crida estàtica
                    afegeixIVA2(biblioteca[posicion]);

                case 6:
                    // Edita biblio
                    posicion=cerca(biblioteca, inStr, isbn, posicion);
                    editaLlibre(biblioteca, inStr, in, posicion);
                    
                case 9:
                    break;
                default:
                    System.out.println("Opció no valida");
                    opcio = 0;
            }
        }
    }

    //Ha de ser estàtic sempre
    public static int cerc(Llibres[] biblioteca, Scanner inStr, String isbn, int posicion) {
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {
                if (biblioteca[i].getISBN().equals(isbn)) {
                    posicion = i;
                }
            }
        }
        return posicion;
    }

    public static void afegeixIVA2(Llibres llibre) {
        System.out.println(llibre.getPreu() * 1.21);
    }

    public static void editarInfo(Llibres[] biblioteca, Scanner inStr, Scanner in, int posicion) {
        boolean trobat = false;
        System.out.println("Quin isbn vols editar ?");
        if (posicion != 0) {
            trobat = true;
            editaLlibre(biblioteca, inStr, in, posicion);
        }

        if (trobat) {
            System.out.println("Aquest llibre no és present");
        }
    }

    public static void editaLlibre(Llibres [] biblioteca, Scanner inStr, Scanner in, int posicion) {
        System.out.println("Que vols editar ?");
        System.out.println("Titol(t)/Autor(a)/Quantitat(q)/Preu(p)");
        char opcio = inStr.nextLine().toLowerCase().charAt(0);
        switch (opcio) {
            case 't':
                System.out.println("Intro nou títol");
                String titol = inStr.nextLine();
                biblioteca[posicion].setTitol(titol);
                break;
            case 'a':
                System.out.println("Intro nou autor");
                biblioteca[posicion].setAutor(inStr.nextLine());
                break;
            case 'q':
                System.out.println("Intro nou quantitat");
                biblioteca[posicion].setQuantitat(in.nextInt());
                break;
            case 'p':
                System.out.println("Intro nou preu");
                biblioteca[posicion].setPreu(in.nextFloat());
                break;
            default:
                System.out.println("Opció no vàlida");

        }
    }

    public static void mostraInventari(Llibres[] biblio, int posicion) {
        float sumaTotal = 0;
        if (posicion != 0) {
                System.out.println(biblio[posicion].getTitol() + "   "
                        + biblio[posicion].getAutor() + "   "
                        + biblio[posicion].getQuantitat() + "   "
                        + biblio[posicion].getPreu() + "   "
                        + (biblio[posicion].getQuantitat() * biblio[posicion].getPreu()));
                sumaTotal = sumaTotal + (biblio[posicion].getQuantitat() * biblio[posicion].getPreu());
        }
        System.out.println("======================");
        System.out.println("Valor total: " + sumaTotal);

    }

    public static void emplenaExemples(Llibres[] biblioteca) {
        biblioteca[0] = new Llibres("Nexus", "Noah Harari", "A543", 23, 12);
        biblioteca[1] = new Llibres("Hàbits atòmics", "James Clear", "A443", 12, 25);
        biblioteca[2] = new Llibres("Victòria", "Paloma Sánchez", "A320", 25, 2);
        biblioteca[3] = new Llibres("Les que no dormen", "Dolores Redondo", "A123", 34, 4);
        biblioteca[4] = new Llibres("Invisible", "Eloy Moreno", "A009", 14, 10);
    }

    public static void eliminarLlibre(Llibres[] biblioteca, String isbn, int posicion) {
        boolean trobat = false;
        if (posicion != 0) {
            System.out.println("LLibre esborrat");
            trobat = true;
        }

        if (trobat==false) {
            System.out.println("No s'ha trobat el llibre");
        }

    }

    public static void afegirLlibre(Llibres[] biblioteca, Scanner recull, Scanner recullStr) {

        Llibres llibre1 = new Llibres();

        System.out.println("Titol");
        String titol = recullStr.nextLine();
        System.out.println("Autor");
        String autor = recullStr.nextLine();
        System.out.println("ISBN");
        String isbn = recullStr.nextLine();
        System.out.println("Preu");
        float preu = recull.nextFloat();

        llibre1.setTitol(titol);
        llibre1.setAutor(autor);
        llibre1.setISBN(isbn);
        llibre1.setPreu(preu);

        boolean introduit = false;
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] == null) {
                biblioteca[i] = llibre1;
                i = biblioteca.length;
                introduit = true;
            }
        }

        if (introduit == false) {
            System.out.println("L'array està complet");
            System.out.println("No s'ha desat la informació");
        }

    }

    public static int menu(Scanner recull) {

        System.out.println("1. Afegir llibre");
        System.out.println("2. Eliminar llibre per isbn");
        System.out.println("3. Mostra valor inventari");
        System.out.println("4. Edita informació");
        System.out.println("5. Preu amb Iva");
        System.out.println("9. Sortir");
        int opcio = recull.nextInt();
        return opcio;
    }

}
