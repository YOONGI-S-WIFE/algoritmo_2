public class Inicio {

    Validaciones validar = new Validaciones();
    Boolean seguir = true;

    public void menu () {

        System.out.println("hola usuario 🤗");
        System.out.println("el dia de hoy me daras un maximo de 5 letras");
        System.out.println("te preguntaras para que quiero 5 letras, ¿cierto?");
        System.out.println("en base a las letras que me des te dare todas las posibles combinaciones de esas letras");

        while (seguir == true) {  
   
        validar.validar_numero_letras();

        while (validar.getNumero_de_letras() > 0) {

        validar.validar_digitar_letra();

        validar.decremento_numero_letras();

        }

        validar.llamar_implementacion_combinaciones();

        seguir = validar.validar_continuacion();

        }

    }
    
}
