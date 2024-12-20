package Basico;
//Clase base para la suma de variables
public abstract class Suma {
    //Variable Suma 1-6
    protected int VS1;
    protected int VS2;
    protected int VS3;
    protected int VS4;
    protected int VS5;
    protected int VS6;
    public Suma(int VS1, int VS2, int VS3, int VS4, int VS5, int VS6){
        this.VS1 = VS1;
        this.VS2 = VS2;
        this.VS3 = VS3;
        this.VS4 = VS4;
        this.VS5 = VS5;
        this.VS6 = VS6;
    }
    public abstract int sumar(); // Metodo abstracto para la suma
    //Clase para sumar 6 variables
    public class RSV6 extends Suma {
        public RSV6(int VS1, int VS2, int VS3, int VS4, int VS5, int VS6){
            super(VS1, VS2, VS3, VS4, VS5, VS6);
        }
        @Override
        public int sumar() {
            System.out.println("Suma de 6 variables");
            return VS1 + VS2 + VS3 + VS4 + VS5 + VS6;
        }
    }
    //Clase para sumar 5 variables
    public class RSV5 extends Suma {
        public RSV5(int VS1, int VS2, int VS3, int VS4, int VS5){
            super(VS1, VS2, VS3, VS4, VS5, 0); 
        }
        @Override
        public int sumar() {
            System.out.println("Suma de 5 variables");
            return VS1 + VS2 + VS3 + VS4 + VS5;
        }
    }
    //Clase para sumar 4 variables
    public class RSV4 extends Suma {
        public RSV4(int VS1, int VS2, int VS3, int VS4){
            super(VS1, VS2, VS3, VS4, 0, 0); 
        }
        @Override
        public int sumar() {
            System.out.println("Suma de 4 variables");
            return VS1 + VS2 + VS3 + VS4;
        }
    }
    //Clase para sumar 3 variables
    public class RSV3 extends Suma {
        public RSV3(int VS1, int VS2, int VS3){
            super(VS1, VS2, VS3, 0, 0, 0);
        }
        @Override
        public int sumar() {
            System.out.println("Suma de 3 variables");
            return VS1 + VS2 + VS3;
        }
    }
    //Clase para sumar 2 variables
    public class RSV2 extends Suma {
        public RSV2(int VS1, int VS2){
            super(VS1, VS2, 0, 0, 0, 0);
        }
        @Override
        public int sumar() {
            System.out.println("Suma de 2 variables");
            return VS1 + VS2;
        }
    }
}