package Cuadrada;
//Clase para la base circulo
public abstract class Circulo{
    //Variable Radio Circulo
    protected int VRC;
    public Circulo(int VRC){
        this.VRC = VRC;
    }
    public abstract int[] circuloarea();//Metodo abstracto circulo area
    public abstract int[] circuloperimetro();//Metodo abstracto circulo perimetro
    //Clase para el area circulo
    public class RCoA extends Circulo{
        public RCoA (int VRC){
            super(VRC);
        }
        @Override
        public int[] circuloarea(){
            //Variable Procedimiento Area Circulo 1 - 2
            int VPACo1 = Math.pow(VRC, 2);
            int VPACo2 = VPACo1 * Math.PI;
            System.out.println("Area del circulo");
            return new int[]{VPACo1, VPACo2};
        }
    }
    //Clase para el perimetro circulo
    public class RCoP extends Circulo{
        public RCoP (int VRC){
            super(VRC);
        }
        @Override
        public int[] circuloperimetro(){
            //Variable Procedimiento Perimetro Circulo 1 - 3
            int VPPCo1 = VRC * Math;
            int VPPCo2 = VPPCo1 * 2;
            System.out.println("Perimetro del circulo");
            return new int[]{VPPCo1, VPPCo2};
        }
    }
}