package Ejercicios;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int f = 5;
        int g = 12;
        int h = 9;

        if (g>h){
           if (g>f) {
               System.out.print( "el numero más grande es" + g);
               } else {
               System.out.print( "el numero más grande es" + f);
           }
        } else {
            if (h>f){
                System.out.print( "el numero más grande es" + h);
            } else {
                System.out.print( "el numero más grande es" + f);
            }
        }
    }
}
