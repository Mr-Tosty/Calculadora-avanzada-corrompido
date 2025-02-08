package Analitica;
public abstract class PuntoLocalizacion{
    //Variables Coordenadas Punto Localizacion 1-2
    protected int VCPL1;
    protected int VCPL2;
    public PuntoLocalizacion(int VCPL1, int VCPL2){
        this.VCPL1 = VCPL1;
        this.VCPL2 = VCPL2;
    }
    public abstract int puntolocalizacion();//Metodo abstracto punto localizacion
}