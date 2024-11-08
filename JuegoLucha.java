
package juego;


class JuegoLucha {
    private Personaje personaje1;
    private Personaje personaje2;

    public JuegoLucha(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }

    public void iniciarPelea() {
        System.out.println("¡Comienza la pelea!");
        while (personaje1.estaVivo() && personaje2.estaVivo()) {
            // Turno del personaje 1
            personaje1.atacar(personaje2);
            if (!personaje2.estaVivo()) {
                System.out.println(personaje2.getNombre() + " ha sido derrotado.");
                break;
            }
            // Turno del personaje 2
            personaje2.atacar(personaje1);
            if (!personaje1.estaVivo()) {
                System.out.println(personaje1.getNombre() + " ha sido derrotado.");
                break;
            }
            // Mostrar los puntos de vida de cada personaje
            System.out.println(personaje1.getNombre() + " tiene " + personaje1.getPuntosDeVida() + " puntos de vida.");
            System.out.println(personaje2.getNombre() + " tiene " + personaje2.getPuntosDeVida() + " puntos de vida.");
        }
        // Determinar el ganador
        if (personaje1.estaVivo()) {
            System.out.println("¡" + personaje1.getNombre() + " es el ganador!");
        } else {
            System.out.println("¡" + personaje2.getNombre() + " es el ganador!");
        }
    }
}