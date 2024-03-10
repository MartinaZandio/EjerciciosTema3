public class objetopunto{
    private int x;
    private int y;
    private int z;

    public objetopunto(){ //constructor inciliazado a orgien de coordenadas
        this.x=0;
        this.y=0;
        this.z=0;
    }

    public objetopunto(int x, int y, int z){  //constructor q permite especificar coordenadas 
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Override
    public String toString() {
        return "objetopunto{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

    
