public class EjemploPunto {

    public static void main(String []args) {
  
      /*Punto P = new Punto(), Q = new Punto();*/
      Punto M = new Punto();
      Punto N = new Punto();

      M.latitud=12.2;
      M.longitud=2.36;
      N.latitud=32.25;
      N.longitud=25.65;


  
      /*P.x = 1.1411; P.y = 2.6222;
  
      Q.x = 4.7; Q.y = 7.4;   
  
  
  
      double distanciaPQ = 0.0; //Para calcular la distancia de dos puntos.
  
  
  
      System.out.printf("Punto P : Coordenadas (%03.1f , %03.1f).\n" , P.x , P.y );
  
      System.out.printf("Punto Q : Coordenadas (%03.1f , %03.1f).\n" , Q.x , Q.y );
  
      System.out.println("Punto P : " + P.muestraDatos() );
  
      System.out.println("Punto Q : " + Q.muestraDatos() );
  
  
  
      //Calculo de la Distancia de P a Q. Por Pitagoras.
  
      // d = sqrt( (x-x0)2 + (y-y0)2 );
  
      distanciaPQ = Math.sqrt(  Math.pow((P.x-Q.x) ,2) + Math.pow((P.y-Q.y) ,2) );
  
      System.out.prkntf("Distancia P a Q : %03.1f\n", distanciaPQ ) ;*/

      Punto latitud = new Punto();
      Punto longitud = new Punto();
      Pajaro loro =new Pajaro("emilia", 25,25);
      double d=loro.volar(25,25);
      System.out.println("el desplazamiento del loro es de " +d+ " metros");

      
      System.out.println("prueba latitud : " + latitud.muestraDatos() );
  
      System.out.println("prueba longitud : " + longitud.muestraDatos() );


      System.out.printf("prueba M : Coordenadas (%03.1f , %03.1f).\n" , M.latitud , M.longitud );
  
      System.out.printf("prueba N : Coordenadas (%03.1f , %03.1f).\n" ,N.latitud, N.longitud );
  
    }
  
  }