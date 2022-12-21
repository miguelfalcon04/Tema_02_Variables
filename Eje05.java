/* Ejercicio 5
Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pesetas que va a pasar a euros: ");
        int pesetas = sc.nextInt();

        System.out.println(pesetas+" pesetas son "+pesetas/166+" en euros");

        sc.close();
    }
}
