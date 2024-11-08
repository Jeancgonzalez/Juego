
package juego;
import java.util.Random;


class Espada extends Arma {
    @Override
    int usarArma() {
        return new Random().nextInt(16) + 15; // Daño entre 15 y 30
    }
}
