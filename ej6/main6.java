/*Haz una clase llamada Password que tenga los atributos 
longitud y contraseña . Por defecto, la longitud será de 8. Los constructores 
serán los siguiente:
 Un constructor por defecto que tendrá como contraseña "password".
 Un constructor con la longitud que nosotros le pasemos. Generará una 
contraseña aleatoria con esa longitud.
Los métodos de esta clase serán:
 esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe 
tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.
 generarPassword(): genera la contraseña del objeto con la longitud que 
tenga.
 Método get para contraseña y longitud.
 Método set para longitud.
Ahora, crea una clase clase ejecutable:
 Cree un array de Passwords con el tamaño que tú le indiques por teclado.
Algoritmos y Estructuras de Datos Página 54 de 56
 Cree un bucle que cree un objeto para cada posición del array. Indica por 
teclado la longitud de cada password.
 Crea otro array de booleanos donde se almacene si el password del array de 
Password es o no fuerte (usa el bucle anterior).
 Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa 
este simple formato:
contraseña1 valor_booleano1
contraseña2 valor_bololeano2 */

package ej6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class main6 {

    public static void main(String[] args) {
        ArrayList<password> passwords = new ArrayList<>();
        ArrayList<Boolean> esFuerte = new ArrayList<>();

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Numero de contraseñas que desea crear:");
            int numeropasswords = 0;
            numeropasswords = Integer.parseInt(leer.readLine());
            for (int i = 0; i < numeropasswords; i++) {
                System.out.println("Introduce la longitud de la contraseña " + (i + 1) + ":");
                int longitud = Integer.parseInt(leer.readLine());
                password pass = new password(longitud);
                passwords.add(pass);
                esFuerte.add(pass.esFuerte());
                System.out.println("Contraseña " + (i + 1) + ": " + pass.getContraseña() + " " + esFuerte.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   


    
}
