package Cuadrada;
//Clase para la base rectangulo
public abstract class Rectangulo{
    //Variable Lado Rectangulo A-B
    protected int VLRA;
    protected int VLRB;
    public Rectangulo(int VLRA, int VLRB){
        this.VLRA = VLRA;
        this.VLRB = VLRB;
    }
    public abstract int[] rectanguloarea();//Metodo abstracto rectangulo area
    public abstract int[] rectanguloperimetro();//Metodo abstracto rectanguloperimetro
    //Clase para el area rectangulo
    public class RRA extends Rectangulo{
        public RRA (int VLRA, int VLRB){
            super(VLRA, VLRB);
        }
        @Override
        public int[] cuadradoarea(){
            //Variable Procedimiento Area Rectangulo
            int VPAR = VLRA * VLRB;
            System.out.println("Area del rectangulo");
            return new int[]{VLRA};
        }
    }
    //Clase para el perimetro rectangulo
    public class RRP extends Rectangulo{
        public RRP (int VLRA, int VLRB){
            super(VLRA, VLRB);
        }
        @Override
        public int[] rectanguloperimetro(){
            //Variable Procedimiento Perimetro Rectangulo 1 - 2
            int VPPR1 = VLRA + VLRB;
            int VPPR2 = VPPR1 * 2;
            System.out.println("Perimetro del rectangulo");
            return new int[]{VPPR1, VPPR2};
        }
    }
}