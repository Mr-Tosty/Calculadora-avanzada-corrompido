package Analitica;
public abstract class PuntoDistancia {
    //Clase base de punto distancia
    //Variable Coordenas Punto Distancia X-Y 1-2
    protected int VCPDX1;
    protected int VCPDX2;
    protected int VCPDY1;
    protected int VCPDY2;
    public PuntoDistancia(int VCPDX1, int VCPDX2, int VCPDY1, int VCPDY2){
        this.VCPDX1 = VCPDX1;
        this.VCPDX2 = VCPDX2;
        this.VCPDY1 = VCPDY1;
        this.VCPDY2 = VCPDY2;
    }
    public abstract int puntodistancia();//Metodo abstracto punto distancia
}
