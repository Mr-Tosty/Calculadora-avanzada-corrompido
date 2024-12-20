package Basico;
//CLase para la base de redondeo
public abstract class Redondeo{
    //Variable redondeo 1-6
    protected double VRe1;
    protected double VRe2;
    protected double VRe3;
    protected double VRe4;
    protected double VRe5;
    protected double VRe6;
    public Redondeo(double VRe1, double VRe2, double VRe3, double VRe4, double VRe5, double VRe6){
        this.VRe1 = VRe1;
        this.VRe2 = VRe2;
        this.VRe3 = VRe3;
        this.VRe4 = VRe4;
        this.VRe5 = VRe5;
        this.VRe6 = VRe6;
    }
    public abstract int[] redondear();//Metodo abstracto de redondeo
    //Clase para redondear 6 variables
    public class VRo6 extends Redondeo{
        public VRo6(double VRe1, double VRe2, double VRe3, double VRe4, double VRe5, double VRe6){
            super(VRe1, VRe2, VRe3, VRe4, VRe5, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 6 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2),
                (int) Math.round(VRe3),
                (int) Math.round(VRe4),
                (int) Math.round(VRe5),
                (int) Math.round(VRe6)
            };
        }
    }
    //Clase para redondear 5 variables
    public class VRo5 extends Redondeo{
        public VRo5(double VRe1, double VRe2, double VRe3, double VRe4, double VRe5){
            super(VRe1, VRe2, VRe3, VRe4, VRe5, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 5 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2),
                (int) Math.round(VRe3),
                (int) Math.round(VRe4),
                (int) Math.round(VRe5)
            };
        }
    }
    //Clase para redondear 4 variables
    public class VRo4 extends Redondeo{
        public VRo4(double VRe1, double VRe2, double VRe3, double VRe4){
            super(VRe1, VRe2, VRe3, VRe4, 0, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 4 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2),
                (int) Math.round(VRe3),
                (int) Math.round(VRe4)
            };
        }
    }
    //Clase para redondear 3 variables
    public class VRo3 extends Redondeo{
        public VRo3(double VRe1, double VRe2, double VRe3){
            super(VRe1, VRe2, VRe3, 0 ,0 ,0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 3 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2),
                (int) Math.round(VRe3)
            };
        }
    }
    //Clase para redondear 2 variables
    public class VRo2 extends Redondeo{
        public VRo2(double VRe1, double VRe2){
            super(VRe1, VRe2, 0, 0, 0, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 2 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2)
            };
        }
    }
    //Clase para redondear 1 variables
    public class VRo1 extends Redondeo{
        public VRo1(double VRe1){
            super(VRe1, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 1 variable");
            return new int[]{
                (int) Math.round(VRe1)
            };
        }
    }
}