/*Crea una clase fecha que almacene el día, el mes y el año de una fecha. Proporciona funciones miembro para acceder a 
estos atributos (getDia(), getMes() y getAño() y para modificarlos (setDia(int dia), setMes(int mes) y setAño(int año)). 
Sobreescribe su método toString(). Crea la fecha 20/10/2018. Muéstrala por pantalla. Después cambia el año 2019. 
Muéstrala por pantalla. */

public class main2 {
    public static void main(String[] args) {
        fecha fecha1 = new fecha(20, 10, 2018);
        System.out.println(fecha1.toString());
        fecha1.setAño(2019);
        System.out.println(fecha1.toString());
    }
}