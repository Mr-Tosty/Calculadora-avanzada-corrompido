package Analitica;
//Clase para la base Circulo con centro fuera de origen
public abstract class CirculoFuera{
    //Variable Coordenadas Circulo Fuera
    protected int VCCF;
    public CirculoFuera(int VCCF){
        this.VCCF = VCCF;
    }
    public abstract int circulofuera();//Metodo abstracto circulo con centro fuera de origen
}
