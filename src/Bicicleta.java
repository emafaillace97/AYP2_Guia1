public class Bicicleta {

    private int velocidad;
    private String marca;

    public Bicicleta() {
        this.velocidad = 0;
    }

    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString(){
        return String.format("Marca: %s - Velocidad: %d Km/h");
    }

}
