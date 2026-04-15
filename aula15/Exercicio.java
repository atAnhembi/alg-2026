/* 
Escreva um programa que leia 3 notas de um aluno
e calcule a média.
As notas devem ser de 0 (zero) à 10 (dez). Se o usuário 
digitar uma nota errada, o programa deve ignorar a digitação
e pedir uma nova nota.
*/

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota, media = 0;
        final int NUMERO_NOTAS = 3;

        for (int i = 0; i < NUMERO_NOTAS; i++) {
            System.out.println("Digite a nota do aluno:");
            nota = scanner.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.println("Digite uma nota válida:");
                nota = scanner.nextDouble();
            }
            media += nota;
        }
        media = media / NUMERO_NOTAS;
        System.out.println("Média = " + media);
        scanner.close();
    }
}
