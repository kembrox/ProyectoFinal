package proyectofinal;
import javax.swing.JOptionPane;
public class Rutina {
    //private Precios datos[]=new Precios[4];
    
    int precios[];
    
    public Rutina (){
        precios = new int[4];
    }
    
    public void llenarArreglo(){
        int x;
        for(x=0;x<precios.length;x++){
            //Precios p=new Precios();
            //p.setPrecios(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precio de las camisas la primer vez.\nLos zapatos la segunda vez.\nLos pantalones la tercera vez.\nLa ropa interior la cuarta vez")));
            precios[x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precio de las camisas la primer vez.\nLos zapatos la segunda vez.\nLos pantalones la tercera vez.\nLa ropa interior la cuarta vez"));
        }
    }
  
    public void precioMayor(){
         int mayor=0;
         for(int x=0;x<precios.length;x++){
             if(precios[x]>mayor){
                mayor = precios[x];
         }
    }
         JOptionPane.showMessageDialog(null," el precio mayor es: "+mayor);
 }
}