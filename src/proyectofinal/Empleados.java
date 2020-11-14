package proyectofinal;
import javax.swing.JOptionPane; 
public class Empleados {
    private String nombre;
    private int edad;
    private String cargo;
    private int salario;
    
    public Empleados(){
        nombre="";
        edad=0;
        cargo="";
        salario=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
