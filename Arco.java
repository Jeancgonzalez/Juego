
package juego;

import java.util.Random;


class Arco extends Arma {
    @Override
    int usarArma() {
        return new Random().nextInt(16) + 10; // Daño entre 10 y 25
    }
}