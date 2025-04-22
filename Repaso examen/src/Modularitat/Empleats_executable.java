package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Empleats_executable {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Empleats[] empleats = new Empleats[12];

        //crear una casilla siempre para no olvidarse de comprobar que no sea nula. 
        ejemplosempleados(empleats);

        Departamento[] departamentos = new Departamento[4];

        ejemplosdepartamentos(departamentos);

       int valor = menu(in);
       boolean check=true; 
       
        while (check) {
            if (valor == 1) {
                mostrar(str, empleats, departamentos, in);
            } else if (valor == 2) {
                añadir(str, empleats, in);
            } else if (valor == 3) {
                System.out.println("Ha finalitzat el programa");
                check=false;
            } else {
                System.out.println("Error");
                System.out.println("---------------");
                valor = menu(in);
            }
        }

    }

    public static int menu(Scanner in) {
        System.out.println("Menú");
        System.out.println("1. Mostrar empleats, del departament i salari");
        System.out.println("2.Afegir empleat");
        System.out.println("3.Sortir");
        System.out.println("Escull una opció..");
        int valor = in.nextInt();
        return valor;

    }

    public static void ejemplosempleados(Empleats[] empleats) {
        empleats[0] = new Empleats("Cristina", 18, "653052734", "salut");
        empleats[1] = new Empleats("Carla", 23, "653067784", "tecnologia");
        empleats[2] = new Empleats("Roberto", 35, "663052964", "administración");
        empleats[3] = new Empleats("Alberto", 37, "673052798", "sostenebilidad");
        empleats[4] = new Empleats("Raúl", 46, "652052836", "salut");
        empleats[5] = new Empleats("Sofía", 58, "643052734", "salut");
        empleats[6] = new Empleats("Marta", 44, "633052333", "tecnologia");
        empleats[7] = new Empleats("Rosa", 55, "657052734", "administración");
        empleats[8] = new Empleats("Quim", 51, "654052734", "administración");
        empleats[9] = new Empleats("Darren", 21, "659092934", "sostenebilidad");
    }

    public static void ejemplosdepartamentos(Departamento[] departamentos) {
        departamentos[0] = new Departamento(2300, 38, "salut");
        departamentos[1] = new Departamento(1300, 36, "administración");
        departamentos[2] = new Departamento(1900, 32, "tecnologia");
        departamentos[3] = new Departamento(1500, 40, "sostenibilidad");
    }

    public static void comprobardepartamento(Departamento[] departamentos,String departamento ) {
            for (int i = 0; i < departamentos.length; i++) {
            if(departamentos[i]!=null){
                if(departamentos[i].getDepartaemnto().equals(departamento)){
                    int valor=i; 
                    return valor; 
                }
            }
        }
            System.out.println("");
            return -1; 
    }

    public static void mostrar(Scanner str, Empleats[] empleats, Departamento[] departamentos, Scanner in) {
        System.out.println("Introdueix un departament...");
        String departamento = str.nextLine();
        departamento = departamento.toLowerCase();
        double sumasalari = 0, sumahoras = 0;
        for (int j = 0; j < departamentos.length; j++) {
            if (departamento.equals(departamentos[j].getDepartaemnto())) {
                for (int i = 0; i < empleats.length; i++) {
                    if (empleats[i] != null) {
                        if (departamentos[j].getDepartaemnto().equals(empleats[i].getDepartamento())) {
                            sumasalari += departamentos[j].getSalari();
                            sumahoras += departamentos[j].getHores();
                        }
                    }

                }
                System.out.println("Salari: " + sumasalari + " , Horas: " + sumahoras);

            } else {
                System.out.println("Error");
            }
        }
    }

    public static void añadir(Scanner str, Empleats[] empleats, Scanner in, Departamento[] departamentos) {

        boolean check = false;
        for (int i = 0; i < empleats.length; i++) {
            if ((empleats[i] == null) //&& (check)
                    ) {
                Empleats empleat = new Empleats();
                empleats[i] = empleat;
                //crear empleado antes de rellenar los atributos. 
                System.out.println("Introdueix el nom");
                empleats[i].setNombre(str.nextLine());
                System.out.println("Introdueix la edad");
                empleats[i].setEdad(in.nextInt());
                System.out.println("Introdueix el telefon");
                empleats[i].setTelefono(str.nextLine());
                System.out.println("Introdueix el departament");
                empleats[i].setDepartamento(str.nextLine());
                String departamento= empleats[i].getDepartamento(); 
                comprobardepartamento(departamentos, departamento); 
                i = empleats.length; //NO HACE FALTA PONER LO DEMÁS SI PONGO ESO

            }
//            System.out.println("Vols continuar, si o no?");
//            String resposta = in.nextLine();
//            resposta = resposta.toLowerCase();
//            if (resposta.equals("si")) {
//                check = true;
//            } else {
//                i = empleats.length;
//            }

        }
        //departaments[treballadors[i].getDepartament()].getNom; --> trec el nom en l'array d'objectes de departament no del trebalaldor, la posició ka treure del treballador (departament=3 en el del porfe); 
    }
}
