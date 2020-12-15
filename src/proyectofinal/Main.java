package proyectofinal;
/*El proyecto es sobre el manejo de una tienda de ropa.El integrante
del grupo es: Keylor Quesada*/
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Sucursales suc1=new Sucursales();
        Sucursales suc2=new Sucursales();
        Inventario inv1=new Inventario();
        Inventario inv2=new Inventario();
        Deudores deu1=new Deudores();
        Empleados emp1=new Empleados();
        Empleados emp2=new Empleados();
        BlusasyCamisas bc=new BlusasyCamisas();
        Calzado cal=new Calzado();
        Pantalones pan=new Pantalones();
        RopaIntima rin=new RopaIntima();
        
        
    
       suc1.setUbicacion(JOptionPane.showInputDialog(null,"Digite la ubicacion de la primer sucursal:"));
       suc1.setCanEmpleados(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados en la primer sucursal:")));
       suc1.setCantProdDispo(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de productos disponibles en la primer sucursal:")));
       suc2.setUbicacion(JOptionPane.showInputDialog(null,"Digite la ubicacion de la segunda sucursal:"));
       suc2.setCanEmpleados(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados en la segunda sucursal:")));
       suc2.setCantProdDispo(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de productos disponibles en la segunda sucursal:")));
       
       inv1.setInventarioActual(JOptionPane.showInputDialog(null,"Ingrese los nombres de los productos disponibles actualmente: primer sucursal"));
       inv1.setCanProductosDisponibles(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos de diferentes tipos que van a entrar: primer sucursal")));
       inv1.setInventarioFuturo(JOptionPane.showInputDialog(null,"Ingrese el nombre de los productos que van a entrar en el proximo pedido: primer sucursal"));
       inv2.setInventarioActual(JOptionPane.showInputDialog(null,"Ingrese los nombres de los productos disponibles actualmente: segunda sucursal"));
       inv2.setCanProductosDisponibles(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos de diferentes tipos que van a entrar: segunda sucursal")));
       inv2.setInventarioFuturo(JOptionPane.showInputDialog(null,"Ingrese el nombre de los productos que van a entrar en el proximo pedido: segunda sucursal"));
       
       deu1.setNombreDeudor(JOptionPane.showInputDialog(null,"Ingrese el nombre de la persona que debe dinero:"));
       deu1.setMonto(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el monto a deber:")));
       deu1.setNumTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de telefono del deudor:")));
       
       emp1.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre del empleado de la primer sucursal:"));
       emp1.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del empleado de la primer sucursal:")));
       emp1.setSalario(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el salrio del empleado de la primer sucursal:")));
       emp2.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre del empleado de la segunda sucursal:"));
       emp2.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del empleado de la segunda sucursal:")));
       emp2.setSalario(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el salrio del empleado de la segunda sucursal:")));
       
       bc.setMarca(JOptionPane.showInputDialog(null,"Ingrese las marcas disponibles de camisas:"));
       bc.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precio estandar de las camisas:")));
       
       
       cal.setMarca(JOptionPane.showInputDialog(null,"Ingrese las marcas de zapatos disponibles:"));
       cal.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los precios disponibles:")));
       
       pan.setMarca(JOptionPane.showInputDialog(null,"Ingrese la marca de pantalones disponible:"));
       pan.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio disponible de los pantalones:")));
       
       rin.setMarca(JOptionPane.showInputDialog(null,"Ingrese la marca disponible de ropa interior:"));
       rin.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio disponible de ropa interior:")));
       
       JOptionPane.showMessageDialog(null,"La primer sucursal está ubicada en "+suc1.getUbicacion()+", tiene "+suc1.getCanEmpleados()+" empleado, cuanta con "+suc1.getCantProdDispo()+
               " \nproductos de diferentes tipos disponibles en el inventario, tiene de inventario "+inv1.getInventarioActual()+" con 6 piezas de cada tipo de prenda, en el proximo pedido van a entrar "+inv1.getCanProductosDisponibles()+
               " \nproductos nuevos como son: "+inv1.getInventarioFuturo()+". El nombre del empleado de la primer sucursal es "+emp1.getNombre()+" tiene "+emp1.getEdad()+
               " \naños y tiene un salario de "+emp1.getSalario()+" colones por mes. La primer sucursal tiene una persona que le debe dinero, su nombre es "+deu1.getNombreDeudor()+
               ", \nsu numero de telefono es "+deu1.getNumTelefono()+" y debe "+deu1.getMonto()+" colones. La segunda sucursal está ubicada en "+suc2.getUbicacion()+
               ", \ntiene "+suc2.getCanEmpleados()+" empleado, cuenta con "+suc2.getCantProdDispo()+" productos de diferentes tipos disonibles en el invenatrio, tiene de inventario "+inv2.getInventarioActual()+
               " \ncon 4 piezas de cada tipo de prenda, en el proximo pedido van a entrar "+inv2.getCanProductosDisponibles()+" productos nuevos como son: "+inv2.getInventarioFuturo()+
               ". \nEl nombre del empleado de esta sucursal es "+emp2.getNombre()+" tiene "+emp2.getEdad()+" años y tiene un salario de "+emp2.getSalario()+
               " \ncolones. Esta sucursal no tiene ningún deudor\n. Las marcas disponibles de camisas son: "+bc.getMarca()+
               ", \nlas tallas varian desde 12 hasta XL y el unico precio es: "+bc.getPrecio()+" colones. Las marcas disponibles de zapatos son: "+cal.getMarca()+
               ", \nel precio de los zapatos es de: "+cal.getPrecio()+" colones y las tallas disponibles son: 38,39,40,41,42,43. Las marcas disponibles de pantalones son: "+pan.getMarca()+
               ", \nel unico precio para los pantalones es de: "+pan.getPrecio()+" y las tallas disponibles son: 32,34,36,38. La unica marca de ropa interior que manejamos es: "+rin.getMarca()+", el precio que tenemos es de: "+rin.getPrecio()+" colones y las tallas disponibles son XS,S,M,L y XL ");
       
        Rutina r=new Rutina();
        r.llenarArreglo();
        r.precioMayor();
    }
}
