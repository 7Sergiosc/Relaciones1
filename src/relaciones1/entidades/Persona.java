package relaciones1.entidades;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String documento;
    private Perro perro;

    public Persona(String nombre, String apellido, Integer edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Perro getPerro() {
        return perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + "\n perro=" + perro + '}';
    }
    
    
}
