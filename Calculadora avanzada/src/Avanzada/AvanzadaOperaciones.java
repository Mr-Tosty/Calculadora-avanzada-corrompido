package Avanzada;
public class AvanzadaOperaciones{
    //Clase para la base de potencia
    public abstract class Potencia{
        protected double VB;
        protected double VP1;
        protected double VP2;
        protected double VP3;
        protected double VP4;
        public Potencia(double VB, double VP1, double VP2, double VP3, double VP4){
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
            System.out.println("Potencia de 4 variables");
            return (int) Math.pow(VB, VP1);//Modificar aqui
        }
    }
    //Clase para 3 potencias
    //Clase para 2 potencias
    //Clase para 1 potencias
    public class RVP1 extends Potencia{
        public RVP1 (double VB, double VP1){
            super(VB, VP1, 1, 1, 1);
        }
        @Override
        public int potenciar(){
            System.out.println("Potencia de 1 variables");
            return (int) Math.pow(VB, VP1);
        }
    }
    //Clase para la base de raiz
    public abstract class Raiz{
        protected double VR;
        protected double VI1;
        protected double VI2;
        protected double VI3;
        protected double VI4;
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
            System.out.println("Raiz de 4 variables");
            return (int) Math.sqrt(VR);
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
            System.out.println("Raiz de 1 variables");
            return (int) Math.sqrt(VR);
        }
    }
}