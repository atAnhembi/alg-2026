import java.util.Scanner;

public class ExercicioNotas {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double nota1, nota2, nota3, media, exame;
        int faltas;

        System.out.println("\nInforme a quantidade de faltas:");
        faltas = keyboard.nextInt();

        System.out.println("Informe a primeira nota:");
        nota1 = keyboard.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = keyboard.nextDouble();
        System.out.println("Informe a terceira nota:");
        nota3 = keyboard.nextDouble();

        if (faltas >= 16) {
            System.out.println("Aluno reprovado por faltas.");
        } else {
            media = (nota1 + nota2 + nota3) / 3;
            if (media >= 6) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Informe a nota do Exame:");
                exame = keyboard.nextDouble();
                media = (media + exame) / 2;
                if (media >= 5) {
                    System.out.println("Aluno aprovado no exame");
                } else {
                    System.out.println("Aluno reprovado");
                }
            }
        }

        keyboard.close();
    }
}
