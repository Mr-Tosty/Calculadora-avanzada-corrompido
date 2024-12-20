package Cubica;
public class CubicaOperaciones{
    //Clase para la base cubo
    public abstract class Cubo{
        //Variable Lado Cuadrado A
        protected int VLCA;
        public Cubo(int VLCA){
            this.VLCA = VLCA;
        }
        public abstract int cubo();//Metodo abstracto cubo
    }
    //Clase para la base cono
    public abstract class Cono{
        //Variable Lado Cono A
        protected int VLCoA;
        public Cono(int VLCoA){
            this.VLCoA = VLCoA;
        }
        public abstract int cono();//Metodo abstracto cono
    }
    //Clase para la base esfera
    public abstract class Esfera{
        //Variable Lado Esfera A
        protected int VLEA;
        public Esfera(int VLEA){
            this.VLEA = VLEA;
        }
        public abstract int esfera();//Metodo abstracto esfera
    }
    //Clase para la base cilindro
    public abstract class Cilindro{
        //Variable Lado Cilindro A
        protected int VLCiA;
        public Cilindro(int VLCiA){
            this.VLCiA = VLCiA;
        }
        public abstract int cilindro();//Metodo abstracto Cilindro
    }
    //Clase para la base prisma rectangular
    public abstract class PrismaRectangular{
        //Variable Lado Prisma rectangular A
        protected int VLPA;
        public PrismaRectangular(int VLPA){
            this.VLPA = VLPA;
        }
        public abstract int prismarectangular();//Metodo abstracto prisma rectangular
    }
    //Clase para la base prisma a triangular
    public abstract class PrismaTriangular{
        //Variable Lado Prisma rectangular A
        protected int VLPrA;
        public PrismaTriangular(int VLPrA){
            this.VLPrA = VLPrA;
        }
        public abstract int prismatriangular();//Metodo abstracto prisma rectangular
    }
    //Clase para la base prisma pentagonal
    public abstract class PrismaPentagonal{
        //Variable Lado Prisma rectangular A
        protected int VLPpA;
        public PrismaPentagonal(int VLPpA){
            this.VLPpA = VLPpA;
        }
        public abstract int prismapentagonal();//Metodo abstracto prisma pentagonal
    }
    //Clase para la base prisma hexagonal
    public abstract class PrismaHexagonal{
        //Variable Lado Prisma hexagonal A
        protected int VLPhA;
        public PrismaHexagonal(int VLPhA){
            this.VLPhA = VLPhA;
        }
        public abstract int prismahexagonal();//Metodo abstracto prisma hexagonal
    }
    //Clase para la base prisma octagonal
    public abstract class PrismaOctagonal{
        //Variable Lado Prisma octagonal A
        protected int VLPoA;
        public PrismaOctagonal(int VLPoA){
            this.VLPoA = VLPoA;
        }
        public abstract int prismaoctagonal();//Metodo abstracto prisma octagonal
    }
    //Clase para la base piramide cuadrado
    public abstract class PiramideCuadrado{
        //Variable Lado Piramide cuadrado A
        protected int VLPiA;
        public PiramideCuadrado(int VLPiA){
            this.VLPiA = VLPiA;
        }
        public abstract int piramidecuadrado();//Metodo abstracto piramide cuadrado
    }
    //Clase para la base piramide triangular
    public abstract class PiramideTriangular{
        //Variable Lado Piramide triangular A
        protected int VLPitA;
        public PiramideTriangular(int VLPitA){
            this.VLPitA = VLPitA;
        }
        public abstract int piramidetriangular();//Metodo abstracto piramide triangular
    }
    //Clase para la base piramide rectangular
    public abstract class PiramideRectangular{
        //Variable Lado Piramide rectangular A
        protected int VLPirA;
        public PiramideRectangular(int VLPirA){
            this.VLPirA = VLPirA;
        }
        public abstract int piramiderectangular();//Metodo abstracto piramide rectangular
    }
    //Clase para la base piramide octangular
    public abstract class PiramideOctagonal{
        //Variable Lado Piramide octagonal A
        protected int VLPioA;
        public PiramideOctagonal(int VLPioA){
            this.VLPioA = VLPioA;
        }
        public abstract int piramideoctagonal();//Metodo abstracto piramide octagonal
    }
    //Clase para la base piramide hexagonal
    public abstract class PiramideHexagonal{
        //Variable Lado Piramide hexagonal A
        protected int VLPihA;
        public PiramideHexagonal(int VLPihA){
            this.VLPihA = VLPihA;
        }
        public abstract int piramidehexagonal();//Metodo abstracto piramide hexagonal
    }
}