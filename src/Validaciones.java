import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validaciones {

    Scanner leer = new Scanner(System.in);
    Combinaciones combinar = new Combinaciones ();
    private String letra_validada = "";
    ArrayList <String> lista_letras = new ArrayList<>();
    String letra = null;
    Boolean seguir = true;
    Integer seguir_2 = 1;
    Integer numero_de_letras = null;

    public Integer getNumero_de_letras() {

        return numero_de_letras;

    }

    public void setNumero_de_letras(Integer numero_de_letras) {

        this.numero_de_letras = numero_de_letras;

    }

    public Boolean getSeguir() {

        return seguir;

    }

    public void setSeguir(Boolean seguir) {

        this.seguir = seguir;

    }

    public void setLetra_validada(String letra_validada) {

        this.letra_validada = letra_validada;
        
    }

    public String getLetra_validada() {

        return letra_validada;

    }

    public void validar_numero_letras () {

        System.out.println("dijita cuantas letras quieres combinar, recuerda que solo puedes seleccionar un maximo de 5 letras");

        seguir = true;

        while (seguir == true) {
            
            try {
                    
                    numero_de_letras = leer.nextInt();
                    leer.nextLine();
        
                    if (numero_de_letras > 0 && numero_de_letras < 6) {

                        seguir = false;
                        
                    } else {
        
                        throw new InputMismatchException ();
                        
                    }
        
            } catch (Exception e) {
        
                System.out.println("debes digitar un numero valido, por favor intentalo otra vez");
                leer.next();
        
            }
    
        }

    }

    public Boolean validar_letra (String letra) {

        char [] letra_char = letra.toCharArray();

        if (letra_char.length > 0 && letra_char.length < 2) {

            for (char letter : letra_char) {

                if (Character.isLetter(letter) && !Character.isWhitespace(letter)) {

                    for (char c : letra_char) {

                        letra_validada = (String.valueOf(c));
                        
                    }
                    
                } else {

                    return false;
                    
                }

            }

        }

        return true;

    }

    public void validar_digitar_letra() {

        seguir = true;

        while (seguir == true) {

            try {

                System.out.println("por favor digita una letra");
                letra = leer.nextLine();

                if (validar_letra(letra) == true) {

                    seguir = false;

                    lista_letras.add(letra_validada);
                    
                } else {

                    throw new InputMismatchException();
                    
                }      
                
            } catch (Exception e) {

                System.out.println("verifica ya que insertaste mas de 1 letra, un espacio blanco o un caracter invalido");
                leer.next();

            }

        }

    }

    public Integer decremento_numero_letras () {

        return numero_de_letras -- ;

    }

    public void llamar_implementacion_combinaciones () {

        combinar.implementacion_combinaciones(lista_letras);

        combinar.setI(1);

    }

    public Boolean validar_continuacion () {

        seguir_2 = 1;

        while (seguir_2 == 1) {

            try {

                System.out.println("desea hacer otra combinatoriaria? \n en caso de que si, dijite 1 \n en caso de que no, dijite 2");
                seguir_2 = leer.nextInt();

                if (seguir_2 == 1 || seguir_2 == 2) {

                if (seguir_2 == 2) {

                    return false;
                    
                } else {

                    lista_letras.clear();
                    seguir_2 = 3;
                    
                } 
            
                } else {

                    throw new InputMismatchException();
                    
                }
                    
            } catch (Exception e) {

                System.out.println("por favor dijita un numero valido");
                seguir_2 = 1;
                leer.next();
                
            } 

        }

        return true;

    }
    
}
