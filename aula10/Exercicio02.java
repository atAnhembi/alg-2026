/*
    Escreva um método que recebas as duas notas de prova de um aluno
    e retorne a média aritmética do aluno.
*/

public class Exercicio02 {
    public static void main(String[] args) {
        double resultado = calculaMedia(7.5, 8.5);

        System.out.println("Média = " + resultado);
    }

    static double calculaMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;

        return media;
    }
}
