import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Este caractere é uma vogal!");
        }
        else {
            System.out.println("Este caractere é uma consoante");
        }
        scanner.close();
    }
}
