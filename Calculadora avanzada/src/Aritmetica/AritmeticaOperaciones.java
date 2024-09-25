package Aritmetica;
public class AritmeticaOperaciones{
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
        public abstract int fraccionsumar();//Metodo abstracto de sumar fracciones
        public abstract int fraccionsumarcomun();//Metodo abstracto de sumar fracciones comunes
    }   
    //Clase para sumar 3 variables de fraccion comun
    public class RSFV3C extends FraccionSuma{
        public RSFV3C (int VSFN1, int VSFN2, int VSFN3, int VSFD1, int VSFD2, int VSFD3){
            super(VSFN1, VSFN2, VSFN3, VSFD1, VSFD2, VSFD3);
        }
        @Override
        public int fraccionsumarcomun(){
            //Variable Suma Fraccion Procedimiento 1-2 Alternativa 1
            int VSFP1A1 = VSFN1 + VSFN2 + VSFN3;
            int VSFP2A1 = VSFD1;
            return VSFP1A1, VSFP2A1;
        }
    }
    //Clase para sumar 3 variables de fraccion
    public class RSFV3 extends FraccionSuma{
        public RSFV3 (int VSFN1, int VSFN2, int VSFN3, int VSFD1, int VSFD2, int VSFD3){
            super(VSFN1, VSFN2, VSFN3, VSFD1, VSFD2, VSFD3);
        }
        @Override
        public int fraccionsumar(){
            //Variable Suma Fraccion Procedimiento 1 - 3 Alternativa 2
            int VSFP1A2 = VSFN1 * VSFD2 * VSFN3;
            int VSFP2A2 = VSFD1 * VSFN2 * VSFD3;
            int VSFP3A2 = VSFD1 * VSFD2 * VSFP3;
            int VSFP4A2 = VSFP1A2 + VSFP2A2;
            return VSFP1A2, VSFP2A2, VSFP3A2, VSFP4A2;
        }
    }
    //Clase para sumar 2 variables de fraccion comun
    public class RSFV2C extends FraccionSuma{
        public RSFV2C (int VSFN1, int VSFN2, int VSFD1, int VSFD2){
            super(VSFN1, VSFN2, 0, VSFD1, VSFD2, 0);
        }
        @Override
        public int fraccionsumarcomun(){
            
        }
    }
    //Clase para sumar 2 variables de fraccion
    public class RSFV2 extends FraccionSuma{
        public RSFV2 (int VSFN1, int VSFN2, int VSFD1, int VSFD2){
            super(VSFN1, VSFN2, 0, VSFD1, VSFD2, 0);
        }
        @Override
        public int fraccionsumar(){
            
        }
    }
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
        public abstract int fraccionrestar();//Metodo abstracto de restar fracciones
        public abstract int fraccionrestarcomun();//Metodo asbtracto restar fracciones comun
    }
    //Clase para restar 3 variables de fraccion comun
    public class RRFV3C extends FraccionResta{
        public RRFV3C (int VRFN1, int VRFN2, int VRFN3, int VRFD1, int VRFD2, int VRFD3){
            super(VRFN1, VRFN2, VRFN3, VRFD1, VRFD2, VRFD3);
        }
        @Override
        public int fraccionrestar(){
            //Variable Resta Fraccion Procedimiento 1-2 Alternativa 1
            int VRFP1A1 = VRFN1 - VRFN2 - VRFN3;
            int VRFP2A1 = VRFD1;
            return VRFP1A1, VRFP2A1;
        }
    }
    //Clase para retsar 3 variables de fraccion
    public class RRFV3C extends FraccionResta{
        public RRFV3C (int VRFN1, int VRFN2, int VRFN3, int VRFD1, int VRFD2, int VRFD3){
            super(VRFN1, VRFN2, VRFN3, VRFD1, VRFD2, VRFD3);
        }
        @Override
        public int fraccionrestar(){
            //Variable Resta Fraccion Procedimiento 1 - 3 Alternativa 2
            int VRFP1A2 = VRFN1 * VRFD2 * VRFN3;
            int VRFP2A2 = VRFD1 * VRFN2 * VRFD3;
            int VRFP3A2 = VRFD1 * VRFD2 * VRFP3;
            int VRFP4A2 = VRFP1A2 - VRFP2A2;
            return VRFP1A2, VRFP2A2, VRFP3A2, VRFP4A2;
        }
    }
    //Clase para restar 2 variables de fraccion comun
    public class RRFV2C extends FraccionResta{
        public RRFV2C (int VRFN1, int VRFN2, int VRFD1, int VRFD2){
            super(VRFN1, VRFN2, 0, VRFD1, VRFD2, 0);
        }
        @Override
        public int fraccionrestarcomun(){
            
        }
    }
    //Clase para restar 2 variables de fraccion
    public class RRFV2 extends FraccionResta{
        public RRFV2 (int VRFN1, int VRFN2, int VRFD1, int VRFD2){
            super(VRFN1, VRFN2, 0, VRFD1, VRFD2, 0);
        }
        @Override
        public int fraccionrestar(){
            
        }
    }
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
        public abstract int fraccionmultiplicar();//Metodo abstracto de multiplicar fracciones
    }
    //Clase para multiplicar 3 variables de fraccion
    public class RMFV3 extends FraccionMultiplicacion{
        public RMFV3 (int VMFN1, int VMFN2, int VMFN3, int VMFD1, int VMFD2, int VMFD3){
            super(VMFN1, VMFN2, VMFN3, VMFD1, VMFD2, VMFD3);
        }
        @Override
        public int fraccionmultiplicar(){
            
        }
    }
    //Clase para multiplicar 2 variables de fraccion
    public class RMFV2 extends FraccionMultiplicacion{
        public RMFV2 (int VMFN1, int VMFN2, int VMFD1, int VMFD2){
            super(VMFN1, VMFN2, 0, VMFD1, VMFD2, 0);
        }
        @Override
        public int fraccionmultiplicar(){
            
        }
    }
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
        public abstract int fracciondividir();//Metodo abstracto de multiplicar fracciones
    }
    //Clase para dividir 3 variables de fraccion
    public class RDFV3 extends FraccionDivision{
        public RDFV3 (int VDFN1, int VDFN2, int VDFN3, int VDFD1, int VDFD2, int VDFD3){
            super(VDFN1, VDFN2, VDFN3, VDFD1, VDFD2, VDFD3);
        }
        @Override
        public int fracciondividir(){
            
        }
    }
    //Clase para dividir 2 variables de fraccion
    public class RDFV2 extends FraccionDivision{
        public RDFV2 (int VDFN1, int VDFN2, int VDFD1, int VDFD2){
            super(VDFN1, VDFN2, 0, VDFD1, VDFD2, 0);
        }
        @Override
        public int fracciondividir(){
            
        }
    }
}