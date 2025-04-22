package Modularitat;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class personaExe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Persona[] personas = new Persona[5];
        exemples (personas); 
        boolean check = true;

        while (check) {
            int opcio = menu(in);
            switch (opcio) {
                case 1:
                    mostrar(personas);
                    break;
                case 2:
                    pesopromedio(personas);
                    break;
                case 3:
                    orden (personas);
                    break;
                case 4:
                    System.out.println("S'ha sortit del programa.");
                    check=false;
                    break;
                default:
                    System.out.println("L'opció és incorrecta.");
                    break;
            }

        }

    }

    public static void exemples(Persona[] personas) {
        personas[0]= new Persona(32, 35.7,38 );
        personas[1]= new Persona(83, 39.2,40 );
        personas[2]= new Persona(79, 40.5,92 );
        personas[3]= new Persona(14, 89.1,17 );
        personas[4]= new Persona(9, 78.6,23);
         
    }
    
    public static void orden (Persona []personas){
        Persona temp; 
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas.length-1-i; j++) {
                if(personas[j].getEdad()> personas[j+1].getEdad()){
                    temp=personas[j]; 
                    personas[j]=personas[j+1]; 
                    personas[j+1]=temp; 
                }
            }
        }
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
    
    public static void pesopromedio(Persona[] personas){
        double suma=0; 
        for (int i = 0; i < personas.length; i++) {
            if(personas[i]!=null){
                suma+=personas[i].getPeso(); 
            }
        }
        System.out.printf("El pes promig dels individus és %.2f%n.", (suma/personas.length));
    }
    
    public static void mostrar (Persona []personas){
        int jove=0, gran=0,personaj=0, personag=0; 
        for (int i = 0; i < personas.length; i++) {
            if (personas[i]!=null) {
                if(i==0){
                    jove=personas[i].getEdad();
                    personaj=i; 
                    gran=personas[i].getEdad();
                    personag=i; 
                }else{
                    if(jove>personas[i].getEdad()){ 
                        jove=personas[i].getEdad();
                        personaj=i; 
                    }else if(gran<personas[i].getEdad()){
                        gran=personas[i].getEdad(); 
                        personag=i; 
                    }
                }
            }
        }
        jove=personas[personaj].getIdentificador();
        gran = personas[personag].getIdentificador(); 
        System.out.println("La persona jove és la número "+personaj+" amb l'identificador " +jove+", i la persona gran és la número "+personag+", amb l'identificador "+gran);
    }

    public static int menu(Scanner in) {
        System.out.println("Escull una opció...");
        System.out.println("Menú:");
        System.out.println("1. Mostrar identificador de la persona més jove i de la persona més vella");
        System.out.println("2. Mostrar el pes promig dels individus.");
        System.out.println("3. Mostrar el vector ordenats per edat.");
        System.out.println("4. Sortir del programa. ");
        int opcio = in.nextInt();
        return opcio;
    }
}
