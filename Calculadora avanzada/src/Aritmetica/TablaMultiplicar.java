package Aritmetica;
import javax.swing.JOptionPane;
//Clase para la tabla de multiplicar
public abstract class TablaMultiplicar{
    //Variable Tabla de Multiplicar base
    protected int VTMB;
    //Variable Tabla Multiplicar Limite
    protected int VTML;
    public TablaMultiplicar(int VTMB, int VTML){
        this.VTMB= VTMB;
        this.VTML = VTML;
    }
    public abstract int[]tablamultiplicarcompleto(); //Metodo abstracto de tabla multiplicar completo
    public abstract int[]tablamultiplicar();//Metodo abstracto de tabla de multiplicar
    //Clase para la tabla de multiplicar completo
    public static class RTMC extends TablaMultiplicar{
        public RTMC (int VTMB){
        super(VTMB, 10);
        }
        @Override
        public int[] tablamultiplicarcompleto(){
            System.out.println("Tabla de multiplicar completo");
            int[] resultado = new int [10];
            //Tabla Multiplicar Completo Repetir
            for (int TMCR = 1; TMCR <= 10; TMCR++){
                resultado [TMCR - 1] = TMCR * VTMB; //Resultado de un arreglo
            }
            return tablamultiplicarcompleto();
        }
        @Override
        public int[] tablamultiplicar(){
            return new int[0];
        }
    }
    //Clase para la tabla de multiplicar limite
    public static class RTML extends TablaMultiplicar{
        public RTML (int VTMB, int VTML){
            super(VTMB, VTML);
        }
        @Override
        public int[] tablamultiplicar(){
            System.out.println("Tabla de multiplicar limite");
            if(VTML > 0){
                int[] resultados = new int [VTML];
                //Tabla Multiplicar Repetir
                for(int TMR = 1; TMR <= VTML; TMR++){
                    resultados[TMR - 1] = TMR * VTMB;
                }
                return resultados;
            }else{
                System.out.println("Es invalido el multiplicador");
                JOptionPane.showMessageDialog(null, "No se puede dividir entre 0",
                    "Division invalida", JOptionPane.ERROR_MESSAGE);
                return new int [0];
            }
        }
        @Override
        public int[] tablamultiplicarcompleto(){
            return new int[0];
        }
    }
}