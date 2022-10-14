import java.util.StringTokenizer;
import java.util.Vector;

public class Atributo {
    public static final int NOMINAL = 0;
    public static final int NUMERICO = 1;

    String nome;
    int tipo;

    Vector valores;

    double limiteInferior;
    double limiteSuperior;

    public Atributo(String linha) {
        StringTokenizer st = new StringTokenizer(linha, " ");
        nome = st.nextToken();
        String resto = st.nextToken();
    }
}