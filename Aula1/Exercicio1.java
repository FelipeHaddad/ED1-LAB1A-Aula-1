import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.println("O valor 1 é: " + valor1 + ".O valor 2 é: " + valor2);
        int aux = valor1;
        valor1 = valor2;
        valor2 = aux;
        System.out.println("O valor 1 agora é: " + valor1 + ".O valor 2 agora é: " + valor2);
        scanner.close();
    }
}