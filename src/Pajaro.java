
class Pajaro {
    String nombre;
    double posx;
    double posy;

    public Pajaro(String nombre, int posx, int posy){

        this.nombre=nombre;
        this.posx=posx;
        this.posy=posy;
    }

double volar (int posx, int posy)
{
double desplazamiento= posx+posy;
this.posx=posx;
this.posy=posy;

return desplazamiento;
}
    
    
}
