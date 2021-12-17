package ejerciciosjava;

/**
 *
 * @author Eduardo Rodríguez Arribas
 */
public class EjerciciosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana) {
//si es fin de semana da igual cuantas bellotas haya
        if (finDeSemana) {
            return true;

        }
        if (40 <= numBellotas && numBellotas <= 60) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        EjerciciosJava ejercicios = new EjerciciosJava();
System.out.println("Ejercicio 01: ARDILLAS");
        System.out.println("30, false: " + ejercicios.fiestaArdillas(30, false));
        System.out.println("50, false: " + ejercicios.fiestaArdillas(50, false));
        System.out.println("70, true: " + ejercicios.fiestaArdillas(70, true));

    }

}
