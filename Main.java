package Calculadora;
import Calculos.Basicos.Basico;  
public class Main {
    
    public static void main(String[] args){
        System.out.println("Bienvenido a la calculadora avanzada");
        System.out.println("By Aaron Cisneros Flores");
        /*
         * for(i=3; i<=33; i++){
         *      if(TblFi == A14){
         *          TblAi = E14();
         *          TblBi = E14();
         *          TblCi = E14();
         *          TblDi = E14();
         *          TblEi = E14();
         *      }
         *      if(TblFi == A15){
         *          TblAi = E15();
         *      }
         *      if(TblFi == A16){
         *          TblAi = E16();
         *      }
         *      if(TblFi == A17){
         *          TblAi = E17();
         *      }
         *      if(TblFi == A18){
         *          TblAi = 18();
         *      }
         * }
        // Crea un objeto Suma6
        //RSV6 RSV6 = new RSV6(1, 2, 3, 4, 5, 6);
        //int resultado6 = suma6.sumar();
        //System.out.println("Suma de 6 variables: " + resultado6);

        // Crea un objeto Suma3
        //RSV3 RSV3 = new RSV3(10, 20, 30);
        //int resultado3 = suma3.sumar();
        //System.out.println("Suma de 3 variables: " + resultado3);
        // Clase principal para probar las implementaciones
        public class Main {
            public static void main(String[] args) {
                int base = 2; // Puedes cambiar esto
                int valorRaiz = 16; // Puedes cambiar esto

                Potencia potenciaCuadrada = new PotenciaDos(base);
                Potencia potenciaCubica = new PotenciaTres(base);
                Potencia potenciaCuarta = new PotenciaCuatro(base);

                Raiz raizCuadrada = new RaizDos(valorRaiz);
                Raiz raizCubica = new RaizTres(valorRaiz);
                Raiz raizCuarta = new RaizCuatro(valorRaiz);

                System.out.println("Potencia de 2: " + potenciaCuadrada.potenciar());
                System.out.println("Potencia de 3: " + potenciaCubica.potenciar());
                System.out.println("Potencia de 4: " + potenciaCuarta.potenciar());

                System.out.println("Raíz cuadrada: " + raizCuadrada.raizes());
                System.out.println("Raíz cúbica: " + raizCubica.raizes());
                System.out.println("Raíz cuarta: " + raizCuarta.raizes());
            }
        }
        */
    }
}