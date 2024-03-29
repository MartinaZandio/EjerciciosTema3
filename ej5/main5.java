package ej5;
/*Haz una clase llamada Persona con atributos: nombre, edad, DNI, sexo (usa una enumeración), peso y altura. 
Crea métodos para acceder y modificar todos los atributos.
Por defecto, todos los atributos menos el DNI tendrán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo será mujer por defecto.
La clase deberá tener los siguientes constructores constructores:
Un constructor por defecto.Un constructor con el nombre, edad y sexo, el resto por defecto.Un constructor con todos los atributos como parámetro, menos el DNI.
La clase deberá tener los siguientes métodos:
- calcularIMC(): calcula el índice de masa corporal de la persona (peso en kg/(altura^2 en m))
- valorarPesoCorporal() devuelve un -1 si está por debajo de su peso ideal, un 0 si está en su peso ideal y un 1 si tiene sobrepeso. 
Sobrepeso se define como IMC > 25 y se considera que se está por debajo del peso ideal si IMC <18.
- esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
- toString(): devuelve toda la información de la persona como una cadena de caracteres.
- generaDNI(): genera un número aleatorio de 8 cifras que será el DNI de la persona. Este método no será visible desde el exterior. 
Este método deberá invocarse desde cualquier constructor para generar el DNI.
- Métodos set de cada parámetro, excepto de DNI.
Algoritmos y Estructuras de Datos Página 53 de 56
Ahora, crea una clase ejecutable que haga lo siguiente:
- Pide por teclado el nombre, la edad, sexo, peso y altura.
- Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá 
todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
- Para cada objeto, se deberá comprobar si está en su peso ideal, tiene 
sobrepeso o por debajo de su peso ideal con un mensaje.
- Indicar para cada objeto si es mayor de edad.
- Por último, mostrar la información de cada objeto. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main5{
    public static void main(String[] args) {

        String nombre = ""; 
        int edad = 0; 
        genero sexo = genero.mujer; 
        float peso = 0; 
        float altura = 0;
        String DNI = ""; 

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce el nombre de la persona:\n ");
            nombre = leer.readLine();
            System.out.println("Introduce la edad de la persona:\n ");
            edad = Integer.parseInt(leer.readLine());
            System.out.println("Introduce el sexo de la persona (hombre/mujer):\n ");
            sexo = genero.valueOf(leer.readLine());
            System.out.println("Introduce el peso de la persona:\n ");
            peso = Float.parseFloat(leer.readLine());
            System.out.println("Introduce la altura de la persona:\n ");
            altura = Float.parseFloat(leer.readLine());
        } catch (IOException e) {
            System.out.println("error" + e);
        }
        
        persona persona1 = new persona(nombre, edad, sexo, peso, altura);
        persona persona2 = new persona(nombre, edad, sexo);
        persona persona3 = new persona();
        persona3.setNombre("Martina");
        persona3.setEdad(19);
        persona3.setSexo(genero.mujer);
        persona3.setPeso(65);
        persona3.setAltura(180);


        System.out.println("PERSONA 1: " + persona1.toString() + " \nademás, " + persona1.evaluarIMCyEdad());
        System.out.println("PERSONA 2: " + persona2.toString() + " \nademás, " + persona2.evaluarIMCyEdad());
        System.out.println("PERSONA 3: " + persona3.toString() + " \nademás, " + persona3.evaluarIMCyEdad());

    }
}

/* try{
    sout "introduce:"
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    String nombre = leer.readLine();
    } catch (IOException e{
        sout "s ha producido un error" +ex
    }
    */