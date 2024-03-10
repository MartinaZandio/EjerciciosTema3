package ej3;

public class numeroracional {

    private int numerador;
    private int denominador;

    public int getNumerador() { return numerador; }

    public void setNumerador(int numerador) {this.numerador = numerador;}

    public int getDenominador() {return denominador; }

    public void setDenominador(int denominador) {this.denominador = denominador; }

    public numeroracional(){ //constructor por defecto
        this.numerador=0;
        this.denominador=0;
    }

    public numeroracional(int numerador, int denominador){  //constructor que permite indicar valores
        this.numerador = numerador;
        this.denominador = denominador; 
    }

    public numeroracional(numeroracional R){  //constructor de copia
        this.numerador = R.numerador;
        this.denominador = R.denominador;
    }

    @Override
    public String toString() {
        return "Numerador: " + numerador + ", Denominador: " + denominador;
    }

    public numeroracional sumar (numeroracional num1, numeroracional num2){
        numeroracional resultado_suma = new numeroracional();
        int sumanum, sumadenom;
        sumanum = (num1.numerador*num2.denominador)+(num2.numerador * num1.denominador);
        sumadenom = num1.denominador * num2.denominador;
        resultado_suma.setNumerador(sumanum);
        resultado_suma.setDenominador(sumadenom);
        return resultado_suma;
    }

    public numeroracional restar (numeroracional num1, numeroracional num2){
        numeroracional resultado_resta = new numeroracional();
        int restanum, restadenom;
        restanum = (num1.numerador*num2.denominador)-(num2.numerador * num1.denominador);
        restadenom = num1.denominador * num2.denominador;
        resultado_resta.setNumerador(restanum);
        resultado_resta.setDenominador(restadenom);
        return resultado_resta;
    }

    public numeroracional multiplicar (numeroracional num1, numeroracional num2){
        numeroracional resultado_multiplicacion = new numeroracional();
        int multnum, multdenom;
        multnum = num1.numerador * num2.numerador;
        multdenom = num1.denominador * num2.denominador;
        resultado_multiplicacion.setNumerador(multnum);
        resultado_multiplicacion.setDenominador(multdenom);
        return resultado_multiplicacion;
    }
    
}

    
    

