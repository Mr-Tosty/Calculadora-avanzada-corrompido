package Cuadrada;
//Clase para la base trapecio
    public abstract class Trapecio{
    //Variable Trapecio B-b-H
    protected int VTB;
    protected int VTb;
    protected int VTH;
    public Trapecio(int VTB, int VTb, int VTH){
        this.VTB = VTB;
        this.VTb = VTb;
        this.VTH = VTH;
    }
    public abstract int[] trapecioarea();//Metodo abstracto trapecio area
    public abstract int[] trapecioperimetro();//Metodo abstracto trapecio perimetro
    //Clase para el area trapecio
    public class RTrA extends Trapecio{
        public RTrA (int VTB, int VTb, int VTH){
            super(VTB, VTb, VTH);
        }
        @Override
        public int[] trapecioarea(){
            //Variable Procedimiento Area Trapecio 1 - 3
            int VPATr1 = VTB + TVb;
            int VPATr2 = VPATr1 / 2;
            int VPATr3 = VTH * VPATr2;
            System.out.println("Area del trapecio");
            return new int[]{VPATr1, VPATr2, VPATr3};
        }
    }
    //Clase para el perimetro trapecio
    public class RTrP extends Trapecio{
        public RTrP (int VTB, int VTb, int VTH, int VTBA, int VTa){
            super(VTB, VTb, 0, VTBA);
            this.VTa = VTa;
        }
        @Override
        public int[] trapecioperimetro(){
            //Variable Procedimiento Perimetro Trapecio
            int VPPTr = VTB + VTb + VTa + VTa;
            System.out.println("Perimetro del trapecio");
            return new int[]{};
        }
    }
}