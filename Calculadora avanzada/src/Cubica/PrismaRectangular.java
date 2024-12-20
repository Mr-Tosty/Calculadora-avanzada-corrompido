package Cubica;
//Clase para la base prisma rectangular
public abstract class PrismaRectangular{
    //Variable Lado Prisma rectangular A
    protected int VLPA;
    public PrismaRectangular(int VLPA){
        this.VLPA = VLPA;
    }
    public abstract int prismarectangular();//Metodo abstracto prisma rectangular
}