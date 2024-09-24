import javax.swing.*;
public class ventana {

        public static void main(String[] args) {
            
        String nombre=JOptionPane.showInputDialog("hola introduce tu nombre ");

        String edad=JOptionPane.showInputDialog("Introduce tu edad");

        int edad_usuario=Integer.parseInt(edad);
        
        System.out.println("hola "+nombre+" tu edad en un año sera  "+ (edad_usuario+1)+" años");


        }

}
