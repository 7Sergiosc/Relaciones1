package relaciones1.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import relaciones1.entidades.Perro;
import relaciones1.entidades.Persona;

public class ServicioPerrera {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public void añadirPersona(ArrayList<Persona> p){
        p.add(new Persona("Sergio", "Ciminari", 23, "41.424.334"));
        p.add(new Persona("Enrique", "Gonzalez", 35, "39.255.423"));
        p.add(new Persona("Camila", "Gonzalez", 15, "35.4543.423"));
        p.add(new Persona("Malena", "Gonzalez", 22, "59.243.443"));
        p.add(new Persona("Romeo", "Gonzalez", 26, "35.453.423"));
    }
    public void añadirPerro(ArrayList<Perro> p){
        p.add(new Perro("Bronco", "Dobermann", 1, "Grande"));
        p.add(new Perro("Titan", "Caniche", 6, "Chico"));
        p.add(new Perro("Putty", "Shih Tzu", 11, "Chico"));
        p.add(new Perro("Lola", "NN", 2, "Mediano"));
        p.add(new Perro("Tibo", "Pitbull", 5, "Grande"));
    }
    
    public void adoptarPerro(ArrayList<Perro> perros, ArrayList<Persona> personas){
        int eleccion;
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("Hola, "+ personas.get(i).getNombre() + ", ingresa el 'ID' del perro que deseas adoptar.\n");
            
            mostrarPerros(perros);
                       
            System.out.print(">>>"); eleccion = input.nextInt();
            
            realizarAdopcion(perros, eleccion, personas.get(i), personas);
        }  
    }
    
    public void realizarAdopcion(ArrayList<Perro> perros, int perroID, Persona persona, ArrayList<Persona> personas){
        Perro perroElegido = perros.get(perroID-1);
        if (perroDisponible(perroElegido, personas)){
            persona.setPerro(perroElegido);
            System.out.println("El siguiente perro fue adoptado correctamente: \n" + perroElegido.toString());
        }else{
            System.out.println("Ese perro no se encuentra disponible para adopción");
        }
    }
    
    public boolean perroDisponible(Perro perro, ArrayList<Persona> personas){
        for (int i = 0; i < personas.size(); i++) {
            if (perro.equals(personas.get(i).getPerro())) {
                return false;
            }
        }
        return true;
    }
    
    public void mostrarPerros(ArrayList<Perro> perros){
        int cont = 0;
        for (Perro perro : perros) {
                cont++;
                System.out.println(cont + ") " + perro.getNombre() + ".");           
            }
    }
    
    public void mostrarPersonas(ArrayList<Persona> personas){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
