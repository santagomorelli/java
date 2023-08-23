
public class NumeroFlotanteMorelli {
   public static void main(String[] args) {
        //se delcara el numero decimal a trabajar
        float input = 2.13f;
        //se  convierte explicitamente el numero decimal a entero y se obtiene solo la parte entera (se guarda en una var tipo int)
        float parteEntera = (int) input;
        //se  resta al numero decimal la parte entera y se obtiene la parte decimal (se guarda en una var tipo float)
        float parteDecimal = input - parteEntera;

        //se imprimen los resultados en lineas separadas
        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte entera: " + parteDecimal);
    
    }

}
