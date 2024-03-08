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

        generar_combinaciones(letras, "", letras.size());

    }

    private void generar_combinaciones(ArrayList<String> letras, String combinacion_actual, int longitud) {

        if (longitud == 0) {

            System.out.println("la combinacion numero " + i + " es " + combinacion_actual);

            i = i + 1;

            return;

        }

        for (String letra : letras) {

            if (!combinacion_actual.contains(letra)) {

            generar_combinaciones(letras, combinacion_actual + letra, longitud - 1);

        }

        }

    }

}