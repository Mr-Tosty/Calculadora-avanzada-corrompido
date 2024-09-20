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
        public FraccionSuma(){
            this.VSFN1 = VSFN1;
            this.VSFN2 = VSFN2;
            this.VSFN3 = VSFN3;
            this.VSFD1 = VSFD1;
            this.VSFD2 = VSFD2;
            this.VSFD3 = VSFD3;
        }
        public abstract int fraccionsumar();//Metodo abstracto de sumar fracciones
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
        public FraccionResta(){
            this.VRFN1 = VRFN1;
            this.VRFN2 = VRFN2;
            this.VRFN3 = VRFN3;
            this.VRFD1 = VRFD1;
            this.VRFD2 = VRFD2;
            this.VRFD3 = VRFD3;
        }
        public abstract int fraccionrestar();//Metodo abstracto de restar fracciones
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
        public FraccionMultiplicacion(){
            this.VMFN1 = VMFN1;
            this.VMFN2 = VMFN2;
            this.VMFN3 = VMFN3;
            this.VMFD1 = VMFD1;
            this.VMFD2 = VMFD2;
            this.VMFD3 = VMFD3;
        }
        public abstract int fraccionmultiplicar();//Metodo abstracto de multiplicar fracciones
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
        public FraccionDivision(){
            this.VDFN1 = VDFN1;
            this.VDFN2 = VDFN2;
            this.VDFN3 = VDFN3;
            this.VDFD1 = VDFD1;
            this.VDFD2 = VDFD2;
            this.VDFD3 = VDFD3;
        }
        public abstract int fracciondividir();//Metodo abstracto de multiplicar fracciones
    }
}