package sequenciafibonacci;

import java.util.Scanner;

/**
 *
 * @author Anderson Meirelles Cabrera
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int a = 0, b = 1, c;
        boolean fazParteDaSequencia = false;
        while (b <= numero) {
            if (b == numero) {
                fazParteDaSequencia = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        if (fazParteDaSequencia) {
            System.out.println(numero + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não faz parte da sequência de Fibonacci.");
        }
    }
}