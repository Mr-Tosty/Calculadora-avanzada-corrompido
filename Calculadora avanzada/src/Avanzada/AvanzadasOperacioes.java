package Calculos.AvanzadasOperaciones;
public class AvanzadasOperaciones{
    //Clase para la base de potencia
    public abstract class Potencia{
        protected double VB;
        protected double VP1;
        protected double VP2;
        protected double VP3;
        protected double VP4;
        public Potencia(double VB, double VP2, double VP3, double VP4){
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
        public RVP4 (double VB, double VP1, double VP2, double VP3, double VP4){
            super(VB, VP1, VP2, VP3, VP4);
        }
        @Override
        public int potenciar(){
            
        }
    }
    //Clase para 3 potencias
    //Clase para 2 potencias
    //Clase para 1 potencias
    public class RVP4 extends Raiz{
        public RVP4 (double VR, double VI1, double VI2, double VI3, double VI4){
            super(VB, VP1, 1, 1, 1);
        }
        @Override
        public int raizes(){
            return Math.pow(VB, VP1);
        }
    }
    //Clase para la base de raiz
    public abstract class Raiz{
        protected double VR;
        protected int VI1;
        protected int VI2;
        protected int VI3;
        protected int VI4;
        public Raiz(double VR, int VI1, int VI2, int VI3, int VI4){
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
        public RVR4 (double VR, int VI1, int VI2, int VI3, int VI4){
            super(VR, VI1, VI2, VI3, VI4);
        }
        @Override
        public int raizes(){
            return Math.sqrt(VR);
        }
    }
    //Clase para 3 raizes
    //Clase para 2 raizes
    //Clase para 1 raizes
    public class RVR1 extends Raiz{
        public RVR1 (double VR, int VI1){
            super(VR, VI1, 1, 1, 1);
        }
        @Override
        public int raizes(){
            return Math.sqrt(VR);
        }
    }
}