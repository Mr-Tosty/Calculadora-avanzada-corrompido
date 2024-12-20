package Basico;
//Clase para la base de aleatorio
public abstract class Aleatorio{
    //Variable Aleatorio 1-6
    protected int VA1;
    protected int VA2;
    protected int VA3;
    protected int VA4;
    protected int VA5;
    protected int VA6;
    public Aleatorio(int VA1, int VA2, int VA3, int VA4, int VA5, int VA6){
        this.VA1 = VA1;
        this.VA2 = VA2;
        this.VA3 = VA3;
        this.VA4 = VA4;
        this.VA5 = VA5;
        this.VA6 = VA6;
    }
    public abstract int[] alearotizar();//Metodo abstracto de aletorio
    //Clase para 6 variables
    public class VAs6 extends Aleatorio{
        public VAs6(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            VA3 = (int) Math.random()*1000;
            VA4 = (int) Math.random()*1000;
            VA5 = (int) Math.random()*1000;
            VA6 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 6 variable");
            return new int[]{VA1, VA2, VA3, VA4, VA5, VA6};
        }
    }
    //Clase para 5 variables aleatorio
    public class VAs5 extends Aleatorio{
        public VAs5(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            VA3 = (int) Math.random()*1000;
            VA4 = (int) Math.random()*1000;
            VA5 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 5 variable");
            return new int[]{VA1, VA2, VA3, VA4, VA5};
        }
    }
    //Clase para 4 variables aleatorio
    public class VAs4 extends Aleatorio{
        public VAs4(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            VA3 = (int) Math.random()*1000;
            VA4 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 4 variable");
            return new int[]{VA1, VA2, VA3, VA4};
        }
    }
    //Clase para 3 variables aleatorio
    public class VAs3 extends Aleatorio{
        public VAs3(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            VA3 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 3 variable");
            return new int[]{VA1, VA2, VA3};
        }
    }
    //Clase para 2 variables aleatorio
    public class VAs2 extends Aleatorio{
        public VAs2(){
            super(0, 0, 0, 0, 0, 0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            VA2 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 2 variable");
            return new int[]{VA1, VA2};
        }
    }
    //Clase para 1 variables aleatorio
    public class VAs1 extends Aleatorio{
        public VAs1(int VA1){
            super(0, 0, 0, 0, 0 ,0);
        }
        @Override
        public int[] alearotizar(){
            VA1 = (int) Math.random()*1000;
            System.out.println("Aleatorio de 1 variable");
            return new int[]{VA1};
        }
    }
}