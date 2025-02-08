package Aritmetica;
    //Clase base para la fraccion Multiplicacion
public abstract class FraccionMultiplicacion{
    //Variable Multiplicacion Fraccion Numerador 1-3
    protected int VMFN1;
    protected int VMFN2;
    protected int VMFN3;
    //Variable Multiplicacion Fraccion Denominador 1-3
    protected int VMFD1;
    protected int VMFD2;
    protected int VMFD3;
        public FraccionMultiplicacion(int VMFN1, int VMFN2, int VMFN3, int VMFD1, int VMFD2, int VMFD3){
        this.VMFN1 = VMFN1;
        this.VMFN2 = VMFN2;
        this.VMFN3 = VMFN3;
        this.VMFD1 = VMFD1;
        this.VMFD2 = VMFD2;
        this.VMFD3 = VMFD3;
    }
    public abstract int[] fraccionmultiplicar();//Metodo abstracto de multiplicar fracciones
    //Clase para multiplicar 3 variables de fraccion
    public class RMFV3 extends FraccionMultiplicacion{
        public RMFV3 (int VMFN1, int VMFN2, int VMFN3, int VMFD1, int VMFD2, int VMFD3){
            super(VMFN1, VMFN2, VMFN3, VMFD1, VMFD2, VMFD3);
        }
        @Override
        public int[] fraccionmultiplicar(){
            //Variable Multiplicacion Fraccion Procedimiento 1 - 2
            int VMFP1 = VMFN1 * VMFN2 * VMFN3;
            int VMFP2 = VMFD1 * VMFD2 * VMFD3;
            System.out.println("Multiplicacion de fraccion de 3 fracciones y 6 variables");
            return new int[]{VMFP1, VMFP2};
        }
    }
    //Clase para multiplicar 2 variables de fraccion
    public class RMFV2 extends FraccionMultiplicacion{
        public RMFV2 (int VMFN1, int VMFN2, int VMFD1, int VMFD2){
            super(VMFN1, VMFN2, 0, VMFD1, VMFD2, 0);
        }
        @Override
        public int[] fraccionmultiplicar(){
            //Variable Multiplicacion Fraccion Procedimiento 1 - 2
            int VMFP1 = VMFN1 * VMFN2;
            int VMFP2 = VMFD1 * VMFD2;
            System.out.println("Multiplicacion de fraccion de 2 fracciones y 4 variables");
            return new int[]{VMFP1, VMFP2};
        }
    }
}