package herencia_corregit;

/**
 *
 * @author crist
 */
import java.util.Scanner;

public class incidenciesFunc {

    public static void gestionaIncidencies(vehicles[] stock, incidencies[] taller) {

        Scanner in = new Scanner(System.in);

        System.out.println("Menú incidències");
        System.out.println("1. Alta d'incidència...");
        System.out.println("2. Modificació d'incidència");
        System.out.println("3. Tancament incidència");
        System.out.println("4. Esborra incidència");
        System.out.println("5. Mostra incidències");
        System.out.println("9. Sortir de la gestió d'incidències");
        System.out.println("Selecciona una opció");
        int opcio = in.nextInt();
        switch (opcio) {
            case 1:
                creaNovaIncidencia(stock, taller);
                break;
            case 2:
                ModificaIncidencia(stock, taller);
                break;
            case 3:
                tancaIncidencia(stock, taller);
                break;
            case 4:
                EsborraIncidencia(stock, taller);
                break;
            case 5:
                mostraIncidencies(stock, taller);
                break;
            case 9:
                break;
            default:
                System.out.println("Valor incorrecte. Intro nou valor");

        }

    }

    public static void introAlgunesIncidencies(vehicles[] stock, incidencies[] taller) {
        // Introduirem algunes incidències . Compte amb la matrícula, ha d'existir
        // Generem dues incidències d'algun del vehicles
        // Per definició de la classe quan es crea la incidència sempre està oberta
        taller[0] = new incidencies("2996CRP");
        taller[0].setAvaria("No frena bé");
        taller[1] = new incidencies("2996CRP");
        taller[1].setAvaria("No va la llum de marxa enrere");
        taller[2] = new incidencies("5094HNF");
        taller[2].setAvaria("Revisió 200.000");
        taller[3] = new incidencies("1234LMN");
        taller[3].setAvaria("No arrenca");
        taller[4] = new incidencies("2996CRP");
        taller[4].setAvaria("S'ha de repassar la junta de culata");

    }

    public static boolean existeixVehicle(vehicles[] stock, String matricula) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                if (stock[i].getMatricula().equals(matricula)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void creaNovaIncidencia(vehicles[] stock, incidencies[] taller) {
        // Demanarem la matrícula
        // Crearem la incidència i la desarem a l'array
        Scanner in = new Scanner(System.in);
        System.out.println("Intro la matrícula del vehicle..");
        String matricula = in.nextLine();
        while (!existeixVehicle(stock, matricula)) {
            System.out.println("Aquest vehicle no existeix.");
            System.out.println("Intro la matrícula del vehicle..");
            matricula = in.nextLine();
        }
        incidencies novaIncidencia = new incidencies(matricula);
        System.out.println("Què li passa al vehicle");
        String avaria = in.nextLine();
        novaIncidencia.setAvaria(avaria);
        for (int i = 0; i < taller.length; i++) {
            if (taller[i] == null) {
                taller[i] = novaIncidencia;
                taller[i].toString();
                i = taller.length;
                System.out.println("incidència introduïda amb èxit");
            }
        }

    }

    public static void mostraIncidencies(vehicles[] stock, incidencies[] taller) {
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        System.out.println("Intro la matrícula del vehicle..");
        String matricula = in.nextLine();
        while (!existeixVehicle(stock, matricula)) {
            System.out.println("Aquest vehicle no existeix.");
            System.out.println("Intro la matrícula del vehicle..");
            matricula = in.nextLine();
        }
        // Mostrem totes les incidències del vehicle i els seu estat
        boolean trobada = false;
        for (int i = 0; i < taller.length; i++) {
            if (taller[i] != null) {
                if (taller[i].getMatricula().equals(matricula)) {
                    if (taller[i].isOberta()) {
                        System.out.print("Oberta: ");
                    } else {
                        System.out.print("Tancada:( " + taller[i].getHores() + " hores):");
                    }
                    System.out.print("id: " + i + "   ");
                    System.out.println(taller[i].getMatricula());
                    trobada = true;
                }
            }
        }
        if (!trobada) {
            System.out.println("No hi ha cap incidència d'aquest vehicle");
            
        } 

    }    
    
    public static int seleccionaIncidencia(vehicles[] stock, incidencies[] taller) {
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        System.out.println("Intro la matrícula del vehicle..");
        String matricula = in.nextLine();
        while (!existeixVehicle(stock, matricula)) {
            System.out.println("Aquest vehicle no existeix.");
            System.out.println("Intro la matrícula del vehicle..");
            matricula = in.nextLine();
        }
        // Mostrem totes les incidències del vehicle i els seu estat
        boolean trobada = false;
        for (int i = 0; i < taller.length; i++) {
            if (taller[i] != null) {
                if (taller[i].getMatricula().equals(matricula)) {
                    if (taller[i].isOberta()) {
                        System.out.print("Oberta: ");
                    } else {
                        System.out.print("Tancada:( " + taller[i].getHores() + " hores):");
                    }
                    System.out.print("id: " + i + "   ");
                    System.out.println(taller[i].getMatricula());
                    trobada = true;
                }
            }
        }
        if (!trobada) {
            System.out.println("No hi ha cap incidència d'aquest vehicle");
            return -1;
        } else {
            System.out.println("Quina incidència vols modificar? ( Id)");
            return inNum.nextInt();
        }

    }

    public static void ModificaIncidencia(vehicles[] stock, incidencies[] taller) {
        // Mostrarem totes les incidències del vehicle escollit i haurem de decidir quina volem modificar
        // Despŕes hurem de poder modificar qualsevol de les informacions excepte la matrícula
        Scanner in = new Scanner(System.in);
        int id = seleccionaIncidencia(stock, taller);
        if (id == -1) {
            System.out.println("No hi ha vehicle");
        } else {
            taller[id].toString();
            System.out.println("Quina informació vols modificar ?");
            String info = in.nextLine();
            switch (info) {
                case "avaria":
                    taller[id].setAvaria(info);
                    break;
                case "oberta":
                    System.out.println("Vols canviar d'estat");
                    if (taller[id].isOberta()) {
                        taller[id].setOberta(false);
                    } else {
                        taller[id].setOberta(true);
                    }
                    break;
                default:
                    System.out.println("No pots modificar aquesta informació");
            }
            System.out.println("la informació s'ha modificat");
            taller[id].toString();
        }
    }

    public static void tancaIncidencia(vehicles[] stock, incidencies[] taller) {
        // Tancarem incidència: Recordem que és imprescindible posar les hores. Ja ho tenim a la classe
        int id = seleccionaIncidencia(stock, taller);
        if (id == -1) {
            System.out.println("No hi ha vehicle");
        } else {
            taller[id].toString();
            System.out.println("Tanquem la incidència");
            taller[id].setOberta(false);
        }
    }

    public static void EsborraIncidencia(vehicles[] stock, incidencies[] taller) {
        // Esborrarem una incidència
        int id = seleccionaIncidencia(stock, taller);
        if (id == -1) {
            System.out.println("No hi ha vehicle");
        } else {
            taller[id].toString();
            System.out.println("Esborrem la incidència");
            taller[id] = null;
        }
    }

    public static void esborraTotesIncidencies(incidencies[] taller, String matricula) {
        for (int i = 0; i < taller.length; i++) {
            if (taller[i] != null) {
                if (taller[i].getMatricula().equals(matricula)) {
                    taller[i] = null;
                }
            }
        }
    }
}
