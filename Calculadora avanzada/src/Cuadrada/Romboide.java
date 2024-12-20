package Cuadrada;
//Clase para la base romboide
public abstract class Romboide{
    //Variable Romboide Lado B-b-h
    protected int VRoLB;
    protected int VRoLb;
    protected int VRoLH;
    public Romboide(int VRoLB, int VRoLb, int VRoLH){
        this.VRoLB = VRoLB;
        this.VRoLb = VRoLb;
        this.VRoLH = VRoLH
    }
    public abstract int[] romboidearea();//Metodo abstracto romboide area
    public abstract int[] romboideperimetro();//Metodo abstracto romboide perimetro
    //Clase para el area romboide
    public class RRmA extends Romboide{
        public RRmA (int VRoLB, int VRoLb, int VRoLH){
            super(VRoLB, VRoLb, VRoLH);
        }
        @Override
        public int[] romboidearea(){
            //Variable Procedimiento Romboide Area 1 - 3
            int VPRmA1 = VRoLB + VRoLb;
            int VPRmA2 = VPRmA1 / 2;
            int VPRmA3 = VPRmA2 * VRoLH;
            System.out.println("Area romboide");
            return new int[]{VPRmA1, VPRmA2, VPRmA3};
        }
    }
    //Clase para el perimetro romboide
    public class RRmP extends Romboide{
        public RRmP (int VRoLB,int VRoLb, VRoLH){
            super(VRoLB, VRoLb, VRoLH);
        }
        @Override
        public int[] romboideperimetro(){
            //Variable Procedimiento Romboide Perimetro
            int VPRmP = VRoLB + VRoLb + VRoLH + VRoLH;
            System.out.println("Perimetro romboide");
            return new int[]{VPRmP};
        }
    }
}