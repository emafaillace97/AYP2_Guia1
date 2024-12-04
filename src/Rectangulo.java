public class Rectangulo {

    private int alto, ancho, x, y;

    public Rectangulo(int ancho, int alto, int x, int y){
        this.ancho = ancho;
        this.alto = alto;
        this.x = x;
        this.y = y;
    }

    public Rectangulo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Se calcular el area del rectangulo
     */
    public int getArea(){
        return this.ancho * this.alto;
    }

    /**
     * Mueve el rectangulo a cualquier parte del plano XY
     */
    public void trasladar(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Verifica si el tectangulo contiene un punto en su interior
     */
    public boolean contienePunto(int x, int y){
        boolean contieneEnX = x >= this.x && x <= (this.x + this.ancho);
        boolean contieneEnY = y >= this.y && y <= (this.y + this.alto);
        return contieneEnX && contieneEnY;
    }
}
