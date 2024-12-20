package Cuadrada;
//Clase para la base cuadrado
public abstract class Cuadrado{
    //Variable Lado Cuadrado A
    protected int VLCA;
    public Cuadrado(int LCA){
        this.VLCA = VLCA;
    }
    public abstract int[] cuadradoarea();//Metodo abstracto cuadrado area
    public abstract int[] cuadradoperimetro();//Metodo abstracto cuadrado perimetro
    //Clase para el area cuadrado
    public class RAC extends Cuadrado{
        public RAC (int VLCA){
            super(VLCA);            
        }
        @Override
        public int[] cuadradoarea(){
            //Variable Procedimiento Area Cuadrado 1
            int VPAC = VLCA * 2;
            System.out.println("Area del cuadrado");
            return new int[]{VPAC};
        }
    }
    //Clase para el perimetro cuadrado
    public class RPC extends Cuadrado{
        public RPC (int VLCA, int VPPC){
            super(VLCA);
            this.VPPC = VPPC;
        }
        @Override
        public int[] cuadradoperimetro(){
            //Repetir Procedimiento Perimetro Cuadrado
            //Variable Procedimiento Perimetro Cuadrado
            int VPPC = 0;
            for(int RPPC; RPPC <= 4; RPPC++){ 
                VPPC += VLCA;
            }
            System.out.println("Perimetro del cuadrado");
            return new int[]{VPPC};
        }
    }
}