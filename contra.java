import javax.swing.*; 
public class contra {

    public static void main(String[] args) {
        String clave="parapapa";

        String pass="";

        while (clave.equals(pass)==false) {

            pass=JOptionPane.showInputDialog("Ingresa la contraseña");

            if (clave.equals(pass)==false) {

                System.out.println("Contraseña incorrecta");
                
            }
            
        }
        System.out.println("Acceso correcto");
    }

}
