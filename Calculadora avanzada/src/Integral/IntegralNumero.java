package Integral;
public class IntegralOperaciones{
    //Clase para la base de integral numero
    public abstract class IntegralNumero{
        //Variables Integral Numero
        protected int VIN;
        public IntegralNumero(int VIN){
            this.VIN = VIN;
        }
        public abstract int integralnumero(); //Metodo abstracto integral numero
    }
}