package Cuadrada;
//Clase base para el rombo
public abstract class Rombo{
    //Variable Rombo Lado D-d
    protected int VRLD;
    protected int VRLd;
    public Rombo(int VRLD, int VRLd){
        this.VRLD = VRLD;
        this.VRLd = VRLd;
    }
    public abstract int[] romboarea();//Metodo abstracto rombo area
    public abstract int[] romboperimetro();//Metodo abstracto rombo perimetro
    //Clase para el area rombo
    public class RRoA extends Rombo{
        public RRoA (int VRLD, int VRLd){
            super(VRLD, VRLd);
        }
        @Override
        public int[] romboarea(){
            //Variable Procedimiento Area Rombo 1 - 2
            int VPARo1 = VRLD * VRLd;
            if(VPARo1 == 0){
                System.out.println("Invalido la division");
                JOptionPane.showMessageDialog(null, "Error: No se debe dividir entre 0",
                    "Division invalida", JOptionPane.ERROR_MESSAGE);
                throw new ArithmeticException("No se puede dividir entre 0");
                return -1;
            }else{
                int VPARo2 = VPARo1 / 2;
                System.out.println("Area del rombo");
                return new int[]{VPARo1, VPARo2};
            }
        }
    }
    //Clase para el perimetro rombo
    public class RRoP extends Rombo{
        public RRoP (int VRLD, int VRLd, int VRL, int VPPRo){
            super(0, 0, VRL);
            this.VRL = VRL;
            this.VPPRo = VPPRo;
        }
        @Override
        public int[] romboperimetro(){
            //Variable Rombo Lados
            int VRL;
            //Repetir Procedimiento Perimetro Rombo
            //Variable Procedimiento Perimetro Rombo
            int VPPRo = 0;
            for(int RPPRo = 0; RPPRo <= 4; RPPRo++){
                VPPRo += VRL;
            }
            System.out.println("Perimetro del rombo");
            return new int[]{VPPRo};
        }
    }
}