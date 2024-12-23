package Cubica;
//Clase para la base esfera
public abstract class Esfera{
    //Variable Lado Esfera A
    protected int VLEA;
    public Esfera(int VLEA){
        this.VLEA = VLEA;
    }
    public abstract int esfera();//Metodo abstracto esfera
}