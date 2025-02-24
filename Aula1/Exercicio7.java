// 10437372 - Felipe Bertacco Haddad

public class Exercicio7 {
    public static int contarVogais(String palavra) {
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++ ) {
            char caractere = palavra.charAt(i); // Obtém o caractere na posição i
            String letra = String.valueOf(caractere); // Converte para String para usar equals()

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                contador++;
            }
        }
        return contador;
    }
    public static void main (String[] args) {
        String word = "teste";
        System.out.print("O numero de vogais na palavra " + word + " é " + contarVogais(word));
    }
}