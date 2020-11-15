package proyectofinal;
public class RopaIntima {
    private String marca;
    private int precio;
    private int talla; 
    
    public RopaIntima(){
        marca="";
        precio=0;
        talla=0;
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

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
}
