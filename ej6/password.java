package ej6;

public class password {

    private int longitud; 
    private String contraseña; 

    public password() {
        this.longitud = 8;
        this.contraseña = "password";
    }

    public password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(longitud);
    }

    public int getLongitud() {  return longitud; }

    public void setLongitud(int longitud) { this.longitud = longitud; }

    public String getContraseña() {  return contraseña; }

    public void setContraseña(String contraseña) {  this.contraseña = contraseña; }

    public String generarPassword(int longitud){
        String passwordCreada = "";
       int numeroRandom = 0;
       for(int i=0; i<=longitud;i++){
           do {
               numeroRandom = (int) ((Math.random()) * 127);
           } while (!(numeroRandom>=48 && numeroRandom<=57) && !(numeroRandom>=65 && numeroRandom<=90) && !(numeroRandom>=97 && numeroRandom<=122));
           passwordCreada = passwordCreada + (char)(numeroRandom);
       }
       return passwordCreada;
    }

    public boolean esFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isUpperCase(contraseña.charAt(i))) {
                mayusculas++;
            } else if (Character.isLowerCase(contraseña.charAt(i))) {
                minusculas++;
            } else if (Character.isDigit(contraseña.charAt(i))) {
                numeros++;
            }
        }
        if (mayusculas >= 2 && minusculas >= 1 && numeros >= 5) {
            return true;
        } else {
            return false;
        }
    }
    
}
