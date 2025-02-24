// 10437372 - Felipe Bertacco Haddad

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lista = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            lista[i] = scanner.nextInt();
            if (i == 9){
                for (int j = 9; j >= 0; j--) {
                    System.out.print(lista[j] + " ");
                }
            }
        }
    }
}
