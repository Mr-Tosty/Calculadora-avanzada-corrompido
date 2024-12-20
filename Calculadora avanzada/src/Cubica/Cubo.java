package Cubica;
public class Cubo{
    //Clase para la base cubo
    public abstract class Cubo{
        //Variable Lado Cuadrado A
        protected int VLCA;
        public Cubo(int VLCA){
            this.VLCA = VLCA;
        }
        public abstract int cubo();//Metodo abstracto cubo
    }
}