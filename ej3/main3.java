package ej3;
/*Crear una clase que represente un número racional que permita, al menos, sumar, multiplicar y simplificar números racionales. 
Proporcionar un constructor por defecto, un constructor de copia (esto es, un Algoritmos y Estructuras de Datos Página 52 de 56 
constructor al que se le pasa una instancia de la clase número racional y crea otro número racional idéntico), y otro que 
permita indicar los valores del numerador y del denominador. Usando esta clase, crea una calculadora que permita operar con 
números racionales, seleccionando las operaciones de un menú. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main3 {
    public static void main(String[] args) {
        numeroracional numero1 = new numeroracional();
        numeroracional numero2 = new numeroracional(2,3);
        numeroracional numeroResultado = new numeroracional();

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));  //para leer por teclado com bufferedreader y con excpecioens en vez de con el scanner
        try{
            System.out.println("introduce numerador : ");
            numero1.setNumerador(Integer.parseInt(leer.readLine()));
            System.out.println("introduce denominador : ");
            numero2.setDenominador(Integer.parseInt(leer.readLine()));
        }catch (IOException ex) {
            System.out.println("Se ha producido un error" + ex);
        }
        int opcion;
        try{
            System.out.println("1.Sumar \n2.Restar \n3.Multiplicar \nIntroduzca que operacion desea ejecutar:");
            opcion = Integer.parseInt(leer.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        switch(opcion){
            case 1:
                numeroResultado = numeroResultado.sumar(numero1, numero2);
                System.out.println("El resultado de la suma es : " +numeroResultado);
                break;
            case 2: 
                numeroResultado = numeroResultado.restar (numero1, numero2);
                System.out.println("El resultado de la resta es : " +numeroResultado);
                break;
            case 3:
                numeroResultado = numeroResultado.multiplicar(numero1,numero2);
                System.out.println("El resultado de la multiplicacion es :" +numeroResultado);
                break;
        }
    }


    
}
