package ej5;


public class persona{
    String nombre;
    int edad;
    String DNI;
    genero sexo;
    float peso;
    float altura;

    public String getNombre() {  return nombre;   }

    public void setNombre(String nombre) {  this.nombre = nombre;  }

    public int getEdad() {  return edad;   }

    public void setEdad(int edad) {  this.edad = edad;  }

    public String getDNI() {  return DNI;  }

    public void setDNI(String DNI) {  this.DNI = DNI;  }

    public genero getSexo() {  return sexo; }

    public void setSexo(genero sexo) {  this.sexo = sexo;  }

    public float getPeso() {  return peso; }

    public void setPeso(float peso) { this.peso = peso; }

    public float getAltura() { return altura; }

    public void setAltura(float altura) {  this.altura = altura; }

    public persona(){  //constructor por defecto 
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI(); 
        this.sexo = genero.mujer;
        this.peso = 0;
        this.altura = 0; 
    }

    public persona(String nombre, int edad, genero sexo){  //constructor con nombre, edad y sexo, lo demás por defecto
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo; 
        this.peso = 0;
        this.altura = 0;
    }

    public persona (String nombre, int edad, genero sexo, float peso, float altura){   //constructor con atributos menos DNI 
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo; 
        this.peso = peso;
        this.altura = altura; 

    }

    public float calcularIMC(){
        float IMC = peso/(altura*altura);
        return IMC; 
    }

    public float valorarPesoCorporal(){
        float IMC = calcularIMC();
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

        public String generaDNI() {
            int numeroDNI = (int)(Math.random() * 100000000);
            char letraDNI = (char)('A' + (int)(Math.random() * 26));
            DNI = String.valueOf(numeroDNI) + letraDNI;
            return DNI;
        }

        public String evaluarIMCyEdad(){
            String info;
            if(valorarPesoCorporal()==1){
                info= "Sobrepeso";
            }else if(valorarPesoCorporal()==-1){
                info= "Por debajo del peso ideal";
            }else{
                info= "Peso ideal";
            }
            if(esMayorDeEdad()==true){
                info += "\nMayor de edad";
            }else{
                info += "\nMenor de edad";
            }
            return info;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "DNI: " + generaDNI() + "\n" + "Sexo: " + sexo + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura;
        }

        
    }







    
