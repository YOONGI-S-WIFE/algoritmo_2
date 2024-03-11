import java.util.ArrayList;

public class Combinaciones {

    int i = 1;

    public int getI() {

        return i;

    }

    public void setI(int i) {

        this.i = i;

    }

    public void implementacion_combinaciones(ArrayList<String> letras) {

        generar_combinaciones(letras, "", letras.size(), new boolean [letras.size()]);

    }

    private void generar_combinaciones(ArrayList<String> letras, String combinacion_actual, int longitud, boolean[] letras_usadas) {

        if (longitud == 0) {

            System.out.println("La combinación número " + i + " es " + combinacion_actual);

            i = i + 1;

            return;

        }

            for (int j = 0; j < letras.size(); j++) {

                if (!letras_usadas[j]) {

                letras_usadas[j] = true;

                generar_combinaciones(letras, combinacion_actual + letras.get(j), longitud - 1, letras_usadas);

                letras_usadas[j] = false;

            }

        }
    
    }

}