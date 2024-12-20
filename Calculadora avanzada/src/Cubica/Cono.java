package Cubica;
//Clase para la base cono
public abstract class Cono{
    //Variable Lado Cono A
    protected int VLCoA;
    public Cono(int VLCoA){
        this.VLCoA = VLCoA;
    }
    public abstract int cono();//Metodo abstracto cono
}