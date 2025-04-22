package repaso.examen.Bucle3;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class prova {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix una cadena...");
        String cadena = in.nextLine();
//        String [] puntosquitar = cadena.split("\\.");
//        cadena = ""; 
//        int j=0;
        String ced = "";
        String codigo = "TRWAGMYFPDXBNJZSQVHLCKE";

//        for (int i = 0; i < puntosquitar.length; i++) {
//             System.out.print(puntosquitar[i]);
//             cadena = ""+puntosquitar[i];  
//        }
//        
//           if(cadena.length()==8){
//                 int numeros = Integer.parseInt(cadena);
//                 j=numeros%23;
//                 cadena=""+codigo.charAt(j);
//                 System.out.println(cadena); 
//             }else{
//                 System.out.println("Error");
//             
//        }
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != '.') {
                ced += cadena.charAt(i);

            }

        }
        System.out.println(ced);
    }
}
