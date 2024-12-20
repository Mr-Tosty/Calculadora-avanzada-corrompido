package Basico;
import javax.swing.JOptionPane;
//Clase para la base de division
public abstract class Division{
    //Variable Division 1-6
    protected int VD1;
    protected int VD2;
    protected int VD3;
    protected int VD4;
    protected int VD5;
    protected int VD6;
    public Division(int VD1, int VD2, int VD3, int VD4, int VD5, int VD6){
        this.VD1 = VD1;
        this.VD2 = VD2;
        this.VD3 = VD3;
        this.VD4 = VD4;
        this.VD5 = VD5;
        this.VD6 = VD6;
    }
    public abstract int dividir();//Metodo abstracto de dividir
    //Clase para dividir 6 variables
    public class RDV6 extends Division{
        public RDV6 (int VD1, int VD2, int VD3, int VD4, int VD5, int VD6){
            super(VD1, VD2, VD3, VD4, VD5, VD6);
        }
        @Override
        public int dividir(){
            if (VD2 == 0 || VD3 == 0 || VD4 == 0 || VD5 == 0 || VD6 == 0) {
                System.out.println("Invalido la division");
                JOptionPane.showMessageDialog(null, "Error: No se debe dividir entre 0",
                    "Division invalida", JOptionPane.ERROR_MESSAGE);
                throw new ArithmeticException("No se puede dividir entre 0");
                return -1;
            }else{
                System.out.println("Division de 6 variables");
                return VD1 / VD2 / VD3 / VD4 / VD5 / VD6;
            }
        }
    }
    //Clase para dividir 5 variables
    public class RDV5 extends Division{
        public RDV5 (int VD1, int VD2, int VD3, int VD4, int VD5){
            super(VD1, VD2, VD3, VD4, VD4, 1);
        }
        @Override
        public int dividir(){
            if (VD2 == 0 || VD3 == 0 || VD4 == 0 || VD5 == 0){
                System.out.println("Invalida la division");
                JOptionPane.showMessageDialog(null, "No se debe dividir entre 0",
                    "Division invalida", JOptionPane.ERROR_MESSAGE);
                throw new ArithmeticException("No se puede dividir entre 0");
                return -1;
            }else{
            System.out.println("Division de 5 variables");
            return VD1 / VD2 / VD3 / VD4 / VD5;
            }
        }
    }
    //Clase para dividir 4 variables
    public class RDV4 extends Division{
        public RDV4 (int VD1, int VD2, int VD3, int VD4){
            super(VD1, VD2, VD3, VD4, 1, 1);
        }
        @Override
        public int dividir(){
            if(VD2 == 0 || VD3 == 0 || VD4 == 0){
                System.out.println("Invalido la division");
                JOptionPane.showMessageDialog(null, "No se deve dividir entre 0",
                    "Division invalida", JOptionPane.ERROR_MESSAGE);
                throw new ArithmeticException("No se puede dividir entre 0");
                return -1;
            }else{
                System.out.println("Division de 4 variables");
                return VD1 / VD2 / VD4 / VD3 / VD4;
            }
            
        }
    }
    //Clase para dividir 3 variables
    public class RDV3 extends Division{
        public RDV3 (int VD1, int VD2, int VD3){
            super(VD1, VD2, VD3, 1, 1, 1);
        }
        @Override
        public int dividir(){
            if(VD2 == 0 || VD3 == 0){
                System.out.println("Invalido la division");
                JOptionPane.showMessageDialog(null, "No se debe dividir entre 0",
                    "Division invalida", JOptionPane.ERROR_MESSAGE);
                throw new ArithmeticException("No se puede dividir entre 0");
                return -1;
            }else{
                System.out.println("Division de 3 variables");
                return VD1 / VD2 / VD3 / VD3;
            }
        }
    }
    //Clase para dividir 2 variables
    public class RDV2 extends Division{
        public RDV2(int VD1, int VD2){
            super(VD1, VD2, 1, 1, 1, 1);
        }
        @Override
        public int dividir(){
            if(VD2 == 0){
                System.out.println("Invalida la difivion");
                JOptionPane.showMessageDialog(null, "No se debe dividir entre 0",
                    "Division invalida", JOptionPane.ERROR_MESSAGE);
                throw new ArithmeticException("No se puede dividir entre 0");
                return -1;
            }else{
                System.out.println("Division de 2 variables");
                return VD1 / VD2;
            }
            
        }
    }
}