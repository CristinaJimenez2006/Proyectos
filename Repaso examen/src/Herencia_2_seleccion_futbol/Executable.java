package Herencia_2_seleccion_futbol;

/**
 *
 * @author crist
 */
public class Executable {

    public static void main(String[] args) {
        SeleccionFutbol[] integrantes = new SeleccionFutbol[3];

        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes[0] = delBosque;
        integrantes[1] = iniesta;
        integrantes[2] = raulMartinez;

        //CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentración. (Tidis ejecutan el mismo método)");
        for (int i = 0; i < integrantes.length; i++) {
            System.out.println(integrantes[i].getNombre() + " " + integrantes[i].getApellidos() + " -> ");
            SeleccionFutbol integrante = integrantes[i];
            integrante.concentrarse();
        }

        //VIAJE 
        System.out.println("\nTodos los integarntes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (int i = 0; i < integrantes.length; i++) {
            System.out.println(integrantes[i].getNombre() + " " + integrantes[i].getApellidos() + " -> ");
            SeleccionFutbol integrante = integrantes[i];
            integrante.viajar();
        }

        //ENTRENAMIENRO
        System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (int i = 0; i < integrantes.length; i++) {
            System.out.println(integrantes[i].getNombre() + " " + integrantes[i].getApellidos() + " -> ");
            SeleccionFutbol integrante = integrantes[i];
            integrante.entrenamiento();
        }

        //PARTIDO DE FUTBOL
        System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
        for (int i = 0; i < integrantes.length; i++) {
            System.out.println(integrantes[i].getNombre() + " " + integrantes[i].getApellidos() + " -> ");
            SeleccionFutbol integrante = integrantes[i];
            integrante.partidoFutbol();
        }

        //PLANIFICAR ENTRENAMIENTO
        System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene ek método para planificar un entrenamiento: ");
        System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).planificarEntrenamiento();

        //ENTREVISTA
        System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista: ");
        System.out.println(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        ((Futbolista) iniesta).entrevista();

        //MASAJE
        System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje: ");
        System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();

    }
}
