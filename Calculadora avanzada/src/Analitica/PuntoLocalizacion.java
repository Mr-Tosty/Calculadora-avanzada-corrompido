package Analitica;
public abstract class PuntoLocalizacion{
    //Variables Coordenadas Punto Localizacion
    protected int VCPL;
    public PuntoLocalizacion(int VCPL){
        this.VCPL = VCPL;
    }
    public abstract int puntolocalizacion();//Metodo abstracto punto localizacion
}