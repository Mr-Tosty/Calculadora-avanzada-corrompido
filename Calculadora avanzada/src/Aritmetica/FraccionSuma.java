package Aritmetica;
//Clase base para la fraccion Suma
public abstract class FraccionSuma{
    //Variable Suma Fraccion Numerador 1-3
    protected int VSFN1;
    protected int VSFN2;
    protected int VSFN3;
    //Variable Suma Fraccion Denominador 1-3
    protected int VSFD1;
    protected int VSFD2;
    protected int VSFD3;
    public FraccionSuma(int VSFN1, int VSFN2, int VSFN3, int VSFD1, int VSFD2, int VSFD3){
        if (VSFD1 == 0 || VSFD2 == 0 || VSFD3 == 0){
            throw new IllegalArgumentException("Ningun denominador debe ser a 0");
        }
        this.VSFN1 = VSFN1;
        this.VSFN2 = VSFN2;
        this.VSFN3 = VSFN3;
        this.VSFD1 = VSFD1;
        this.VSFD2 = VSFD2;
        this.VSFD3 = VSFD3;
    }
    public abstract int[] fraccionsumar();//Metodo abstracto de sumar fracciones
    public abstract int[] fraccionsumarcomun();//Metodo abstracto de sumar fracciones comunes
    //Clase para sumar 3 variables de fraccion comun
    public class RSFV3C extends FraccionSuma{
        public RSFV3C (int VSFN1, int VSFN2, int VSFN3, int VSFD1, int VSFD2, int VSFD3){
            super(VSFN1, VSFN2, VSFN3, VSFD1, VSFD2, VSFD3);
        }
        @Override
        public int[] fraccionsumarcomun(){
            //Variable Suma Fraccion Procedimiento 1-2 Alternativa 1
            int VSFP1A1 = VSFN1 + VSFN2 + VSFN3;
            int VSFP2A1 = VSFD1;
            System.out.println("Suma de fraccion comun de 3 fracciones y 6 variables");
            return new int [] {VSFP1A1, VSFP2A1};
        }
    }
    //Clase para sumar 3 variables de fraccion
    public class RSFV3 extends FraccionSuma{
        public RSFV3 (int VSFN1, int VSFN2, int VSFN3, int VSFD1, int VSFD2, int VSFD3){
            super(VSFN1, VSFN2, VSFN3, VSFD1, VSFD2, VSFD3);
        }
        @Override
        public int[] fraccionsumar(){
            //Variable Suma Fraccion Procedimiento 1 - 4 Alternativa 2
            int VSFP1A2 = VSFN1 * VSFD2 * VSFN3;
            int VSFP2A2 = VSFD1 * VSFN2 * VSFD3;
            int VSFP3A2 = VSFD1 * VSFD2 * VSFD1;
            int VSFP4A2 = VSFP1A2 + VSFP2A2;
            Sytem.out.println("Suma de fraccion de 3 fracciones y 6 variables");
            return new int[] {VSFP1A2, VSFP2A2, VSFP3A2, VSFP4A2};
        }
    }
    //Clase para sumar 2 variables de fraccion comun
    public class RSFV2C extends FraccionSuma{
        public RSFV2C (int VSFN1, int VSFN2, int VSFD1, int VSFD2){
            super(VSFN1, VSFN2, 0, VSFD1, VSFD2, 0);
        }
        @Override
        public int[] fraccionsumarcomun(){
            //Variable Suma Fraccion Procedimieto 1 - 2 Alternativa 1
            int VSFP1A2 = VSFN1 + VSFN2;
            int VSFP2A2 = VSFD1;
            Sytem.out.println("Suma de fraccion de 2 fracciones y 4 variables");
            return new int []{VSFP1A2 , VSFP2A2};
        }
    }
    //Clase para sumar 2 variables de fraccion
    public class RSFV2 extends FraccionSuma{
        public RSFV2 (int VSFN1, int VSFN2, int VSFD1, int VSFD2){
            super(VSFN1, VSFN2, 0, VSFD1, VSFD2, 0);
        }
        @Override
        public int[] fraccionsumar(){
            //Variable Suma Fraccion Procedimiento 1 - 4 Alternativa 2
            int VSFP1A2 = VSFN1 * VSFD2;
            int VSFP2A2 = VSFD1 * VSFN2;
            int VSFP3A1 = VSFD1 * VSFD2; 
            int VSFP4A2 = VSFP1A2 + VSFP2A2;
            Sytem.out.println("Suma de fraccion comun de 2 fracciones y 4 variables");
            return new int []{VSFP1A2, VSFP2A2, VSFP3A2, VSFP4A2};
        }
    }
}