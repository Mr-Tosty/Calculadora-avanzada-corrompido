package Cuadrada;
public class CuadradaOperaciones{
    //Clase para la base cuadrado
    public abstract class Cuadrado{
        //Variable Lado Cuadrado A
        protected int VLCA;
        public Cuadrado(int LCA){
            this.VLCA = VLCA;
        }
        public abstract int[] cuadradoarea();//Metodo abstracto cuadrado area
        public abstract int[] cuadradoperimetro();//Metodo abstracto cuadrado perimetro
    }
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
    //Clase para la base rectangulo
    public abstract class Rectangulo{
        //Variable Lado Rectangulo A-B
        protected int VLRA;
        protected int VLRB;
        public Rectangulo(int VLRA, int VLRB){
            this.VLRA = VLRA;
            this.VLRB = VLRB;
        }
        public abstract int[] rectanguloarea();//Metodo abstracto rectangulo area
        public abstract int[] rectanguloperimetro();//Metodo abstracto rectanguloperimetro
    }
    //Clase para el area rectangulo
    public class RRA extends Rectangulo{
        public RRA (int VLRA, int VLRB){
            super(VLRA, VLRB);
        }
        @Override
        public int[] cuadradoarea(){
            //Variable Procedimiento Area Rectangulo
            int VPAR = VLRA * VLRB;
            System.out.println("Area del rectangulo");
            return new int[]{VLRA};
        }
    }
    //Clase para el perimetro rectangulo
    public class RRP extends Rectangulo{
        public RRP (int VLRA, int VLRB){
            super(VLRA, VLRB);
        }
        @Override
        public int[] rectanguloperimetro(){
            //Variable Procedimiento Perimetro Rectangulo 1 - 2
            int VPPR1 = VLRA + VLRB;
            int VPPR2 = VPPR1 * 2;
            System.out.println("Perimetro del rectangulo");
            return new int[]{VPPR1, VPPR2};
        }
    }
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
    }
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
    //Clase para la base circulo
    public abstract class Circulo{
        //Variable Radio Circulo
        protected int VRC;
        public Circulo(int VRC){
            this.VRC = VRC;
        }
        public abstract int[] circuloarea();//Metodo abstracto circulo area
        public abstract int[] circuloperimetro();//Metodo abstracto circulo perimetro
    }
    //Clase para el area circulo
    public class RCoA extends Circulo{
        public RCoA (int VRC){
            super(VRC);
        }
        @Override
        public int[] circuloarea(){
            //Variable Procedimiento Area Circulo 1 - 2
            int VPACo1 = Math.pow(VRC, 2);
            int VPACo2 = VPACo1 * Math.PI;
            System.out.println("Area del circulo");
            return new int[]{VPACo1, VPACo2};
        }
    }
    //Clase para el perimetro circulo
    public class RCoP extends Circulo{
        public RCoP (int VRC){
            super(VRC);
        }
        @Override
        public int[] circuloperimetro(){
            //Variable Procedimiento Perimetro Circulo 1 - 3
            int VPPCo1 = VRC * Math;
            int VPPCo2 = VPPCo1 * 2;
            System.out.println("Perimetro del circulo");
            return new int[]{VPPCo1, VPPCo2};
        }
    }
    //Clase para la base de rombo
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
    }
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
    //Clase para la base romboide
    public abstract class Romboide{
        //Variable Romboide Lado B-b-h
        protected int VRoLB;
        protected int VRoLb;
        protected int VRoLH;
        public Romboide(int VRoLB, int VRoLb, int VRoLH){
            this.VRoLB = VRoLB;
            this.VRoLb = VRoLb;
            this.VRoLH = VRoLH
        }
        public abstract int[] romboidearea();//Metodo abstracto romboide area
        public abstract int[] romboideperimetro();//Metodo abstracto romboide perimetro
    }
    //Clase para el area romboide
    public class RRmA extends Romboide{
        public RRmA (int VRoLB, int VRoLb, int VRoLH){
            super(VRoLB, VRoLb, VRoLH);
        }
        @Override
        public int[] romboidearea(){
            //Variable Procedimiento Romboide Area 1 - 3
            int VPRmA1 = VRoLB + VRoLb;
            int VPRmA2 = VPRmA1 / 2;
            int VPRmA3 = VPRmA2 * VRoLH;
            System.out.println("Area romboide");
            return new int[]{VPRmA1, VPRmA2, VPRmA3};
        }
    }
    //Clase para el perimetro romboide
    public class RRmP extends Romboide{
        public RRmP (int VRoLB,int VRoLb, VRoLH){
            super(VRoLB, VRoLb, VRoLH);
        }
        @Override
        public int[] romboideperimetro(){
            //Variable Procedimiento Romboide Perimetro
            int VPRmP = VRoLB + VRoLb + VRoLH + VRoLH;
            System.out.println("Perimetro romboide");
            return new int[]{VPRmP};
        }
    }
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
    }
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
            this.VTa = badValueTag;
        }
        @Override
        public int[] trapecioperimetro(){
            //Variable Procedimiento Perimetro Trapecio
            int VPPTr = VTB + VTb + VTa + VTa;
            System.out.println("Perimetro del trapecio");
            return new int[]{};
        }
    }
    //Clase para la base pentagono
    public abstract class Pentagono{
        //Variable Pentagono Lado A-B
        protected int VPLA;
        protected int VPLB;
        public Pentagono(int VPLA, int VPLB){
            this.VPLA = VPLA;
            this.VPLB = VPLB;
        }
        public abstract int pentagonoarea();//Metodo abstracto pentagono area
        public abstract int pentagonoperimetro();//Metodo abstracto pentagono perimetro
    }
    //Clase para el area pentagono
    public class RPA extends Pentagono{
        public RPA (int VPLA, int VPLB){
            super(VLPA, VPLB);
        }
        @Override
        public int[] pentagonoarea{
            System.out.println("Area del pentagono");
            return new int[]{};
        }
    }
    //Clase para el perimetro pentagono
    public class RPP extends Pentagono{
        public RPP (int VPLA, int VPLB){
            super(VPLA, VPLB);
        }
        @Override 
        public int[] pentagonoperimetro{
            System.out.println("Perimetro del pentagono");
            return new int[]{};
        }
    }
    //Clase para la base hexagono
    public abstract class Hexagono{
        //Variable Hexagono Lado A-B
        protected int VHLA;
        protected int VHLB;
        public Hexagono(int VHLA, int VHLB){
            this.VHLA = VHLA;
            this.VHLB = VHLB;
        }
        public abstract int[] hexagonoarea();//Metodo abstracto hexagono area
        public abstract int[] hexagonoperimetro(); //Metodo abstracto hexagono perimetro
    }
    //Clase para el area hexagono
    public class RHA extends Hexagono{
        public RHA (int VHLA, int VHLB){
            super( VHLA, VHLB);
        }
        @Override
        public int[] hexagonoarea(){
            System.out.println("Area del hexagono")
            return new int[]{};
        }
    }
    //Clase para el perimetro hexagono
    public class RHP extends Hexagono{
        public RHP (int VHLA, int VHLB){
            super(VHLA, VHLB);
        }
        @Override
        public int[] hexagonoperimetro(){
            system.out.println("Perimetro del hexagono");
            return new int[]{};
        }
    }
    //Clase para la base deltoide
    public abstract class Deltoide{
        //Variable Deltoide d-D
        protected int VDd;
        protected int VDD;
        public Deltoide(int VDd, int VDD){
            this.VDd = VDd;
            this.VDD = VDD;
        }
        public abstract int[] deltoidearea();//Metodo abstracto deltoide area
        public abstract int[] deltoideperimetro();//Metodo abstracto deltoide perimetro
    }
    //Clase para el area de deltoide
    public class RDA extends Deltoide{
        public RDA (int VDd, int VDD){
            super(VDd, VDD);
        }
        @Override
        public int[] deltoidearea(){
            System.out.println("Area del deltoide");
            return new int[]{};
        }
    }
    //Clase para el perimetro deltoide
    public class RDP extends Deltoide{
        public RDP (int VDd, int VDD){
            super(VDd, VDd)
        }
        @Override
        public int[] deltoideperimetro(){
            System.out.println("Perimero del deltoide");
            return new int[]{}
        }
    }
}