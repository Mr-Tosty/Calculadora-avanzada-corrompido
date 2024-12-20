package Analitica;
public class AnaliticaOperaciones{
    //Clase para la base punto localizacion
    public abstract class PuntoLocalizacion{
        //Variables Coordenadas Punto Localizacion
        protected int VCPL;
        public PuntoLocalizacion(int VCPL){
            this.VCPL = VCPL;
        }
        public abstract int puntolocalizacion();//Metodo abstracto punto localizacion
    }
    //Clase para la base punto Medio
    public abstract class PuntoMedio{
        //Variable Coordenadas Punto Medio
        protected int VCPM;
        public PuntoMedio(int VCPM){
            this.VCPM = VCPM;
        }
        public abstract int puntomedio();//Metodo abstracto punto medio
    }
    //Clase para la base punto distacia
    public abstract class PuntoDistancia{
        //Variable Coordenas Punto Distancia
        protected int VCPD;
        public PuntoDistancia(int VCPD){
            this.VCPD = VCPD;
        }
        public abstract int puntodistancia();//Metodo abstracto punto distancia
    }
    //Clase para la base Circulo con centro de origen
    public abstract class CirculoCentro{
        //Variable Coordenadas Circulo Centro
        protected int VCCC;
        public CirculoCentro(int VCCC){
            this.VCCC = VCCC;
        }
        public abstract int circulocentro();//Metodo abstracto circulo con centro de origen
    }
    //Clase para la base Circulo con centro fuera de origen
    public abstract class CirculoFuera{
        //Variable Coordenadas Circulo Fuera
        protected int VCCF;
        public CirculoFuera(int VCCF){
            this.VCCF = VCCF;
        }
        public abstract int circulofuera();//Metodo abstracto circulo con centro fuera de origen
    }
}