package Avanzada;
public class AvanzadaOperaciones{
    //Clase para la base de potencia
    public abstract class Potencia{
        protected double VB;//Variable Base
        //Variable Exponente 1-6
        protected double VE1;
        protected double VE2;
        protected double VE3;
        protected double VE4;
        public Potencia(double VB, double VE1, double VE2, double VE3, double VE4){
            this.VB = VB;
            this.VE1 = VE1;
            this.VE2 = VE2;
            this.VE3 = VE3;
            this.VE4 = VE4;
        }
        public abstract int potenciar();//Metodo abstracto de potencia
    }
    //Clase para 4 potencia
    public class RVE4 extends Potencia{
        public RVE4 (double VB, double VE1, double VE2, double VE3, double VE4){
            super(VB, VE1, VE2, VE3, VE4);
        }
        @Override
        public int potenciar(){
            System.out.println("Potencia de 4 variables");
            return (int) Math.pow(VB, VE1);//Modificar aqui
        }
    }
    //Clase para 3 potencias
    //Clase para 2 potencias
    //Clase para 1 potencias
    public class RVE1 extends Potencia{
        public RVE1 (double VB, double VE1){
            super(VB, VE1, 1, 1, 1);
        }
        @Override
        public int potenciar(){
            System.out.println("Potencia de 1 variables");
            return (int) Math.pow(VB, VE1);
        }
    }
    //Clase para la base de raiz
    public abstract class Raiz{
        protected double VR;//Variable Radicando
        //Variable radical 1-4
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