package proyectofinal;
public class Deudores {
    private String nombreDeudor;
    private int monto;
    private int numTelefono;
    private int numTelefonoFamiliar;
    
    public Deudores(){
        nombreDeudor="";
        monto=0;
        numTelefono=0;
        numTelefonoFamiliar=0;
    }

    public String getNombreDeudor() {
        return nombreDeudor;
    }

    public void setNombreDeudor(String nombreDeudor) {
        this.nombreDeudor = nombreDeudor;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getNumTelefonoFamiliar() {
        return numTelefonoFamiliar;
    }

    public void setNumTelefonoFamiliar(int numTelefonoFamiliar) {
        this.numTelefonoFamiliar = numTelefonoFamiliar;
    }
    
}
