import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("\nInforme o valor do salário");
        salario = entrada.nextDouble();

        entrada.close();

        /*
         * Solução 1
         * 
         * if(salario <= 600) {
         * System.out.println("Isento");
         * }
         * 
         * if(salario > 600 && salario <= 1200) {
         * System.out.println("20% de desconto");
         * }
         * 
         * if(salario > 1200 && salario <= 2000) {
         * System.out.println("Desconto de 25%");
         * }
         * 
         * if(salario > 2000) {
         * System.out.println("Desconto de 30%");
         * }
         */

        if (salario <= 600) {
            System.out.println("Isento");
        } else {
            if (salario <= 1200) {
                System.out.println("20% de desconto");
            } else {
                if (salario <= 2000) {
                    System.out.println("Desconto de 25%");
                } else {
                    System.out.println("Desconto de 30%");
                }
            }
        }

    }

}
