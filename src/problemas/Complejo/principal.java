package problemas.Complejo;

public class principal {

    

        public static void main(String []args){
    
         Complejo a = new Complejo();
         Complejo b = new Complejo(2,3);
    
         a.cambia_Real(4);
         a.cambia_Imag(7);
    
         System.out.println("Numero complejo a: " + a.toString());
         System.out.println("Numero complejo b: " + b.toString());
    
         a.sumar(b);
         System.out.println("Suma a + b: " + a.toString());
    
}
}