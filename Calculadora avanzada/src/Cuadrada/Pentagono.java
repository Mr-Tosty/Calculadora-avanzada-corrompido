package Cuadrada;
//Clase para la base pentagono
public abstract class Pentagono{
    //Variable Pentagono Lado L-ap
    protected int VPLL;
    protected int VPLap;
    public Pentagono(int VPLL, int VPLap){
        this.VPLL = VPLL;
        this.VPLap = VPLap;
    }
    public abstract int pentagonoarea();//Metodo abstracto pentagono area
    public abstract int pentagonoperimetro();//Metodo abstracto pentagono perimetro
    //Clase para el area pentagono
    public class RPA extends Pentagono{
        public RPA (int VPLL, int VPLap){
            super(VPLL, VPLap);
        }
        @Override
        public int[] pentagonoarea{
            //Variable Procedimiento Area Pentagono 1 - 2
            int VPAP1 = 5 * VLPA * VPLap;
            int VPAP2 = VPAP1 / 2;
            System.out.println("Area del pentagono");
            return new int[]{VPAP1, VPAP2};
        }
    }
    //Clase para el perimetro pentagono
    public class RPP extends Pentagono{
        public RPP (int VPLL, int VPLap){
            super(VPLL, 0);
        }
        @Override 
        public int[] pentagonoperimetro{
            //Variable Procedimiento Perimetro Pentagono
            int VPPP = 5 * VPLL;
            System.out.println("Perimetro del pentagono");
            return new int[]{VPPP};
        }
    }
}