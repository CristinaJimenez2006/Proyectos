package herencia_corregit;

/**
 *
 * @author crist
 */
import java.util.Scanner;
import static herencia_corregit.incidenciesFunc.*;

public class concessionari {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        vehicles[] stock = new vehicles[1000];
        incidencies[] taller = new incidencies[10000];
        emplena(stock);
        menu(stock, taller, str);

    }

    public static void emplena(vehicles[] stock) {
        vehicles vehicle0 = new combustio("2996CRP", "Volkswagen", "Golf");
        //        ((combustio) stock[0]).setCilindrada(1900);
        vehicles vehicle1 = new combustio("5094HNF", "Ford", "Fiesta");
        //        ((combustio) stock[1]).setCilindrada(1500);
        vehicles vehicle2 = new electrics("1234LMN", "Kia", "Ceed");
        //        ((electrics) stock[2]).setCapacitatBateria(1500);
        vehicles vehicle3 = new combustio("7864DFG", "Mercedes", "CLK2000");
        //        ((combustio) stock[3]).setCilindrada(2500);

        stock[0] = vehicle0;
        stock[1] = vehicle1;
        stock[2] = vehicle2;
        stock[3] = vehicle3;

    }

    public static void generaFacturaVenda(vehicles[] stock, Scanner str, Scanner in) {
        System.out.println("Introdueix la matrícula...");
        String matricula = str.nextLine();
        boolean trobat = false;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (stock[i].getMatricula().toLowerCase().equals(matricula)) {
                    float bonificacio = 0;
                    if (stock[i] instanceof electrics) {
                        System.out.println("Introdueix la bonificacio");
                        bonificacio = in.nextFloat();

                    } else {
                        bonificacio = 0;
                    }

                    stock[i].generaFacturaVenda(bonificacio);
                    trobat = true;
                }
            }
        }

        if (!trobat) {
            System.out.println("Error! Torna a introduir una altre matricula o revisa les dades introduides.");
        }
    }

    public static void informaTipusPreu(vehicles[] stock, Scanner str) {
        System.out.println("Introdueix la matrícula...");
        String matricula = str.nextLine();
        boolean trobat = false;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (stock[i].getMatricula().toLowerCase().equals(matricula)) {
                    stock[i].informaTipusPreu();
                    trobat = true;
                }
            }
        }

        if (!trobat) {
            System.out.println("Error! Torna a introduir una altre matricula o revisa les dades introduides.");
        }
    }

    public static void canviMoneda(vehicles[] stock, Scanner str) {
        System.out.println("Introdueix la matrícula...");
        String matricula = str.nextLine();
        boolean trobat = false;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (stock[i].getMatricula().toLowerCase().equals(matricula)) {
                    stock[i].canviMoneda();
                    trobat = true;
                }
            }
        }

        if (!trobat) {
            System.out.println("Error! Torna a introduir una altre matricula o revisa les dades introduides.");
        }
    }

    public static void canviUnitats(vehicles[] stock) {

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (stock[i] instanceof electrics) {
                    // potser açò
                    ((electrics) stock[i]).setPotenciaCarrega(((electrics) stock[i]).getPotenciaCarrega() * 1000);
                    // Una altra forma
                    ((electrics) stock[i]).canviUnitats();
                }
            }
        }
    }

    public static void LListatAltaBaixa(vehicles[] stock) {

        System.out.println("Vehicles alta");
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (stock[i].isActivat()) {
                    System.out.print("Alta: ");
                    mostraInfo(stock[i]);
                }
            }
        }
        System.out.println("Vehicles de baixa");
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (!stock[i].isActivat()) {
                    System.out.print("Alta: ");
                    mostraInfo(stock[i]);
                }
            }
        }
    }

    public static void vendaVehicle(vehicles[] stock) {
        Scanner inStr = new Scanner(System.in);

        System.out.println("Intro matricula");
        String matricula = inStr.nextLine();
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (matricula.equals(stock[i].getMatricula())) {
                    stock[i].setActivat(false);
                    mostraInfo(stock[i]);
                    i = stock.length;
                }
            }
        }
    }

    public static void mostraInfo(vehicles vehicle) {

        if (vehice instanceof electrics) {
            ((electrics) vehicle).toString();
        } else {
            ((combustio) vehicle).toString();
        }

    }

    public static void generaTotsPermisCirculacio(vehicles[] stock) {
        // Ho farem creant un mètode no static a les classes
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (stock[i] instanceof electrics) {
                    ((electrics) stock[i]).generaPC();
                } else {
                    ((combustio) stock[i]).generaPC();
                }
            }
        }

    }

    public static void generaInformeEmissionsZero(vehicles[] stock, Scanner in) {
        Scanner inStr = new Scanner(System.in);

        System.out.println("Intro matricula");
        String matricula = inStr.nextLine();
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (matricula.equals(stock[i].getMatricula())) {
                   float bonificacio = 0;
                    if (stock[i] instanceof electrics) {
                        System.out.println("Introdueix la bonificacio");
                        bonificacio = in.nextFloat();

                    } else {
                        bonificacio = 0;
                    }

                    stock[i].generaFacturaVenda(bonificacio);
                }
            }
        }
    }

    public static void generaPermisCirculacio(vehicles[] stock) {
        Scanner inStr = new Scanner(System.in);

        System.out.println("Intro matricula");
        String matricula = inStr.nextLine();
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (matricula.equals(stock[i].getMatricula())) {
                    System.out.println("Matrícula: " + stock[i].getMatricula());
                    System.out.println("Model: " + stock[i].getModel());
                    i = stock.length;
                }
            }
        }
    }

    public static void afegeixVehicle(vehicles[] stock) {
        // Crea un nou vehicle i el desa a l'array
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        System.out.println("Intro matricula");
        String matricula = inStr.nextLine();
        System.out.println("Intro marca");
        String marca = inStr.nextLine();
        System.out.println("Intro model");
        String model = inStr.nextLine();
        System.out.println("Intro preu");
        double preu = in.nextDouble();
        System.out.println("Elèctric o Combustió");
        String tipus = inStr.nextLine();
        while (!(tipus.equals("Elèctric") || tipus.equals("Combustió"))) {
            System.out.println("Tipus incorrecte. Torna'l a introduir");
            tipus = inStr.nextLine();
        }
        if (tipus.equals("Elèctric")) {
            System.out.println("Capacitat bateria");
            float capacitatBateria = in.nextFloat();
            System.out.println("Consum Electric");
            float consumElectric = in.nextFloat();
            System.out.println("Autonomia");
            int autonomia = in.nextInt();
            System.out.println("Potència càrrega");
            float potenciaCarrega = in.nextFloat();
            // D'una forma
            electrics vehicleE = new electrics(matricula, marca, model, preu, capacitatBateria, consumElectric);
            vehicleE.setAutonomia(autonomia);
            vehicleE.setPotenciaCarrega(potenciaCarrega);
            System.out.println(vehicleE.toString());
            insereix(stock, vehicleE);
        } else {
            System.out.println("Cilindrada");
            int cilindrada = in.nextInt();
            System.out.println("Tipus ( benzina / diesel )");
            String tipusMotor = inStr.nextLine();
            System.out.println("Consum");
            float consum = in.nextFloat();
            System.out.println("Potència");
            int potencia = in.nextInt();
            // D'una altra forma
            combustio vehicleC = new combustio();
            vehicleC.setMatricula(matricula);
            vehicleC.setMarca(marca);
            vehicleC.setModel(model);
            vehicleC.setPreu(preu);
            vehicleC.setCilindrada(cilindrada);
            vehicleC.setTipus(tipusMotor);
            vehicleC.setConsum(consum);
            vehicleC.setPotencia(potencia);
            System.out.println(vehicleC.toString());
            insereix(stock, vehicleC);

        }
        mostraTotsVehicles(stock);
    }

    public static void mostraTotsVehicles(vehicles[] stock) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                System.out.println("Posició " + i);
                System.out.println("Matricula / marca / model: " + stock[i].getMatricula()
                        + " / " + stock[i].getMarca()
                        + " / " + stock[i].getModel());
                // Interessant investigar com mostrar altres atributs
                if (stock[i] instanceof electrics) {
                    System.out.println("Capacitat de bateria:"
                            + ((electrics) stock[i]).getCapacitatBateria());
                    // Amb els altres paràmetres igual
                } else {
                    System.out.println("Cilindrada:"
                            + ((combustio) stock[i]).getCilindrada());
                    // Amb els altres paràmetres igual

                }

            }
        }
    }

    public static void insereix(vehicles[] stock, vehicles perAfegir) {
        boolean colocat = false;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                stock[i] = perAfegir;
                colocat = true;
                i = stock.length;
                System.out.println("Vehicle inserit al sistema");
            }
        }
        if (!colocat) {
            System.out.println("Ja no hi ha cap espai lliure");
        }

    }

    public static void eliminaVehicle(vehicles[] stock, incidencies[] taller) {

        // Primer hem de recollir la matrícula
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        System.out.println("Intro la matrícula del vehicle..");
        String matricula = in.nextLine();
        // Hem d'assegurar-nos que el vehicle existeix
        while (!existeixVehicle(stock, matricula)) {
            System.out.println("Aquest vehicle no existeix.");
            System.out.println("Intro la matrícula del vehicle..");
            matricula = in.nextLine();
        }
        // Si arribem a aquest punt és que existeix.
        // Hem d'esborrar les seves incidències
        esborraTotesIncidencies(taller, matricula);
        // Esborra el vehicle quan ja hem eliminat totes les dependències
        for (int i = 0; i < stock.length; i++) {
            if (stock[i].getMatricula().equals(matricula)) {
                stock[i] = null;
                System.out.println("Vehicle " + matricula + " eliminat");
                i = stock.length;
            }
        }
    }

    public static void menu(vehicles[] stock, incidencies[] taller, Scanner str) {
        Scanner in = new Scanner(System.in);
        int opcio = 0;
        while (opcio != 13) {
            System.out.println("MENÚ D'OPCIONS");
            System.out.println("==============");
            System.out.println("1. Afegeix vehicle");
            System.out.println("2. Genera permís de circulació");
            System.out.println("3. Genera informe emissió zero");
            System.out.println("4. Genera tots permisos de circulació");
            System.out.println("5. Venda vehicle");
            System.out.println("6. Llistat d'altes i baixes");
            System.out.println("7. Canvis d'unitats");
            System.out.println("8. Gestiona incidències");
            System.out.println("9. Esborra vehicles");
            System.out.println("10. Genera una factura de venda");
            System.out.println("11. Informa del tipus de vehicle i del seu preu");
            System.out.println("12. Assabentat del preu del vehicle en altres tipus de moneda");
            System.out.println("13. Sortir");
            System.out.print("Intro l'opció...");
            opcio = in.nextInt();
            switch (opcio) {
                case 1:
                    afegeixVehicle(stock);
                    break;
                case 2:
                    generaPermisCirculacio(stock);
                    break;
                case 3:
                    generaInformeEmissionsZero(stock, in);
                    break;
                case 4:
                    generaTotsPermisCirculacio(stock);
                    break;
                case 5:
                    vendaVehicle(stock);
                    break;
                case 6:
                    LListatAltaBaixa(stock);
                    break;
                case 7:
                    canviUnitats(stock);
                    break;
                case 8:
                    introAlgunesIncidencies(stock, taller);
                    gestionaIncidencies(stock, taller);
                    break;
                case 9:
                    eliminaVehicle(stock, taller);
                    break;
                case 10:
                    generaFacturaVenda(stock, str, in);
                    break;
                case 11:
                    informaTipusPreu(stock, str);
                    break;
                case 12:
                    canviMoneda(stock, str);
                    break;
                case 13:
                    break;
                default:
                    System.out.println("Valor incorrecte. Intro nou valor");
            }
        }
    }

}
