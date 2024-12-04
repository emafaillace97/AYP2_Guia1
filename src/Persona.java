public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean equals(Persona p){
        return this.nombre.equals(p.getNombre()) && this.edad == p.getEdad();
    }

    public String toString(){
        return String.format("Nombre: %s - Edad: %d años", this.nombre, this.edad);
    }
}
