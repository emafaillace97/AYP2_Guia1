public class Cerradura {

    private int combinacion;
    private boolean abierto;

    public Cerradura(){
        this.combinacion = 000;
        this.abierto = false;
    }

    /**
     * Setea la nueva combinacion si se sabe la anterior
     * @param combVieja de tres digitos
     * @param combNueva de tres digitos
     */
    public void setCombinacion(int combVieja, int combNueva){
        if(combVieja == this.combinacion){
            this.combinacion = combNueva;
        }
    }

    /**
     * Abre la cerradura ingresando la combinacion
     * @param combinacion de 3 digitos
     */
    public void abrir(int combinacion){
        if(combinacion == this.combinacion){
            this.abierto = true;
        }
    }

    /**
     * Cierra la cerradura
     */
    public void cerrar(){
        this.abierto = false;
    }
}
