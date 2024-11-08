
package juego;  

public class Main {  
    public static void main(String[] args) {  
        
        
        Guerrero guerrero = new Guerrero("Arthur"); // Personaje Guerrero  
        Arquero arquero = new Arquero("Robin"); // Personaje Arquero  
        Cavernicola cavernicola = new Cavernicola("Brutus"); // Cabernícola  
        
        JuegoLucha juego = new JuegoLucha(cavernicola, guerrero);  
        juego.iniciarPelea();  
        
       
    }  
}  
