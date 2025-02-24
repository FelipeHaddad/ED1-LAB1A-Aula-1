// 10437372 - Felipe Bertacco Haddad

public class Exercicio6 {
    public static double mulComAdicao (double a, int b) {
        float resultado = 0;
        for (int i = 1; i <= b; i++) {
            resultado += a;
        }
        return resultado;
    }
    public static void main (String[] args) {
        System.out.print(mulComAdicao(24.5, 6));
    }
}