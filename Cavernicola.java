
package juego;  

class Cavernicola extends Personaje {  
    public Cavernicola(String nombre) {  
        super(nombre, 100, ArmaFactory.crearArma("palo")); // Usando la Fábrica  
    }  
}  
