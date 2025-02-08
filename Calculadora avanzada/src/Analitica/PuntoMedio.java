package Analitica;
public abstract class PuntoMedio {
    //Clase para la base punto medio
    // Variable Coordenadas punto medio X-Y 1-2
    protected int VCPMX1;
    protected int VCPMX2;
    protected int VCPMY1;
    protected int VCPMY2;
    public PuntoMedio(int VCPMX1, int VCPMX2, int VCPMY1, int VCPMY2){
        this.VCPMX1 = VCPMX1;
        this.VCPMX2 = VCPMX2;
        this.VCPMY1 = VCPMY1;
        this.VCPMY2 = VCPMY2;
    }
    public abstract int puntomedio();//Metodo abstracto punnto meedio
}
