package Basico;
import dependencies.java.util.ArrayList;
import dependencies.java.util.List;
public class BasicoOperaciones {
    // Clase base para la suma de variables
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
    }
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
    //Clase para la base resta
    public abstract class Resta{
        //Variable Resta 1-6
        protected int VR1;
        protected int VR2;
        protected int VR3;
        protected int VR4;
        protected int VR5;
        protected int VR6;
        public Resta (int VR1, int VR2, int VR3, int VR4, int VR5, int VR6){
            this.VR1 = VR1;
            this.VR2 = VR2;
            this.VR3 = VR3;
            this.VR4 = VR4;
            this.VR5 = VR5;
            this.VR6 = VR6;
        }
        public abstract int restar(); //Metodo abstracto de restar
    }
    //Clase para restar 6 variables
    public class RRV6 extends Resta{
        public RRV6(int VR1, int VR2, int VR3, int VR4, int VR5, int VR6){
            super(VR1, VR2, VR3, VR4, VR5, VR6);
        }
        @Override
        public int restar(){
            System.out.println("Resta de 6 variables");
            return VR1 - VR2 - VR3 - VR4 - VR5 - VR6;
        }
    }
    //Clase para restar 5 variables
    public class RRV5 extends Resta{
        public RRV5(int VR1, int VR2, int VR3, int VR4, int VR5){
            super(VR1, VR2, VR3, VR4, VR5, 0);
        }
        @Override
        public int restar(){
            System.out.println("Reta de 5 variables");
            return VR1 - VR2 - VR3 - VR3 - VR5;
        }
    }
    //Clase para restar 4 variables
    public class RRV4 extends Resta{
        public RRV4 (int VR1, int VR2, int VR3, int VR4){
            super(VR1, VR2, VR3, VR4, 0, 0);
        }
        @Override
        public int restar(){
            System.out.println("Resta de 4 variables");
            return VR1 - VR2 - VR3 - VR4;
        }
    }
    //Clase para restar 3 variables
    public class RRV3 extends Resta{
        public RRV3 (int VR1, int VR2, int VR3){
            super(VR1, VR2, VR3, 0, 0, 0);
        }
        @Override
        public int restar(){
            System.out.println("Resta de 3 variables");
            return VR1 - VR2 - VR3;
        }
    }
    //Clase para restar 2 variables
    public class RRV2 extends Resta{
        public RRV2 (int VR1, int VR2){
            super(VR1, VR2, 0, 0, 0, 0);
        }
        @Override
        public int restar(){
            System.out.println("Resta de 2 variables");
            return VR1 - VR2;
        }
    }
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
    }
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
    //Clase para la base de division
    public abstract class Division{
        //Variable Division 1-6
        protected int VD1;
        protected int VD2;
        protected int VD3;
        protected int VD4;
        protected int VD5;
        protected int VD6;
        public Division(int VD1, int VD2, int VD3, int VD4, int VD5, int VD6){
            this.VD1 = VD1;
            this.VD2 = VD2;
            this.VD3 = VD3;
            this.VD4 = VD4;
            this.VD5 = VD5;
            this.VD6 = VD6;
        }
        public abstract int dividir();//Metodo abstracto de dividir
    }
    //Clase para dividir 6 variables
    public class RDV6 extends Division{
        public RDV6 (int VD1, int VD2, int VD3, int VD4, int VD5, int VD6){
            super(VD1, VD2, VD3, VD4, VD5, VD6);
        }
        @Override
        public int dividir(){
            if (VD2 == 0 || VD3 == 0 || VD4 == 0 || VD5 == 0 || VD6 == 0) {
                throw new ArithmeticException("No se puede dividir entre 0");
            }
            System.out.println("Division de 6 variables");
            return VD1 / VD2 / VD3 / VD4 / VD5 / VD6;
        }
    }
    //Clase para dividir 5 variables
    public class RDV5 extends Division{
        public RDV5 (int VD1, int VD2, int VD3, int VD4, int VD5){
            super(VD1, VD2, VD3, VD4, VD4, 1);
        }
        @Override
        public int dividir(){
            if (VD2 == 0 || VD3 == 0 || VD4 == 0 || VD5 == 0){
                throw new ArithmeticException("No se puede dividir entre 0");
            }
            System.out.println("Division de 5 variables");
            return VD1 / VD2 / VD3 / VD4 / VD5;
        }
    }
    //Clase para dividir 4 variables
    public class RDV4 extends Division{
        public RDV4 (int VD1, int VD2, int VD3, int VD4){
            super(VD1, VD2, VD3, VD4, 1, 1);
        }
        @Override
        public int dividir(){
            if(VD2 == 0 || VD3 == 0 || VD4 == 0){
                throw new ArithmeticException("No se puede dividir entre 0");
            }
            System.out.println("Division de 4 variables");
            return VD1 / VD2 / VD4 / VD3 / VD4;
        }
    }
    //Clase para dividir 3 variables
    public class RDV3 extends Division{
        public RDV3 (int VD1, int VD2, int VD3){
            super(VD1, VD2, VD3, 1, 1, 1);
        }
        @Override
        public int dividir(){
            if(VD2 == 0 || VD3 == 0){
                throw new ArithmeticException("No se puede dividir entre 0");
            }
            System.out.println("Division de 3 variables");
            return VD1 / VD2 / VD3 / VD3;
        }
    }
    //Clase para dividir 2 variables
    public class RDV2 extends Division{
        public RDV2(int VD1, int VD2){
            super(VD1, VD2, 1, 1, 1, 1);
        }
        @Override
        public int dividir(){
            if(VD2 == 0){
                throw new ArithmeticException("No se puede dividir entre 0");
            }
            System.out.println("Division de 2 variables");
            return VD1 / VD2;
        }
    }
    //CLase para la base de redondeo
    public abstract class Redondeo{
        //Variable redondeo 1-6
        protected double VRe1;
        protected double VRe2;
        protected double VRe3;
        protected double VRe4;
        protected double VRe5;
        protected double VRe6;
        public Redondeo(double VRe1, double VRe2, double VRe3, double VRe4, double VRe5, double VRe6){
            this.VRe1 = VRe1;
            this.VRe2 = VRe2;
            this.VRe3 = VRe3;
            this.VRe4 = VRe4;
            this.VRe5 = VRe5;
            this.VRe6 = VRe6;
        }
        public abstract int[] redondear();//Metodo abstracto de redondeo
    }
    //Clase para redondear 6 variables
    public class VRo6 extends Redondeo{
        public VRo6(double VRe1, double VRe2, double VRe3, double VRe4, double VRe5, double VRe6){
            super(VRe1, VRe2, VRe3, VRe4, VRe5, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 6 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2),
                (int) Math.round(VRe3),
                (int) Math.round(VRe4),
                (int) Math.round(VRe5),
                (int) Math.round(VRe6)
            };
        }
    }
    //Clase para redondear 5 variables
    public class VRo5 extends Redondeo{
        public VRo5(double VRe1, double VRe2, double VRe3, double VRe4, double VRe5){
            super(VRe1, VRe2, VRe3, VRe4, VRe5, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 5 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2),
                (int) Math.round(VRe3),
                (int) Math.round(VRe4),
                (int) Math.round(VRe5)
            };
        }
    }
    //Clase para redondear 4 variables
    public class VRo4 extends Redondeo{
        public VRo4(double VRe1, double VRe2, double VRe3, double VRe4){
            super(VRe1, VRe2, VRe3, VRe4, 0, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 4 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2),
                (int) Math.round(VRe3),
                (int) Math.round(VRe4)
            };
        }
    }
    //Clase para redondear 3 variables
    public class VRo3 extends Redondeo{
        public VRo3(double VRe1, double VRe2, double VRe3){
            super(VRe1, VRe2, VRe3, 0 ,0 ,0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 3 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2),
                (int) Math.round(VRe3)
            };
        }
    }
    //Clase para redondear 2 variables
    public class VRo2 extends Redondeo{
        public VRo2(double VRe1, double VRe2){
            super(VRe1, VRe2, 0, 0, 0, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 2 variable");
            return new int[]{
                (int) Math.round(VRe1),
                (int) Math.round(VRe2)
            };
        }
    }
    //Clase para redondear 1 variables
    public class VRo1 extends Redondeo{
        public VRo1(double VRe1){
            super(VRe1, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] redondear(){
            System.out.println("Redondear 1 variable");
            return new int[]{
                (int) Math.round(VRe1)
            };
        }
    }
    //Clase para la base de aleatorio
    public abstract class Aleatorio{
        //Variable Aleatorio 1-6
        protected int VA1;
        protected int VA2;
        protected int VA3;
        protected int VA4;
        protected int VA5;
        protected int VA6;
        public Aleatorio(int VA1, int VA2, int VA3, int VA4, int VA5, int VA6){
            this.VA1 = VA1;
            this.VA2 = VA2;
            this.VA3 = VA3;
            this.VA4 = VA4;
            this.VA5 = VA5;
            this.VA6 = VA6;
        }
        public abstract int[] alearotizar();//Metodo abstracto de aletorio
    }
    //Clase para 6 variables
    public class VAs6 extends Aleatorio{
        public VAs6(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            VA3 = (int) Math.random()*1000;
            VA4 = (int) Math.random()*1000;
            VA5 = (int) Math.random()*1000;
            VA6 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 6 variable");
            return new int[]{VA1, VA2, VA3, VA4, VA5, VA6};
        }
    }
    //Clase para 5 variables aleatorio
    public class VAs5 extends Aleatorio{
        public VAs5(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            VA3 = (int) Math.random()*1000;
            VA4 = (int) Math.random()*1000;
            VA5 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 5 variable");
            return new int[]{VA1, VA2, VA3, VA4, VA5};
        }
    }
    //Clase para 4 variables aleatorio
    public class VAs4 extends Aleatorio{
        public VAs4(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            VA3 = (int) Math.random()*1000;
            VA4 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 4 variable");
            return new int[]{VA1, VA2, VA3, VA4};
        }
    }
    //Clase para 3 variables aleatorio
    public class VAs3 extends Aleatorio{
        public VAs3(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            VA3 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 3 variable");
            return new int[]{VA1, VA2, VA3};
        }
    }
    //Clase para 2 variables aleatorio
    public class VAs2 extends Aleatorio{
        public VAs2(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 2 variable");
            return new int[]{VA1, VA2};
        }
    }
    //Clase para 1 variables aleatorio
    public class VAs1 extends Aleatorio{
        public VAs1(int VA1){
            super(0, 0, 0, 0, 0 ,0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 1 variable");
            return new int[]{VA1};
        }
    }
    //Clase para la base de cantidad de digitos
    public abstract class Digitos{
        private int VDi1;
        private int VDi2;
        private int VDi3;
        private int VDi4;
        private int VDi5;
        private int VDi6;
        public  Digitos(int VDi1, int VDi2, int VDi3, int VDi4, int VDi5, int VDi6){
            //Variable Digitos 1-6
            this.VDi1 = VDi1;
            this.VDi2 = VDi2;
            this.VDi3 = VDi3;
            this.VDi4 = VDi4;
            this.VDi5 = VDi5;
            this.VDi6 = VDi6;
        }
        public abstract List<Integer> digitos();//Metodo abstracto de cantidad de digitos
    }
    //Clase para 6 digitos
    public class RVD6 extends Digitos{
        public RVD6 (int VDi1, int VDi2, int VDi3, int VDi4, int VDi5, int VDi6){
            super(VDi1, VDi2, VDi3, VDi4, VDi5, VDi6);
        }
        @Override
        public List<Integer> digitos(){
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.ValueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi2())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi3())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi4())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi5())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi6())).length());
            return cantidadDigitos;
        }
    }
    //Clase para 5 digitos
    public class RVD5 extends Digitos{
        public RVD5 (int VDi1, int VDi2, int VDi3, int VDi4, int VDi5){
            super(VDi1, VDi2, VDi3, VDi4, VDi5, 0);
        }
        @Override
        public List<Integer> digitos(){
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super,getVDi2())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi3())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi4())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi5())).length());
            return cantidadDigitos;
        }
    }
    //Clase para 4 digitos
    public class RVD4 extends Digitos{
        public RVD4 (int VDi1, int VDi2, int VDi3, int VDi4){
            super(VDi1, VDi2, VDi3, VDi4, 0, 0);
        }
        @Override
        public List<Integer> digitos(){
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super,getVDi2())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi3())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi4())).length());
            return cantidadDigitos;
        }
    }
    //Clase para 3 digitos
    public class RVD3 extends Digitos{
        public RVD3 (int VDi1, int VDi2, int VDi3){
            super(VDi1, VDi2, VDi3, 0, 0, 0);
        }
        @Override
        public List<Integer> digitos(){
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super,getVDi2())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi3())).length());
            return cantidadDigitos;
        }
    }
    //Clase para la base 2 digitos
    public class RVD2 extends Digitos{
        public RVD2 (int VDi1, int VDi2){
            super(VDi1, VDi2, 0, 0, 0, 0);
        }
        @Override
        public List<Integer> digitos(){
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super,getVDi2())).length());
            return cantidadDigitos;
        }
    }
    //Clase para la base 1 digito
    public class RVD1 extends Digitos{
        public RVD1 (int VDi1){
            super(VDi1, 0, 0, 0, 0, 0);
        }
        @Override
        public List<Integer> digitos(){
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            return cantidadDigitos;
        }
    }
}