package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String tamaño;
    private Persona dueño;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamaño, Persona dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", tamaño: " + tamaño + ", dueño: " + dueño + '}';
    }
    
    
}
