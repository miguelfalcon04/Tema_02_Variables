/* Ejercicio 1
Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.

@author miguelfalcon
*/


public class Eje01{
    public static void main(String[] args) {

        int x = 144;
        int y = 999;

        System.out.printf("%15s %d\n","y:",y);
        System.out.printf("%15s %d\n","x:",x);
        System.out.printf("%15s %d\n","suma:",(x+y));
        System.out.printf("%15s %d\n","resta:",(x-y));
        System.out.printf("%15s %d\n","división:",(y/x));
        System.out.printf("%15s %d\n","multiplicación:",(x*y));

    }
}