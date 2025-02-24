// 10437372 - Felipe Bertacco Haddad

import java.util.Scanner;

public class Exercicio5 {
    public static void min (int a,int  b) {
            if (a < b) {
                System.out.println("O menor valor entre " + a + " e " + b + " é " + (a + 1));
            } else {
                System.out.println("O menor valor entre " + b + " e " + a + " é " + (b + 1));
            }
        }
    public static void max (int a,int  b) {{
            if (a > b) {
                System.out.println("O maior valor entre " + b + " e " + a + " é " + (a - 1));
            } else {
                System.out.println("O maior valor entre " + a + " e " + b + " é " + (b - 1));
            }
        }
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite um segundo valor: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("Não há valor entre " + n1 + " e " + n2);
        } else {
        min (n1, n2);
        max (n1, n2);

    }
} }