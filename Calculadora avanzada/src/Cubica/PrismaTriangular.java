package Cubica;
//Clase para la base prisma a triangular
public abstract class PrismaTriangular{
    //Variable Lado Prisma rectangular A
    protected int VLPrA;
    public PrismaTriangular(int VLPrA){
        this.VLPrA = VLPrA;
    }
    public abstract int prismatriangular();//Metodo abstracto prisma rectangular
}