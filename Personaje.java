
package juego;


public class Personaje {
    
    protected String nombre;
    protected int puntosDeVida;
    protected Arma arma; 

    public Personaje(String nombre, int puntosDeVida, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.arma = arma;
    }

    
    public void atacar(Personaje oponente) {
        int danio = arma.usarArma();
        oponente.puntosDeVida -= danio;
        System.out.println(nombre + " ataca a " + oponente.getNombre() + " causando " + danio + " puntos de daño.");
    }
    
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

}
