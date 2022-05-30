package relaciones1;

import java.util.ArrayList;
import java.util.List;
import relaciones1.entidades.Perro;
import relaciones1.entidades.Persona;
import relaciones1.servicios.ServicioPerrera;


public class Main {

    public static void main(String[] args) {
        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        ServicioPerrera sp = new ServicioPerrera();
        
        sp.añadirPersona(personas);
        sp.añadirPerro(perros);
        
        sp.adoptarPerro(perros, personas);
        
        sp.mostrarPersonas(personas);
    }
    
}
