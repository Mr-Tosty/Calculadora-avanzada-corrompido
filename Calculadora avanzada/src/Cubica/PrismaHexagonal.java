package Cubica;
//Clase para la base prisma hexagonal
public abstract class PrismaHexagonal{
    //Variable Lado Prisma hexagonal A
    protected int VLPhA;
    public PrismaHexagonal(int VLPhA){
        this.VLPhA = VLPhA;
    }
    public abstract int prismahexagonal();//Metodo abstracto prisma hexagonal
}