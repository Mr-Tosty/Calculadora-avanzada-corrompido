package Analitica;
public abstract class PuntoDistancia {
    //Clase base de punto distancia
    //Variable Coordenas Punto Distancia
    protected int VCPD;
    public PuntoDistancia(int VCPD){
        this.VCPD = VCPD;
    }
    public abstract int puntodistancia();//Metodo abstracto punto distancia
}
