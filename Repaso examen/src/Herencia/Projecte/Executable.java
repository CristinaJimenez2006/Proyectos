package Herencia.Projecte;

import java.util.Scanner;
import static Herencia.Projecte.Incidencia.*; 
/**
 *
 * @author crist
 */
public class Executable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        vehicles[] vehicle = new vehicles[10];
        emplena(vehicle);
        incidencies [] incidencia = new incidencies[10]; 
        menu(in, str, vehicle,incidencia);
        
    }

    public static void emplena(vehicles[] vehicle) {
        electrics electric0 = new electrics(130, 40, -9, 60, "1", "Ferrari", "Negro");
        combustio combustio1 = new combustio(20, "diesel", 80, 300, "2", "Lamborgini", "Azul");
        electrics electric2 = new electrics(150, 20, -7, 70, "3", "Mini", "Rojo");
        vehicle[0] = electric0;
        vehicle[1] = combustio1;
        vehicle[2] = electric2;
    }

    public static void menu(Scanner in, Scanner str, vehicles[] vehicle, incidencies[]incidencia) {
        int opcio = 0;
        while (opcio != 10) {
            System.out.println("Escull una opció");
            System.out.println("Menú:");
            System.out.println("1. Alta vehicle.");
            System.out.println("2. Generar el permís de circulació d’un vehicle.");
            System.out.println("3. Generació de l'informe d'emissions zero.");
            System.out.println("4. Genera tots els permisos de circulació.");
            System.out.println("5. Mostra tots els vehicles.");
            System.out.println("6. Venda de vehicles.");
            System.out.println("7. Visualitzar l'estat del vehicle (baixa o alta).");
            System.out.println("8. Canviar d'unitats.");
            System.out.println("9. Incidència.");
            System.out.println("10. Sortir.");
            opcio = in.nextInt();
            switch (opcio) {
                case 1:
                    altaVehicles(vehicle, in, str);
                    break;
                case 2:
                    permisCirculacio(vehicle, str);
                    break;
                case 3:
                    informeEmissions(vehicle, str);
                    break;
                case 4:
                    generaTotspermisosCirculacio(vehicle, str);
                    break;
                case 5:
                    mostraTotsVehicles(vehicle);
                    break;
                case 6:
                    vendaVehicles(vehicle, str);
                    break;
                case 7:
                    vehicleEstat(vehicle, str);
                    break;
                case 8:
                    canviarUnitats(vehicle, str);
                    break;
                 case 9:
                    menu2(in,str,vehicle, incidencia); 
                    break;
                case 10:
                    System.out.println("S'ha sortir del programa."); 
                    break;
                default:
                    System.out.println("Opció no vàlida. Introdueix un altre número.");
                    break;
            }
        }
    }

    public static void altaVehicles(vehicles[] vehicle, Scanner in, Scanner str) {
        int opcio = 0;
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] == null) {
                while (opcio != 3) {
                    System.out.println("Quin tipus de vehicle vols ingressar? Escull una opció.");
                    System.out.println("> Elèctrics (1)");
                    System.out.println("> Combustió (2)");
                    System.out.println("> Sortir (3)");
                    opcio = in.nextInt();

                    if (opcio == 1) {
                        System.out.println("Introdueix la matrícula del vehicle");
                        String matricula = str.nextLine();
                        System.out.println("Introdueix el model del vehicle");
                        String model = str.nextLine();
                        System.out.println("Introdueix el color del vehicle");
                        String color = str.nextLine();
                        System.out.println("Introdueix la capacitat de bateria del vehicle");
                        double capacitatBateria = in.nextDouble();
                        System.out.println("Introdueix el consum elèctric del vehicle");
                        double consumElectric = in.nextDouble();
                        System.out.println("Introdueix l'autonomia del vehicle");
                        double autonomia = in.nextDouble();
                        System.out.println("Introdueix la potencia de carrega del vehicle");
                        double potenciaCarrega = in.nextDouble();

                        electrics electric = new electrics(capacitatBateria, consumElectric, autonomia, potenciaCarrega, matricula, model, color);
                        vehicle[i] = electric;
                        System.out.println(vehicle[i].toString());

                    } else if (opcio == 2) {
                        System.out.println("Introdueix la matrícula del vehicle");
                        String matricula = str.nextLine();
                        System.out.println("Introdueix el model del vehicle");
                        String model = str.nextLine();
                        System.out.println("Introdueix el color del vehicle");
                        String color = str.nextLine();
                        System.out.println("Introdueix la cilindrada del vehicle");
                        int cilindrada = in.nextInt();
                        System.out.println("Introdueix el tipus de motor del vehicle");
                        String tipusMotor = str.nextLine();
                        System.out.println("Introdueix el consum de combustible del vehicle");
                        double consumCombustible = in.nextDouble();
                        System.out.println("Introdueix la potencia del vehicle");
                        double potencia = in.nextDouble();

                        combustio combustio = new combustio(cilindrada, tipusMotor, consumCombustible, potencia, matricula, model, color);
                        vehicle[i] = combustio;
                        System.out.println(vehicle[i].toString());

                    } else if (opcio == 3) {
                        System.out.println("Has sortit del programa.");
                    } else {
                        System.out.println("Opció no vàlida. Introdueix un altre valor.");
                    }
                }
            }
            mostraTotsVehicles(vehicle);
        }
    }

    public static vehicles cercarMatricula(vehicles[] vehicle, Scanner str) {
        System.out.println("Introdueix el número de matrícula");
        String matricula = str.nextLine();
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null) {
                if (vehicle[i].getMatricula().toLowerCase().equals(matricula.toLowerCase())) {
                    return vehicle[i];
                }
            }
        }
        return null;
    }

    public static void permisCirculacio(vehicles[] vehicle, Scanner str) {
        vehicles vehicleTrobat = cercarMatricula(vehicle, str);
        if (vehicleTrobat != null) {
            System.out.println("La matrícula del vehicle és " + vehicleTrobat.getMatricula() + ".");
            System.out.println("El model del vehicle és " + vehicleTrobat.getModel() + ".");
        } else {
            System.out.println("No s'ha trobat cap vehicle amb aquesta matrícula.");
        }

    }

    public static void informeEmissions(vehicles[] vehicle, Scanner str) {
        vehicles vehicleTrobat = cercarMatricula(vehicle, str);
        if (vehicleTrobat != null) {
            if (vehicleTrobat instanceof electrics) {
                System.out.println("S'ha generat amb éxit l'informe d'emissions zero.");
            } else {
                System.out.println("No s'ha pogut generar l'informe d'emissions zero. El cotxe no és elèctric, sinó de combustió.");
            }
        }
    }

    public static void generaTotspermisosCirculacio(vehicles[] vehicle, Scanner str) {
        vehicles vehicleTrobat = cercarMatricula(vehicle, str);
        if (vehicleTrobat != null) {
            System.out.println("S'ha generat amb èxit el permís de circulació.");
            if (vehicleTrobat instanceof electrics) {
//              electrics electric=(electrics)vehicleTrobat; Passo de la classe vehicles (pare) a la classe elèctrics (fill). 
                System.out.println("La potència de càrrega és de " + (((electrics) vehicleTrobat).getPotenciaCarrega()));
            } else if (vehicleTrobat instanceof combustio) {
                System.out.println("La cilindrada és de " + (((combustio) vehicleTrobat).getCilindrada()));
            } else {
                System.out.println("Error.");
            }
        }
    }

    public static void mostraTotsVehicles(vehicles[] vehicle) {
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null) {
                System.out.println("Posició " + i);
                System.out.println("Part bàsica: " + vehicle[i].getMatricula() + ", " + vehicle[i].getModel() + ", " + vehicle[i].getColor() + "," + vehicle[i].isActivat() + ".");
                if (vehicle[i] instanceof electrics) {
                    System.out.println("Part extra: >> Tipus: " + ((electrics) vehicle[i]).toString() + ".");
                } else {
                    System.out.println("Part extra: >> Tipus: " + ((combustio) vehicle[i]).toString() + ".");
                }
            }
        }

    }

    public static void vendaVehicles(vehicles[] vehicle, Scanner str) {
        vehicles vehicleTrobat = cercarMatricula(vehicle, str);
        if (vehicleTrobat != null) {
            vehicleTrobat.setActivat(false);
            System.out.println("Part bàsica: " + vehicleTrobat.getMatricula() + ", " + vehicleTrobat.getModel() + ", " + vehicleTrobat.getColor() + "," + vehicleTrobat.isActivat());
            if (vehicleTrobat instanceof electrics) {
                System.out.println("Part extra: >> Tipus: " + ((electrics) vehicleTrobat).toString() + ".");
            } else if (vehicleTrobat instanceof combustio) {
                System.out.println("Part extra: >> Tipus: " + ((combustio) vehicleTrobat).toString() + ".");
            }

        } else {
            System.out.println("Error.");
        }

    }

    public static void vehicleEstat(vehicles[] vehicle, Scanner str) {
        boolean sortit = false;
        while (!sortit) {
            System.out.println("Vols veure vehicles d'alta (a) o de baixa (b)?");
            String lletra = str.nextLine();
            if (lletra.toLowerCase().equals("a")) {
                System.out.println("Vehicles d'alta:");
                for (int i = 0; i < vehicle.length; i++) {
                    if (vehicle[i] != null) {
                        if (vehicle[i].isActivat()) {
                            System.out.println("Posició " + i);
                            System.out.println("Part bàsica: " + vehicle[i].getMatricula() + ", " + vehicle[i].getModel() + ", " + vehicle[i].getColor() + ".");
                            if (vehicle[i] instanceof electrics) {
                                System.out.println("Part extra: >> Tipus: " + ((electrics) vehicle[i]).toString() + ".");
                            } else {
                                System.out.println("Part extra: >> Tipus: " + ((combustio) vehicle[i]).toString() + ".");
                            }
                        }
                    }
                }
                sortit = true;
            } else if (lletra.toLowerCase().equals("b")) {
                System.out.println("Vehicles de baixa:");
                for (int i = 0; i < vehicle.length; i++) {
                    if (vehicle[i] != null) {
                        if (!vehicle[i].isActivat()) {
                            System.out.println("Posició " + i);
                            System.out.println("Part bàsica: " + vehicle[i].getMatricula() + ", " + vehicle[i].getModel() + ", " + vehicle[i].getColor() + ".");
                            if (vehicle[i] instanceof electrics) {
                                System.out.println("Part extra: >> Tipus: " + ((electrics) vehicle[i]).toString() + ".");
                            } else {
                                System.out.println("Part extra: >> Tipus: " + ((combustio) vehicle[i]).toString() + ".");
                            }
                        }
                    }

                }
                sortit = true;
            } else {
                System.out.println("Error. Escull una opció: a o b");
            }

        }
    }

    public static void canviarUnitats(vehicles[] vehicle, Scanner str) {
        boolean sortir = false;
        while (!sortir) {
            System.out.println("Vols canviar d'unitats a W (w) o a MW (m)?");
            String lletra = str.nextLine();
            if ((lletra == "w") || (lletra == "m")){
                for (int i = 0; i < vehicle.length; i++) {
                    if (vehicle[i] != null) {
                        if (vehicle[i] instanceof electrics) {
                            ((electrics) vehicle[i]).canviarUnitat(lletra);
                        }
                    }
                }
                sortir=true; 
            } else {
                System.out.println("Lletra incorrecta. Escull una opcio w o m.");
            }
        }
    }
    
    public static void emplenaIncidencia(Scanner in,incidencies[]incidencia){
       incidencia[0]= new incidencies("1","No arrenca.",4);
       incidencia[1]= new incidencies("2","S'ha trencat el motor.",5);
       incidencia[2]=new incidencies("3","S'han punxat les rodes.",6); 
   }
}
