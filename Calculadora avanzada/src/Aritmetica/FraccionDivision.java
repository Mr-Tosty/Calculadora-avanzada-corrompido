package Aritmetica;
//Clase base para la fraccion Division
public abstract class FraccionDivision{
    //Variable Division Fraccion Numerador 1-3
    protected int VDFN1;
    protected int VDFN2;
    protected int VDFN3;
    //Variable Division Fraccion Denominador 1-3
    protected int VDFD1;
    protected int VDFD2;
    protected int VDFD3;
    public FraccionDivision(int VDFN1, int VDFN2, int VDFN3 ,int VDFD1, int VDFD2, int VDFD3){
        this.VDFN1 = VDFN1;
        this.VDFN2 = VDFN2;
        this.VDFN3 = VDFN3;
        this.VDFD1 = VDFD1;
        this.VDFD2 = VDFD2;
        this.VDFD3 = VDFD3;
    }
    public abstract int[] fracciondividir();//Metodo abstracto de multiplicar fracciones
    //Clase para dividir 3 variables de fraccion
    public class RDFV3 extends FraccionDivision{
        public RDFV3 (int VDFN1, int VDFN2, int VDFN3, int VDFD1, int VDFD2, int VDFD3){
            super(VDFN1, VDFN2, VDFN3, VDFD1, VDFD2, VDFD3);
        }
        @Override
        public int[] fracciondividir(){
            //Variable Division Fraccion Procedimiento 1 - 2
            int VDFP1 = VDFN1 * VDFD2 * VDFN3;
            int VDFP2 = VDFD1 * VDFN2 * VDFD3;
            System.out.println("Division de fraccion de 3 fracciones y 6 variables");
            return new int[]{VDFP1, VDFP2};
        }
    }
    //Clase para dividir 2 variables de fraccion
    public class RDFV2 extends FraccionDivision{
        public RDFV2 (int VDFN1, int VDFN2, int VDFD1, int VDFD2){
            super(VDFN1, VDFN2, 0, VDFD1, VDFD2, 0);
        }
        @Override
        public int[] fracciondividir(){
            //Variable Division Fraccion Procedimiento 1 - 2
            int VDFP1 = VDFD1 * VDFN2;
            int VDFP2 = VDFN1 * VDFD2;
            System.out.println("Division de fraccion de 2 fracciones y 4 variables");
            return new int[]{VDFP1, VDFP2};
        }
    }
}