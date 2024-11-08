
package juego;
import java.util.Random;


class Palo extends Arma {
    @Override
    int usarArma() {
        return new Random().nextInt(6) + 10; // Daño entre 10 y 15
    }
}
