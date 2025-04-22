package Modularitat;

/**
 *
 * @author crist
 */
public class Matriz {

    public static void main(String[] args) {
        int[] array = new int[10];
        rellena(array); 
        multiplicar(array); 
    }
    public static void rellena (int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)((Math.random()*10)+1); 
        }
    }
    public static void multiplicar (int[] array){
      
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                if(array[i]%2==0){
                    array[i]=array[i]*2; 
                }else if (array[i]%3==0){
                    array[i]=array[i]*3;  
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            System.out.print(array[i]+"|");
        }
    }
}
