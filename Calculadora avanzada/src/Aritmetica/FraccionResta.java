package Aritmetica;
//Clase base para la fraccion Resta
public abstract class FraccionResta{
    //Variable Resta Fraccion Numerador 1-3
    protected int VRFN1;
    protected int VRFN2;
    protected int VRFN3;
    //Variable Resta Fraccion Denominador 1-3
    protected int VRFD1;
    protected int VRFD2;
    protected int VRFD3;
    public FraccionResta(int VRFN1, int VRFN2, int VRFN3, int VRFD1, int VRFD2, int VRFD3){
        this.VRFN1 = VRFN1;
        this.VRFN2 = VRFN2;
        this.VRFN3 = VRFN3;
        this.VRFD1 = VRFD1;
        this.VRFD2 = VRFD2;
        this.VRFD3 = VRFD3;
    }
    public abstract int[] fraccionrestar();//Metodo abstracto de restar fracciones
    public abstract int[] fraccionrestarcomun();//Metodo asbtracto restar fracciones comun
    //Clase para restar 3 variables de fraccion comun
    public class RRFV3C extends FraccionResta{
        public RRFV3C (int VRFN1, int VRFN2, int VRFN3, int VRFD1, int VRFD2, int VRFD3){
            super(VRFN1, VRFN2, VRFN3, VRFD1, VRFD2, VRFD3);
        }
        @Override
        public int[] fraccionrestar(){
            //Variable Resta Fraccion Procedimiento 1-2 Alternativa 1
            int VRFP1A1 = VRFN1 - VRFN2 - VRFN3;
            int VRFP2A1 = VRFD1;
            Sytem.out.println("Resta de fraccion de 3 fracciones y 6 variables");
            return new int[] {VRFP1A1, VRFP2A1};
        }
    }
    //Clase para retsar 3 variables de fraccion
    public class RRFV3C extends FraccionResta{
        public RRFV3C (int VRFN1, int VRFN2, int VRFN3, int VRFD1, int VRFD2, int VRFD3){
            super(VRFN1, VRFN2, VRFN3, VRFD1, VRFD2, VRFD3);
        }
        @Override
        public int[] fraccionrestar(){
            //Variable Resta Fraccion Procedimiento 1 - 4 Alternativa 2
            int VRFP1A2 = VRFN1 * VRFD2 * VRFN3;
            int VRFP2A2 = VRFD1 * VRFN2 * VRFD3;
            int VRFP3A2 = VRFD1 * VRFD2 * VRFP3;
            int VRFP4A2 = VRFP1A2 - VRFP2A2;
            Sytem.out.println("Resta de fraccion comun de 3 fracciones y 6 variables");
            return new int [] {VRFP1A2, VRFP2A2, VRFP3A2, VRFP4A2};
        }
    }
    //Clase para restar 2 variables de fraccion comun
    public class RRFV2C extends FraccionResta{
        public RRFV2C (int VRFN1, int VRFN2, int VRFD1, int VRFD2){
            super(VRFN1, VRFN2, 0, VRFD1, VRFD2, 0);
        }
        @Override
        public int[] fraccionrestarcomun(){
            //Variable Resta Fraccion Procedimiento 1 - 2 Alternativa 1
            int VRFP1A1 = VRFN1 - VRFN2;
            int VRFP2A1 = VRFD1;
            System.out.println("Resta de fraccion de 2 fracciones y 4 variables");
            return new int []{VRFP2A1};
        }
    }
    //Clase para restar 2 variables de fraccion
    public class RRFV2 extends FraccionResta{
        public RRFV2 (int VRFN1, int VRFN2, int VRFD1, int VRFD2){
            super(VRFN1, VRFN2, 0, VRFD1, VRFD2, 0);
        }
        @Override
        public int[] fraccionrestar(){
            //Variable Resta Fraccion Procedimiento 1 - 2 Alternativa 2
            int VRFP1A2 = VRFN1 * VRFD2;
            int VRFP2A2 = VRFD1 * VRFN2;
            int VRFP4A2 = VRFD1 * VRFD2;
            int VRFP3A2 = VRFP1A2 - VRFP2A2;
            System.out.println("Resta de fraccion comun de 2 fracciones y 4 variables");
            return new int []{VRFP1A2, VRFP2A2, VRFP3A2, VRFP4A2};
        }
    }
}