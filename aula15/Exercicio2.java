/* 

Escreva um programa que peça ao usuário um número inteiro positivo 
(por exemplo, n = 5). O programa deve exibir uma pirâmide numérica onde 
cada linha i contém o número i repetido i vezes.

Exemplo: para n=5

1
22
333
4444
55555

OBS: Use apenas dois laços de repetição (um dentro do outro)

*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite;

        System.out.println("Digite um número inteiro positivo (1 à 30):");
        limite = scanner.nextInt();
        scanner.close();

        if (limite <= 0 || limite > 30) {
            limite = 5;
        }
        for (int linha = 1; linha <= limite; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(linha);
            }
            System.out.println();
        }
    }
}
