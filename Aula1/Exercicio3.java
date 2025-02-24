// 10437372 - Felipe Bertacco Haddad

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1o numero: ");
        int menorNum = scanner.nextInt();
        int maiorNum = menorNum;

        for (int i = 1; i < 10; i++){
            System.out.print("Digite o " + (i + 1) + "numero: ");
            int num = scanner.nextInt();
            if (num < menorNum) {
                menorNum = num;
            }
            if (num > maiorNum) {
                maiorNum = num;
            }
        }
        System.out.println("O menor numero é: " + menorNum);
        System.out.println("O maior numero é: " + maiorNum);

        scanner.close();
    }
}
