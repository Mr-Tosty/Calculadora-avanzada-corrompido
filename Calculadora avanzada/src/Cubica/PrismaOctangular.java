package Cubica;
//Clase para la base prisma octagonal
public abstract class PrismaOctagonal{
    //Variable Lado Prisma octagonal A
    protected int VLPoA;
    public PrismaOctagonal(int VLPoA){
        this.VLPoA = VLPoA;
    }
    public abstract int prismaoctagonal();//Metodo abstracto prisma octagonal
}