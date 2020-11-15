package proyectofinal;
public class BlusasyCamisas {
    private String marca;
    private int precio;
    private int tallasDisponibles;
    private int colores;
    
    public BlusasyCamisas() {
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

    public int getColores() {
        return colores;
    }

    public void setColores(int colores) {
        this.colores = colores;
    }
    
}
