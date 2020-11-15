package proyectofinal;
public class Sucursales {
    private int cantProdDispo;
    private String ubicacion;
    private int canEmpleados;
    
    public Sucursales(){
        cantProdDispo=0;
        ubicacion="";
        canEmpleados=0;
    }

    public int getCantProdDispo() {
        return cantProdDispo;
    }

    public void setCantProdDispo(int cantProdDispo) {
        this.cantProdDispo = cantProdDispo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCanEmpleados() {
        return canEmpleados;
    }

    public void setCanEmpleados(int canEmpleados) {
        this.canEmpleados = canEmpleados;
    }
    
}
