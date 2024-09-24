import javax.swing.*;
import java.util.*;
public class area {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);

        System.out.print("elige una opcion para el area \n1:cuadrado \n2:rectangulo \n3:triangulo \n4:circulo");

        int cosa=entrada.nextInt();

        switch (cosa) {
            case 1:
                
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("el area de el cuadrado es "+Math.pow(lado, 2));
                break;

            case 2:

            int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base de el rectangulo"));
            int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce a altura de el rectaulo"));
            System.out.println("El area de tu rectangulo es "+base*altura);
            break;

            case 3:
            base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base de tu triangulo"));
            altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura de triangulo"));
            System.out.println("El area de tu triangulo es igual a "+base*altura);
            break;

            case 4:
            int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio de tu circulo"));
            System.out.println("EL area de tu circulo es de ");
            System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
            break;

            default:
            System.out.println("La opcion no es correcta");
        }

    }

}
