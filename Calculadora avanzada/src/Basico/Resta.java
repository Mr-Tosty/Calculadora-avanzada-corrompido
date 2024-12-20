package Basico;
//Clase para la base resta
public abstract class Resta{
    //Variable Resta 1-6
    protected int VR1;
    protected int VR2;
    protected int VR3;
    protected int VR4;
    protected int VR5;
    protected int VR6;
    public Resta (int VR1, int VR2, int VR3, int VR4, int VR5, int VR6){
        this.VR1 = VR1;
        this.VR2 = VR2;
        this.VR3 = VR3;
        this.VR4 = VR4;
        this.VR5 = VR5;
        this.VR6 = VR6;
    }
    public abstract int restar(); //Metodo abstracto de restar
    //Clase para restar 6 variables
    public class RRV6 extends Resta{
        public RRV6(int VR1, int VR2, int VR3, int VR4, int VR5, int VR6){
            super(VR1, VR2, VR3, VR4, VR5, VR6);
        }
        @Override
        public int restar(){
            System.out.println("Resta de 6 variables");
            return VR1 - VR2 - VR3 - VR4 - VR5 - VR6;
        }
    }
    //Clase para restar 5 variables
    public class RRV5 extends Resta{
        public RRV5(int VR1, int VR2, int VR3, int VR4, int VR5){
            super(VR1, VR2, VR3, VR4, VR5, 0);
        }
        @Override
        public int restar(){
            System.out.println("Reta de 5 variables");
            return VR1 - VR2 - VR3 - VR3 - VR5;
        }
    }
    //Clase para restar 4 variables
    public class RRV4 extends Resta{
        public RRV4 (int VR1, int VR2, int VR3, int VR4){
            super(VR1, VR2, VR3, VR4, 0, 0);
        }
        @Override
        public int restar(){
            System.out.println("Resta de 4 variables");
            return VR1 - VR2 - VR3 - VR4;
        }
    }
    //Clase para restar 3 variables
    public class RRV3 extends Resta{
        public RRV3 (int VR1, int VR2, int VR3){
            super(VR1, VR2, VR3, 0, 0, 0);
        }
        @Override
        public int restar(){
            System.out.println("Resta de 3 variables");
            return VR1 - VR2 - VR3;
        }
    }
    //Clase para restar 2 variables
    public class RRV2 extends Resta{
        public RRV2 (int VR1, int VR2){
            super(VR1, VR2, 0, 0, 0, 0);
        }
        @Override
        public int restar(){
            System.out.println("Resta de 2 variables");
            return VR1 - VR2;
        }
    }
}