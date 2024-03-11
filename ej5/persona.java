package ej5;

public enum genero {hombre, mujer};

public class persona{
    private String nombre;
    private int edad;
    private String DNI;
    private genero sexo;
    private float peso;
    private float altura;

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }

    public void setEdad(int edad) { this.edad = edad; }

    public String getDNI() {  return DNI; }

    public genero getSexo() { return sexo; }

    public void setSexo(genero sexo) {  this.sexo = sexo; }

    public float getPeso() { return peso; }

    public void setPeso(float peso) { this.peso = peso; }

    public float getAltura() { return altura; }

    public void setAltura(float altura) {  this.altura = altura;  }

    public persona(){  //constructor por defecto 
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
        this.sexo = genero.mujer;
        this.peso = 0;
        this.altura = 0; 
    }

    public persona(String nombre, int edad, genero sexo){  //constructor con nombre, edad y sexo, lo demás por defecto
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = "";
        this.sexo = sexo; 
        this.peso = 0;
        this.altura = 0;
    }

    public persona (String nombre, int edad, String DNI, genero sexo, float peso, float altura){   //constructor con atributos menos DNI 
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = 0;
        this.sexo = sexo; 
        this.peso = peso;
        this.altura = altura; 

    }

    public float calcularIMC(){
        return peso/(altura*altura);
    }

    public float valorarPesoCorporal(){
        IMC = calcularIMC();
        if(IMC>25){
            return 1;
        }else if(IMC<18){
            return -1;
        }else{
            return 0;
        }
        }

        public boolean esMayorDeEdad(){
            if(edad>=18){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public String toString() {
        return "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "DNI: " + DNI + "\n" + "Sexo: " + sexo + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura;
        }


        public int generaDNI(){
            int DNI = (int) (Math.random()*100000000);
            return DNI;
        }


        
    }







    
