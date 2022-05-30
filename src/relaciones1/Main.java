package relaciones1;

import relaciones1.entidades.Perro;
import relaciones1.entidades.Persona;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Sergio", "Ciminari", 23, "41.424.334");
        Persona p2 = new Persona("Enrique", "Gonzalez", 25, "39.243.443");
        
        Perro perro1 = new Perro("Bronco", "Dobermann", 1, "Grande");
        Perro perro2 = new Perro("Lola", "Caniche", 2, "Chico");
        
        p2.setPerro(perro2);
        p1.setPerro(perro1);
        
        System.out.println(p1 + "\n" +p2);
    }
    
}
