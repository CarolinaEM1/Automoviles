
package automoviles;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Automoviles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
      electrico elec= new electrico();
      combustion com= new combustion();
      
      int opcion;
      String m; 
      int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de vehiculos: "));
      vehiculo []ar=new vehiculo[n];
        for(int i=0;i<n;i++){
          m="Seleccion de opciones"+"\n1.-Electrico\n2.-Combustion";
      
          opcion=Integer.parseInt(JOptionPane.showInputDialog(m));
                switch(opcion){
                    case 1:
                       ar[i]=new electrico();
                       ar[i].capturar();
                       ar[i].Impuesto();
                       ar[i].mostrar();
                        
                        break;
                    case 2:
                       ar[i]=new combustion();
                       ar[i].capturar();
                       ar[i].Impuesto();
                       ar[i].mostrar();
                        break;
                }
    
      }    
    }
    
}


abstract class vehiculo{
    String color,modelo;
    double precio,impuesto;
  abstract double Impuesto();
  abstract void capturar();
  abstract void mostrar();

}



class electrico extends vehiculo {
    String color,modelo,modeloBateria;
    double precio,impuesto;
    public void capturar(){
        modelo=JOptionPane.showInputDialog("Ingese modelo del vehiculo: ");
        color=JOptionPane.showInputDialog("Ingrese el color del vehiculo: ");
        modeloBateria=JOptionPane.showInputDialog("Ingrese el modelo da la bateria: ");
        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
    }
    @Override
    double Impuesto(){
      impuesto=(precio*0.11);
      return impuesto;
  }
    
   public void mostrar(){
        String s;
        s="Modelo: "+modelo+"\nColor: "+color+"\nModelo bateria: "+modeloBateria+"\nPrecio: "+ precio+"\nImpuestos: "+impuesto+"\nPrecio total: "+(precio+impuesto);
        JOptionPane.showMessageDialog(null, s);
   } 
}

class combustion extends vehiculo {
    String nombre,modelo;
    double precio,impuesto;
    int cilindrada;
    public void capturar(){
        modelo=JOptionPane.showInputDialog("Ingrese el modelo del vehículo: ");
        color=JOptionPane.showInputDialog("Ingrese el color del vehiculo: ");
        cilindrada=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cilindrada: "));
        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
    }
    @Override
     double Impuesto(){
        impuesto=(3*cilindrada);
        return impuesto;
    }
    
    public void mostrar(){
        String s;
        s="Modelo: "+modelo+"\nColor: "+color+"\nCilindrada: "+cilindrada+"\nPrecio: "+ precio+"\nImpuestos: "+impuesto+"\nPrecio total: "+(precio+impuesto);
        JOptionPane.showMessageDialog(null, s);
    }
}
    
    

