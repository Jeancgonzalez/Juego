
package juego;


class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre, 100, ArmaFactory.crearArma("espada"));
    }
}
