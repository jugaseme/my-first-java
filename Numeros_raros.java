import javax.swing.*;
public class Numeros_raros {


    public static void main(String[] args) {
        
        String x=JOptionPane.showInputDialog("Introduce un numero ");

        double z=Double.parseDouble(x);

        System.out.print("L raiz de "+x+" es ");
        System.out.printf("%1.2f", Math.sqrt(z));


    }

}
