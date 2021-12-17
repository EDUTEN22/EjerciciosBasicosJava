package ejerciciosjava;

/**
 *
 * @author Eduardo Rodríguez Arribas
 */
public class EjerciciosJava {

    /**
     *
     * @param numBellotas
     * @param finDeSemana
     * @return
     */
    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana) {
//si es fin de semana da igual cuantas bellotas haya
        if (finDeSemana) {
            return true;

        } else if (40 <= numBellotas && numBellotas <= 60) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param velocidad valores entre 60 y 80
     * @param birthday indica si es tu cumpleaños
     * @return se devuelve un valor 0 1 o 2 dependiendo de la velocidad y si es
     * tu cumpleaños o no
     */
    public int multa(int velocidad, boolean birthday) {
        if (birthday) {
            //velocidad = velocidad -5;
            velocidad -= 5;
        }
        if (velocidad <= 60) {//si va a menos de 60, no hay multa
            return 0;
        }
        if (60 < velocidad && velocidad <= 80) {
            return 1; //multa pequeña
        }
        return 2;
    }

    /**
     *
     * @param n
     * @return
     */
    public boolean muyVanidoso(int n) {
        if (n % 11 <2) {
            return true;
        }
        return false;
    }

    public boolean contesta(boolean matinal, boolean madre, boolean dormido) {
        if (matinal && madre && !dormido) {
            return true;
        } else if (dormido) {
            return false;
        } else if (!matinal && !madre && !dormido) {
            return true;
        }
    return false;
    }
            
    public boolean menorPor10 (int a, int b, int c){
    if(Math.abs(a-b) >= 10 || Math.abs(a-c) >=10 || Math.abs (b-c) >=10){
        return true;
    }
    return false;
    
    }        
    
            
            
            
            
            
            
            
            
            
    

    public static void main(String[] args) {
        EjerciciosJava ejercicios = new EjerciciosJava();
//Test del primer ejercicio
        System.out.println("Ejercicio 01: ARDILLAS");
        System.out.println("30, false: " + ejercicios.fiestaArdillas(30, false));
        System.out.println("50, false: " + ejercicios.fiestaArdillas(50, false));
        System.out.println("70, true: " + ejercicios.fiestaArdillas(70, true));

        //Test del segundo ejercicio
        System.out.println("Ejercicio 02: MULTAS");
        System.out.println("60, false: " + ejercicios.multa(60, false));
        System.out.println("65, false: " + ejercicios.multa(65, false));
        System.out.println("65, true: " + ejercicios.multa(65, true));

        //Test del tercer ejercicio
        System.out.println("Ejercicio 02: MUY VANIDOSO ");
        System.out.println("22: " + ejercicios.muyVanidoso(22));
        System.out.println("23: " + ejercicios.muyVanidoso(23));
        System.out.println("24: " + ejercicios.muyVanidoso(24));

        //Test del cuarto ejercicio
        System.out.println("Ejercicio 02: MUY VANIDOSO ");
        System.out.println("false,false,false: " + ejercicios.contesta(false, false, false));
        System.out.println("false,false,true: " + ejercicios.contesta(false, false, true));
        System.out.println("true,false,false: " + ejercicios.contesta(true, false, false));
        
        //Test del quinto ejercicio
        System.out.println("Ejercicio 02: MENOR POR 10 ");
        System.out.println("1,7,11: " + ejercicios.menorPor10(1, 7, 11));
        System.out.println("1,7,10: " + ejercicios.menorPor10(1, 7, 10));
        System.out.println("11,1,7: " + ejercicios.menorPor10(11, 1, 7));
        
        //Test del sexto ejercicio
        System.out.println("Ejercicio 02: MENOR POR 10 ");
        System.out.println("1,7,11: " + ejercicios.menorPor10(1, 7, 11));
        System.out.println("1,7,10: " + ejercicios.menorPor10(1, 7, 10));
        System.out.println("11,1,7: " + ejercicios.menorPor10(11, 1, 7));
        
        //Test del septimo ejercicio
        System.out.println("Ejercicio 02: MENOR POR 10 ");
        System.out.println("1,7,11: " + ejercicios.menorPor10(1, 7, 11));
        System.out.println("1,7,10: " + ejercicios.menorPor10(1, 7, 10));
        System.out.println("11,1,7: " + ejercicios.menorPor10(11, 1, 7));
    }

}
