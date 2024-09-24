import javax.swing.*;
import java.util.*;
public class Ysi {

    public static void main(String[] args) {
        
        String entrada=JOptionPane.showInputDialog("Introduce tu edad");

        //System.out.println("Introduce tu edad ");

        double edad=Double.parseDouble(entrada);

        if (edad<18) {
            System.out.println("eres un adolecente");
        }
        else if(edad<30){
            System.out.println("eres un adulto");
        }
        else if (edad <65){
            System.out.println("Eres viejo");
        }

    }

}
