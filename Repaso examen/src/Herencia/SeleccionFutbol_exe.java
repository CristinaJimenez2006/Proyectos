package Herencia;

/**
 *
 * @author crist
 */
public class SeleccionFutbol_exe {

    public static void main(String[] args) {
        SeleccionFutbol[] integrantes = new SeleccionFutbol[3];
        Entrenador entrenador1 = new Entrenador ("284EZ89",1,"Vicente","Del Bosque",60); 
        Futbolista futbolista1=new Futbolista(6,"Interior Derecho",2,"Andres","Iniesta",29);
        Masajista masajista1=new Masajista ("Licenciado en Fisioterapia",18,3,"Raúl","Martínez",41); 
    
        integrantes [0]=entrenador1; 
        integrantes [1]=futbolista1; 
        integrantes [2]=masajista1;
        
        //Concentracion
        System.out.println("Todos los integrantes comienzan una concentración.");
        for (int i = 0; i < integrantes.length; i++) {
            System.out.println(integrantes[i].getNombre()+""+integrantes[i].getApellidos()+""); 
            
           //Un void nunca puede ir dentro de un sout
            integrantes[i].Concentrase();
        }
        
        //Viaje
        System.out.println("\nTodos los integrantes viajan para jugar un partido.");
        for (int i = 0; i < integrantes.length; i++) {
            System.out.println(integrantes[i].getNombre()+""+integrantes[i].getApellidos()+"");
            integrantes[i].Viajar();
        }
        
        //Entrenamiento
        System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista");
        for (int i = 0; i < integrantes.length; i++) {
        System.out.println(entrenador1.getNombre()+""+entrenador1.getApellidos()+" -->");
        entrenador1.DirigirEntreno();
        System.out.println(futbolista1.getNombre()+""+futbolista1.getApellidos()+" -->");
        masajista1.DarMasaje();
        
        //Masaje
        System.out.println("\n Masaje: Solo el masajista tiene el mètodo oara dar un masaje.");
        System.out.println(masajista1.getNombre()+""+masajista1.getApellidos());
        masajista1.DarMasaje();
        
        //Partido de futbol
        System.out.println("\nPartdio de Futbol: Solamente el entrenador y el futbolista.");
        System.out.println(entrenador1.getNombre()+""+entrenador1.getApellidos()+" -->");
        entrenador1.DirigirPartido();
        System.out.println(futbolista1.getNombre()+""+futbolista1.getApellidos()+" -->");
        futbolista1.JugarPartido(); 
        
        //Prueba
         for (int j = 0; j < integrantes.length; j++) {
                if(integrantes[j] instanceof Entrenador){
                  integrantes[j].DirigirEntreno();
                }
            }
        }
    }
}
