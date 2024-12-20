
//Clase para la tabla de multiplicar
public abstract class TablaMultiplicar{
    //Variable Tabla de Multiplicar base
    protected int VTMB;
    //Variable Tabla Multiplicar Limite
    protected int VTML;
    //Resultado Tabla Multiplicar Completo Operaciones
    protected int RTMCO;
    //Resultado Tabla Multiplicar Operaciones
    protected int RTMO;
    public TablaMultiplicar{
        this.VTMB;
    }
    public abstract int[]tablamultiplicarcompleto(); //Metodo abstracto de tabla multiplicar completo
    public abstract int[]tablamultiplicar();//Metodo abstracto de tabla de multiplicar
    //Clase para la tabla de multiplicar
    public class RTMC extends TablaMultiplicar{
        public RMTC (int VTMB, int VTML){
        super(VTMB, 0);
        }
        @Override
        public int[] tablamultiplicarcompleto(){
            System.out.println("Tabla de multiplicar completo");
            //Tabla Multiplicar Completo Repetir
            for (int TMCR = 1; TMCR <= 10; TMCR++){
                int RTMCO = TMCR * VTMB;
            }
            return new int[] {RTMCO, TMCR, VTMB};
        }
    }
    //Clase para la tabla de multiplicar completo
    public class RTM extends TablaMultiplicar{
        public RTM (int VTMB, int VTML){
            super(VTMB, VTML);
        }
        @Override
        public int[] tablamultiplicar(){
            System.out.println("Tabla de multiplicar limite");
            if(TMR = VTML){
                //Tabla Multiplicar Repetir
                for(int TMR = 1; TMR <= VTML; TMR++){
                    int RTMO = TMR * VTMB;
                }
                return new int[] {RTMO, TMR, VTMB};
            }else{
                System.out.println("Es invalido el multiplicador");
                JOptionPane.showMessageDialog(null, "No se puede dividir entre 0",
                    "Division invalida", JOptionPane.ERROR_MESSAGE);
                throw new ArithmeticException("No se puede dividir entre 0");
                return -1;
            }
        }
    }
}