
package juego;


public class ArmaFactory {
       

    public static Arma crearArma(String tipo) {  
        switch (tipo.toLowerCase()) {  
            case "espada":  
                return new Espada();  
            case "arco":  
                return new Arco();  
            case "palo":  
                return new Palo();  
            default:  
                throw new IllegalArgumentException("Tipo de arma no reconocido: " + tipo);  
        }  
    }  
}

    
