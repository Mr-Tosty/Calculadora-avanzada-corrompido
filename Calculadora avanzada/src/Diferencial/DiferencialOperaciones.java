package Diferencial;
public class DiferencialOperaciones{
    //Clase para la base Derivada un numero
    public abstract class DerivadaNumero{
        //Variable Deriava Numero
        protected int VDN;
        public DerivadaNumero(int VDN){
            this.VDN = VDN;
        }
        public abstract int derivadanumero();//Metodo abstracto derivada numero
    }
    //Clase para la base derivada Numero con X
    public abstract class DerivadaNumeroX{
        //Variable Derivada Numero X
        protected int VDNX;
        public DerivadaNumeroX(int VDNX){
            this.VDNX = VDNX;
        }
        public abstract int derevadanumerox();//Metodo abstracto derivada numero x
    }
    //Clase para la base derivada numero con x a la potencia
    public abstract class DerivadaNumeroXPotencia{
        //Variable Derivada Numero X Potencia
        protected int VDNXP;
        public DerivadaNumeroXPotencia(int VDNXP){
            this.VDNXP = VDNXP;
        }
        public abstract int derivadanumeroxpotencia();//Metodo abstracto derivada numero x potencia
    }
    
}