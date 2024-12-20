package Cuadrada;
//Clase para la base triangulo
public abstract class Triangulo{
    //Variables Lado Triangulo A-B
    protected int VLTA;
    protected int VLTB;
    public Triangulo(int VLTA, int VLTB){
        this.VLTA = VLTA;
        this.VLTB = VLTB;
    }
    public abstract int[] trianguloarea();//Metodo abstracto triangulo area
    public abstract int[] trianguloperimetro();//Metodo abstracto triangulo perimetro
    //Clase para el area triangulo
    public class RTA extends Triangulo{
        public RTA (int VLTA, int VLTB){
            super(VLTA, VLTB);
        }
        @Override
        public int[] trianguloarea(){
            //Variable Procedimiento Area Triangulo 1 - 2
            int VPAT1 = VLTA + VLTB;
            int VPAT2 = VPAT1 / 2;
            System.out.println("Area del triangulo");
            return new int[]{VPAT1, VPAT2};
        }
    }
    //Clase para el perimetro triangulo
    public class RTP extends Triangulo{
        public RTP (int VLTA, int VLTB, int VPPT){
            super(VLTA, 0, VPPT);
            this.VPPT = VPPT;
        }
        @Override
        public int[] trianguloperimetro(){
            //Repetir Procedimiento Perimetro Triangulo
            //Variable Procedimiento Perimetro Triangulo
            int VPPT = 0;
            for(int RPPT; RPPT <= 3; RPPT++){
                VPPT += VLTA;
            }
            System.out.println("Perimetro del triangulo");
            return new int[]{VPPT};
        }
    }
}