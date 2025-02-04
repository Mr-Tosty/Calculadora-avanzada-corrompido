package Analitica;
public abstract class PuntoMedio {
    //Clase para la base punto medio
    // Variable Coordenadas punto medio
    protected int VCPM;
    public PuntoMedio(int VCPM){
        this.VCPM = VCPM;
    }
    public abstract int puntomedio();//Metodo abstracto punnto meedio
}
