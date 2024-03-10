/* Escribe un programa que cree una clase para representar un objeto punto en tres dimensiones. 
Proporcionar un constructor que inicialice los valores del punto al origen de coordenadas y otro que 
permita especificar las coordenadas del punto. Sobrescribe su método toString() para que muestre información sobre los puntos. 
Usa la clase en un programa donde crees objetos que representen los puntos (12, 13, 18) y (8, 14, 0) y los muestres por consola.*/

public class main1{
    public static void main(String[] args) {
        objetopunto punto1 = new objetopunto (12,13,18);
        objetopunto punto2 = new objetopunto (8,14,0);

        System.out.println(punto1);
        System.out.println(punto2);
    }
}