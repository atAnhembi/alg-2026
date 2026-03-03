/* 
Um jogador pode mudar de fase se ele conseguir fazer mais de 100 pontos
na fase atual e também encontrar uma chave da porta.

Caso ele consiga a pontuação ou encontre a chave, ele recebe uma armadura
nova mesmo que não passe de fase

Escreva a expressão lógica com as variáveis para verificar estas condições
*/

public class Exercicio {
    public static void main(String[] args) {
        int pontos;
        boolean achouChave;

        pontos = 200;
        achouChave = false;

        System.out.println("Passou de fase: " + (pontos > 100 && achouChave ));
        System.out.println("Guanhou armadura? " + (pontos > 100 || achouChave));

    }
}
