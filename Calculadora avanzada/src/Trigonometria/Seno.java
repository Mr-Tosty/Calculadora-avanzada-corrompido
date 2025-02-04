package Trigonometria;
public class TrigonometriaOperaciones{
    //Clase base de seno
    public abstract class Seno{
        //Variable Seno
        protected int VS;
        public Seno(int VS){
            this.VS = VS;
        }
        public abstract int seno(); //Metodo abstracto seno
    }
}