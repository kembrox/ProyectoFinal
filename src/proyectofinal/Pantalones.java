package proyectofinal;
public class Pantalones {
    private String marca;
    private int precio;
    private int tallasDisponibles;
    
    public Pantalones() {
        marca = "";
        precio = 0;
        tallasDisponibles = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTallasDisponibles() {
        return tallasDisponibles;
    }

    public void setTallasDisponibles(int tallasDisponibles) {
        this.tallasDisponibles = tallasDisponibles;
    }
    
}
