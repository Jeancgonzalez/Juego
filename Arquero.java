
package juego;


class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, 130, ArmaFactory.crearArma("arco"));
    }
}