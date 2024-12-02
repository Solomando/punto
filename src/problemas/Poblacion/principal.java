package problemas.Poblacion;

public class principal {    

        public static void main(String []args){
    
         Poblacion a = new Poblacion();
         Poblacion b = new Poblacion(2,3);
    
         a.cambia_Real(4);
         a.cambia_Imag(7);
    
         System.out.println("Numero complejo a: " + a.toString());
         System.out.println("Numero complejo b: " + b.toString());
    
         a.sumar(b);
         System.out.println("Suma a + b: " + a.toString());
    
}
}