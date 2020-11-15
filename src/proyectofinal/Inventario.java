package proyectofinal;
public class Inventario {
    private String inventarioActual;
    private String inventarioFuturo;
    private int canProductosDisponibles;
    
    public Inventario(){
        inventarioActual="";
        inventarioFuturo="";
        canProductosDisponibles=0;
    }

    public String getInventarioActual() {
        return inventarioActual;
    }

    public void setInventarioActual(String inventarioActual) {
        this.inventarioActual = inventarioActual;
    }

    public String getInventarioFuturo() {
        return inventarioFuturo;
    }

    public void setInventarioFuturo(String inventarioFuturo) {
        this.inventarioFuturo = inventarioFuturo;
    }

    public int getCanProductosDisponibles() {
        return canProductosDisponibles;
    }

    public void setCanProductosDisponibles(int canProductosDisponibles) {
        this.canProductosDisponibles = canProductosDisponibles;
    }
    
}
