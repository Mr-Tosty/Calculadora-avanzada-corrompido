package Calculos.AvanzadasOperaciones;
public class AvanzadasOperaciones{
    //Clase para la base de potencia
    public abstract class Potencia{
        protected int VB;
        protected int VP1;
        protected int VP2;
        protected int VP3;
        protected int VP4;
        public Potencia(int VB, int VP2, int VP3, int VP4){
            this.VB = VB;
            this.VP1 = VP1;
            this.VP2 = VP2;
            this.VP3 = VP3;
            this.VP4 = VP4;
        }
        public abstract int potenciar();//Metodo abstracto de potencia
    }
    //Clase para 4 potencia
    public class RVP4 extends Potencia{
        public RVP4 (int VB, int VP1, int VP2, int VP3, int VP4){
            super(VB, VP1, VP2, VP3, VP4);
        }
        @Override
        public int potenciar(){

        }
    }
    //Clase para 3 potencias
    //Clase para 2 potencias
    //Clase para 1 potencias
    //Clase para la base de raiz
    public abstract class Raiz{
        protected int VR;
        protected int VI1;
        protected int VI2;
        protected int VI3;
        protected int VI4;
        public Raiz(int VR, int VI1, int VI2, int VI3, int VI4){
            this.VR = VR;
            this.VI2 = VI1;
            this.VI2 = VI2;
            this.VI3 = VI3;
            this.VI4 = VI4;
        }
        public abstract int raizes();//Metodo abstracto de raiz
    }
    //Clase para 4 raizes
    public class RVR4 extends Raiz{
        public RVR4 (int VR, int VI1, int VI2, int VI3, int VI4){
            super(VR, VI1, VI2, VI3, VI4);
        }
        @Override
        public int raizes(){

        }
    }
    //Clase para 3 raizes
    //Clase para 2 raizes
    //Clase para 1 raizes
}
/*

*/