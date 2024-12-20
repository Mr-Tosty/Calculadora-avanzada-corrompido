package Basico;
//Clase para la base multiplicacion
public abstract class Multiplicacion{
    //Vareiable Multiplicacion 1-6
    protected int VM1;
    protected int VM2;
    protected int VM3;
    protected int VM4;
    protected int VM5;
    protected int VM6;
    public Multiplicacion(int VM1, int VM2, int VM3, int VM4, int VM5, int VM6){
        this.VM1 = VM1;
        this.VM2 = VM2;
        this.VM3 = VM3;
        this.VM4 = VM4;
        this.VM5 = VM5;
        this.VM6 = VM6;
    }
    public abstract int multiplicar();//Metodo abstracto de multiplicar
    //Clase para multiplicar 6 variables
    public class RMV6 extends Multiplicacion{
        public RMV6 (int VM1, int VM2, int VM3, int VM4, int VM5, int VM6){
            super(VM1, VM2, VM3, VM4, VM5, VM6);
        }
        @Override
        public int multiplicar(){
            System.out.println("Multiplicacion de 6 variables");
            return VM1 * VM2 * VM3 * VM4 * VM5* VM6;
        }
    }
    //Clase para multiplicar 5 variables
    public class RMV5 extends Multiplicacion{
        public RMV5 (int VM1, int VM2, int VM3, int VM4, int VM5){
            super(VM1, VM2, VM3, VM4, VM5, 0);
        }
        @Override
        public int multiplicar(){
            System.out.println("Multiplicacion de 5 variables");
            return VM1 * VM2 * VM3 * VM4 * VM5;
        }
    }
    //Clase para multiplicar 4 variables
    public class RMV4 extends Multiplicacion{
        public RMV4 (int VM1, int VM2, int VM3, int VM4){
            super(VM1, VM2, VM3, VM4, 0, 0);
        }
        @Override
        public int multiplicar(){
            System.out.println("Multiplicacion de 4 variables");
            return VM1 * VM2 * VM3 * VM4;
        }
    }
    //Clase para multiplicar 3 variable
    public class RMV3 extends Multiplicacion{
        public RMV3 (int VM1, int VM2, int VM3){
            super(VM1, VM2, VM3, 0, 0, 0);
        }
        @Override
        public int multiplicar(){
            System.out.println("Multiplicacion de 3 variables");
            return VM1 * VM2 * VM3;
        }
    }
    //Clase para multiplicar 2 variables
    public class RMV2 extends Multiplicacion{
        public RMV2 (int VM1, int VM2){
            super(VM1, VM2, 0, 0, 0, 0);
        }
        @Override
        public int multiplicar(){
            System.out.println("Multiplicacion de 2 variables");
            return VM1 * VM2;
        }
    }
}