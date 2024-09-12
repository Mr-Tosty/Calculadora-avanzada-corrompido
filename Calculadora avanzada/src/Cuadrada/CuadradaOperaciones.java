package Cuadrada;
public class CuadradaOperaciones{
    //Clase para la base cuadrado
    public abstract class Cuadrado{
        //Variable Lado Cuadrado A
        protected int VLCA;
        public Cuadrado(int LCA){
            this.LCA = LCA;
        }
        public abstract int cuadrado();//Metodo abstracto cuadrado
    }
    //Clase para el area cuadrado
    //Clase para el perimetro cuadrado
    //Clase para la base rectangulo
    public abstract class Rectangulo{
        //Variable Lado Rectangulo A-B
        protected int VLRA;
        protected int VLRB;
        public Rectangulo(int VLCA, int VLRB){
            this.VLRA = VLRA;
            this.VLRB = VLRB;
        }
        public abstract int rectangulo();//Metodo abstracto rectangulo
    }
    //Clase para el area rectangulo
    //Clase para el perimetro rectangulo
    //Clase para la base triangulo
    public abstract class Triangulo{
        //Variables Lado Triangulo A-B
        protected int VLTA;
        protected int VLTB;
        public Triangulo(int VLTA, int VLTB){
            this.VLTA = VLTA;
            this.VLTB = VLTB;
        }
        public abstract int triangulo();//Metodo abstracto triangulo
    }
    //Clase para el area triangulo
    //Clase para el perimetro triangulo
    //Clase para la base circulo
    public abstract class Circulo{
        //Variable Radio Circulo
        protected int VRC;
        public Circulo(int VRC){
            this.VRC = VRC;
        }
        public abstract int circulo();//Metodo abstracto circulo
    }
    //Clase para el area circulo
    //Clase para el perimetro circulo
    //Clase para la base de rombo
    public abstract class Rombo{
        //Variable Rombo Lado D-d
        protected int VRLD;
        protected int VRLd;
        public Rombo(int VRLD, int VRLd){
            this.VRLD = VRLD;
            this.VRLd = VRLd;
        }
        public abstract int rombo();//Metodo abstracto rombo
    }
    //Clase para el marea rombo
    //Clase para el perimetro rombo
    //Clase para la base romboide
    public abstract class Romboide{
        //Variable Romboide Lado A-B
        protected int VRoLA;
        protected int VRoLB;
        public Romboide(int VRoLA, int VRoLB){
            this.VRoLA = VRoLA:
            this.VRoLB = VRoLB;
        }
        public abstract int romboide();//Metodo abstracto romboide
    }
    //Clase para el area romboide
    //Clase para el perimetro romboide
    //Clase para la base trapecio
    public abstract class Trapecio{
        //Variable Trapecio A-B
        protected int VTA;
        protected int VTB;
        public Trapecio(int VTA, int VTB){
            this.VTA = VTA;
            this.VTB = VTB;
        }
        public abstract int trapecio();//Metodo abstracto trapecio
    }
    //Clase para el area trapecio
    //Clase para el perimetro trapecio
    //Clase para la base pentagono
    public abstract class Pentagono{
        //Variable Pentagono Lado A-B
        protected int VPLA;
        protected int VPLB;
        public Pentagono(int VPLA, int VPLB){
            this.VPLA = VPLA;
            this.VPLB = VPLB;
        }
        public abstract int pentagono();//Metodo abstracto pentagono
    }
    //Clase para el area pentagono
    //Clase para el perimetro pentagono
    //Clase para la base hexagono
    public abstract class Hexagono{
        //Variable Hexagono Lado A-B
        protected int VHLA;
        protected int VHLB;
        public abstract int Hexagono(int VHLA, int VHLB){
            this.VHLA = VHLA;
            this.VHLB = VHLB;
        }
        public abstract int hexagono();
    }
    //Clase para el area hexagono
    //Clase para el perimetro hexagono
    //Clase para la base deltoide
    public abstract class Deltoide{
        //Variable Deltoide d-D
        protected int VDd;
        protected int VDD;
        public abstract Deltoide(int VDd, int VDD){
            this.VDd = VDd;
            this.VDD = VDD;
        }
        public abstract int deltoide();//Metodo abstracto deltoide
    }
    //Clase para el area de deltoide
    //Clase para el perimetro deltoide
}