/* 
    Escreva um programa que mostre na telas os números inteiros de 1 até N.
    O valor de N deve ser informado pelo usuário
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, count;

        // entrada de dados
        System.out.println("Informe o valor do limite(N)");
        n = teclado.nextInt();

        // processamento
        // saída

        count = 1;
        while (count <= n) {
            System.out.println(count);
            count++;
        }

        teclado.close();
    }
}
