package Basico;
import java.util.ArrayList;
import java.util.List;
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
        this.VDi3 = DVi3;
        this.VDi4 = VDi4;
        this.VDi5 = VDi5;
        this.VDi6 = VDi6;
    }
    public abstract List<Integer> digitos();//Metodo abstracto de cantidad de digitos
    //Clase para 6 digitos
    public class RVD6 extends Digitos{
        public RVD6 (int VDi1, int VDi2, int VDi3, int VDi4, int VDi5, int VDi6){
            super(VDi1, VDi2, VDi3, VDi4, VDi5, VDi6);
        }
        @Override
        public List<Integer> digitos(){
            System.out.println("Cantidad de digitos 6 variables");
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
            System.out.println("Cantidad de digitos 5 variabes");
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi2())).length());
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
            Sytem.out.println("Cantidad de digitos 4 variables");
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi2())).length());
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
            Sytem.out.println("Cantidad de digitos 3 variables");
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi2())).length());
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
            Sytem.out.println.("Cantidad de digitos 2 variables");
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            cantidadDigitos.add(String.valueOf(Math.abs(super.getVDi2())).length());
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
            Sytem.out.println("Cantidad de digitos 1 variable");
            List<Integer> cantidadDigitos = new ArrayList<>();
            cantidadDigitos.add(String.valueOf(Math.abs(super.getDVi1())).length());
            return cantidadDigitos;
        }
    }
}