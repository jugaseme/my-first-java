public class textos {

    public static void main(String[] args) {
        
        String Mi_nombre="sevastian";


        System.out.println(Mi_nombre);

    
        System.out.println("tiene "+Mi_nombre.length()+" letras");

        System.out.println("la primer letra de tu nombre es "+ Mi_nombre.charAt(0));

        int ultima=Mi_nombre.length();

        System.out.println("Y la ultima  letra es "+ Mi_nombre.charAt(ultima-1));

        String frase="hoy es un muy buen dia para mejorar";

        String resumen=frase.substring(13, 35);

        System.out.println(resumen);



    }


}
