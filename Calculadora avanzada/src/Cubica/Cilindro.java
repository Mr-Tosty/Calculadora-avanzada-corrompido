package Cubica;
//Clase para la base cilindro
public abstract class Cilindro{
    //Variable Lado Cilindro A
    protected int VLCiA;
    public Cilindro(int VLCiA){
        this.VLCiA = VLCiA;
    }
    public abstract int cilindro();//Metodo abstracto Cilindro
}