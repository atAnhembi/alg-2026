/* 
Isso é um comentário de bloco
Código feito na aula de programação
autor: Emerson Paduan
data: 23/02/2026

Operadores aritmeticos: + - * /
*/

public class Exemplo02 {
    public static void main(String[] args) {
        // Isso é um comentario de linha
        System.out.println("Programar em Java é legal");

        System.out.println(2 + 2);
        System.out.println(2 + 6 / 2);
        System.out.println((2 + 6) / 2); // aterar a ordem de prioridade
        
        System.out.println(5 / 2); // divisão somente com inteiros
        System.out.println(5.0 / 2); // divisão com números não inteiros

        // operadores com igual prioridade, resolve da esquerda para a direita
        System.out.println("A resposta é " + 2 + 2);
        System.out.println("A resposta é " + (2 + 2));
    }
}
