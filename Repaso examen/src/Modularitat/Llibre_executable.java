package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Llibre_executable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        String ISBN;
        String[] guardararray = new String[5];
        String[] novesadquisicions = {"Llibre1;Noah Hararu; A5422; 56; 8", "Llibre2;Paloma Hannah; A233; 78; 12", "Llibre1;StrEloy Moreno; A7890; 27; 2"};
        Llibres[] recollirllibres = new Llibres[10];
        emplenaLlibresExemples(recollirllibres);
        int opcio = 0;
        float percentatge;
        boolean surt = false;
        while (surt == false) {
            opcio = menu(in, opcio);
            if (opcio == 1) {
                afegir(inStr, in, recollirllibres);
            } else if (opcio == 2) {
                System.out.println("ISBN");
                ISBN = inStr.nextLine();
                eliminar(ISBN, recollirllibres);
            } else if (opcio == 3) {
                mostraInventari(recollirllibres);
            } else if (opcio == 4) {
                System.out.println("ISBN");
                ISBN = inStr.nextLine();
                modificar(ISBN, recollirllibres, in, inStr);
                //ACABAR
            } else if (opcio == 5) {
                System.out.println("ISBN");
                ISBN = inStr.nextLine();
                preuIva(recollirllibres, inStr, ISBN);
            } else if (opcio == 6) {
                System.out.println("ISBN");
                ISBN = inStr.nextLine();
                recollirllibres.preuIva2();
                //ACABAR
            } else if (opcio == 7) {
                System.out.println("ISBN");
                ISBN = inStr.nextLine();
                indexpujada(recollirllibres, inStr, in, ISBN);
            } else if (opcio == 8) {
                System.out.println("ISBN");
                ISBN = inStr.nextLine();
                for (int i = 0; i < recollirllibres.length; i++) {
                    if (recollirllibres[i] != null) {
                        if (recollirllibres[i].getISBN().equals(ISBN)) {
                            System.out.println("Preu: " + recollirllibres[i].getPreu());
                            System.out.println("Valor de l'index de pujada");
                            percentatge = in.nextFloat();
                            recollirllibres[i].indexpujada(percentatge);
                        }
                    }
                }
            } else if (opcio == 9) {

            } else if (opcio == 10) {
                surt = true;
            } else {
                System.out.println("L'opció no és vàlida.");
            }
        }
    }

    public static void preuIva(Llibres[] recollirllibres, Scanner inStr, String ISBN) {
        boolean trobat = false;
        for (int i = 0; i < recollirllibres.length; i++) {
            if (recollirllibres[i] != null) {
                if (recollirllibres[i].getISBN().equals(ISBN)) {
                    System.out.println("Preu: " + recollirllibres[i].getPreu());
                    System.out.println("Preu amb un IVA del 25%: " + (recollirllibres[i].getPreu() * 0.25));
                    trobat = true;
                }
            }
            i = recollirllibres.length;
        }
        if (trobat) {
            System.out.println("Llibre no trobat.");
        }
    }

    public static void emplenaLlibresExemples(Llibres[] recollirllibres) {
        recollirllibres[0] = new Llibres("Nexus", "Noah Hararu", "A543", 23, 12);
        recollirllibres[1] = new Llibres("Hàbits atòmics", "James Clear", "A443", 12, 25);
        recollirllibres[2] = new Llibres("Victòria", "Paloma Sánchez", "A320", 7, 1);
        recollirllibres[3] = new Llibres("Les que no dormen", "Dolores Redondo", "A123", 53, 22);
        recollirllibres[4] = new Llibres("Invisible", "Eloy Moreno", "A009", 43, 17);

    }

    public static void novesadquisicions(String[] novesadquisicions, Llibres[] recollirllibres, String[] guardararray) {
        
        for (int i = 0; i < novesadquisicions.length; i++) {
               guardararray = novesadquisicions[i].split(";");
                for (int y = 0; y < recollirllibres.length; y++) {
                   if (recollirllibres[i] != null) {
                    recollirllibres[i] = new Llibres(guardararray[0], guardararray[1], guardararray[2], Float.parseFloat(guardararray[3]), Integer.parseInt(guardararray[4]));
                }
            }
        }

    }

    public static int menu(Scanner in, int option) {

        System.out.println("Menú:");
        System.out.println("1. Afegir");
        System.out.println("2. Esborrar per ISBN");
        System.out.println("3. Mostra inventari");
        System.out.println("4. Modificar");
        System.out.println("5. Preu del llibre amb IVA");
        System.out.println("6. Preu del llibre amb IVA (2)");
        System.out.println("7. Index de pujada");
        System.out.println("8. Sortir");
        System.out.println("Escull una opció");
        option = in.nextInt();
        return option;
    }

    public static void indexpujada(Llibres[] recollirllibres, Scanner inStr, Scanner in, String ISBN) {
        float percentatge = 0;
        boolean trobat = false;
        for (int i = 0; i < recollirllibres.length; i++) {
            if (recollirllibres[i] != null) {
                if (recollirllibres[i].getISBN().equals(ISBN)) {
                    System.out.println("Preu: " + recollirllibres[i].getPreu());
                    System.out.println("Valor de l'index de pujada");
                    percentatge = in.nextFloat();
                    if (recollirllibres[i].getPreu() >= 20) {
                        System.out.println("Preu amb el index de pujada del " + percentatge + "%:" + (recollirllibres[i].getPreu() + (recollirllibres[i].getPreu() * (percentatge / 100))));
                    } else {
                        percentatge = percentatge / 2;
                        System.out.println("Preu amb el index de pujada del " + percentatge + "%:" + (recollirllibres[i].getPreu() + (recollirllibres[i].getPreu() * (percentatge / 100))));

                    }
                    trobat = true;
                }
            }
        }
        if (trobat == false) {
            System.out.println("Llibre no trobat.");
        }
    }

    public static void afegir(Scanner inStr, Scanner in, Llibres[] recollirllibres) {
        boolean introduit = false;
        for (int i = 0; i < recollirllibres.length; i++) {
            Llibres llibre1 = new Llibres();
            if (recollirllibres[i] == null) {
                System.out.println("Títol");
                String titol = inStr.nextLine();
                llibre1.setTitol(titol);
                System.out.println("Autor");
                String autor = inStr.nextLine();
                llibre1.setAutor(autor);
                System.out.println("ISBN");
                String ISBN = inStr.nextLine();
                llibre1.setISBN(ISBN);
                System.out.println("preu");
                Float preu = in.nextFloat();
                llibre1.setPreu(preu);
                System.out.println("Quantitat");
                int quantitat = in.nextInt();
                llibre1.setQuantitat(quantitat);
                recollirllibres[i] = llibre1;
                i = recollirllibres.length;
                introduit = true;
            }
        }
        if (introduit == false) {
            System.out.println("L'array està complet");
            System.out.println("No s'ha desat la informació");
        }
    }

    public static void eliminar(String ISBN, Llibres[] recollirllibres) {
        boolean trobat = false;
        for (int i = 0; i < recollirllibres.length; i++) {
            if (recollirllibres[i] != null) {
                //Es un string si o si se tiene que hacer con .equals. 
                if (recollirllibres[i].getISBN().equals(ISBN)) {
                    recollirllibres[i] = null;
                    System.out.println("Llibres esborrat");
                    trobat = true;
                }

            }
        }
        if (trobat == false) {
            System.out.println("No s'ha trobat el llibre.");
        }
    }

    public static void modificar(String ISBN, Llibres[] recollirllibres, Scanner in, Scanner inStr) {
        boolean buit = true;
        int opcio;
        for (int i = 0; i < recollirllibres.length; i++) {
            if (recollirllibres[i] != null) {
                if (recollirllibres[i].getISBN().equals(ISBN)) {
                    System.out.println("Que vols editar?");
                    System.out.println("1. Títol");
                    System.out.println("2. Autor");
                    System.out.println("3. Preu");
                    System.out.println("4. Quantitat");
                    System.out.println("Escull una opció");
                    opcio = in.nextInt();
                    if (opcio == 1) {
                        System.out.println("Títol");
                        recollirllibres[i].setTitol(inStr.nextLine());
                    } else if (opcio == 2) {
                        System.out.println("Autor");
                        recollirllibres[i].setAutor(inStr.nextLine());
                    } else if (opcio == 3) {
                        System.out.println("Preu");
                        recollirllibres[i].setPreu(in.nextInt());

                    } else if (opcio == 4) {
                        System.out.println("Quantitat");
                        recollirllibres[i].setQuantitat(in.nextInt());
                    } else {
                        System.out.println("L'opció no és vàlida.");
                    }
                    i = recollirllibres.length;
                }

            }
        }

    }

    public static void mostraInventari(Llibres[] recollirllibres) {
        float valor, valortotal = 0;
        boolean buit = true;
        for (int i = 0; i < recollirllibres.length; i++) {
            if (recollirllibres[i] != null) {
                System.out.println(recollirllibres[i].toString());
                // System.out.println(recollirllibres[i].getTitol()+recollirllibres[i].getAuto()+"valor"+(recollirllibres[i].getPreu() * recollirllibres[i].getQuantitat())); --> També és pot posar d'aquesta forma. 
                //De la anterior forma evitamos crear variable.
                valor = recollirllibres[i].getPreu() * recollirllibres[i].getQuantitat();
                System.out.println("Valor: " + valor + " €.");
                valortotal += valor;
                buit = false;
                if (i == recollirllibres.length - i) {
                    System.out.println("Valor total: " + valortotal + " €.");
                }
            } else {
                System.out.println("No hi ha llibre.");
            }
        }
    }
}
