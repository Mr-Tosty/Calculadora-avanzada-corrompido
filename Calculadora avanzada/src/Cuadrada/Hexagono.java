package Cuadrada;
//Clase para la base hexagono
public abstract class Hexagono{
    //Variable Hexagono Lado L-ap
    protected int VHLL;
    protected int VHLap;
    public Hexagono(int VHLL, int VHLap){
        this.VHLL = VHLL;
        this.VHLap = VHLap;
    }
    public abstract int[] hexagonoarea();//Metodo abstracto hexagono area
    public abstract int[] hexagonoperimetro(); //Metodo abstracto hexagono perimetro
    //Clase para el area hexagono
    public class RHA extends Hexagono{
        public RHA (int VHLL, int VHLap){
            super( VHLL, VHLap);
        }
        @Override
        public int[] hexagonoarea(){
            //Variable Procedimiento Area Hexagon
            int VPAH = 3 * VHLL * VHLap;
            System.out.println("Area del hexagono");
            return new int[]{VPAH};
        }
    }
    //Clase para el perimetro hexagono
    public class RHP extends Hexagono{
        public RHP (int VHLL, int VHLap){
            super(VHLL, 0);
        }
        @Override
        public int[] hexagonoperimetro(){
            //Variable Procedimiento Perimetro Hexagono
            int VPPH = 6 * VHLL;
            System.out.println("Perimetro del hexagono");
            return new int[]{VPPH};
        }
    }
}