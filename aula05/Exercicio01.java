import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        // entrada de dados
        System.out.println("\nInforme a primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = teclado.nextDouble();

        // processamento
        media = (nota1 + nota2) / 2;

        // saida
        System.out.println("A média é " + media);
        if(media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado...");
        }

        teclado.close();
    }
}
