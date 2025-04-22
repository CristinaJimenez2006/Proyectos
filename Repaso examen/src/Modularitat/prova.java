package Modularitat;

/**
 *
 * @author crist
 */
public class prova {
    public static void main (String[]args){
        String alfabeto="abcdefghijklmnopqrstuvwxyz"; 
        char [] letras = new char[alfabeto.length()];
        char letra; 
        boolean check = false; 
        
        for (int i = 0; i < letras.length; i++) {
            letra = alfabeto.charAt(((int)(Math.random()*alfabeto.length())));
            for (int j = 0; j <= i; j++) {
                if(letras[j]==letra){
                    check=true; 
                }
            }
            if(check){
                letras[i]=letra; 
            }else{
                i--; 
            }
            }
        }
    }

