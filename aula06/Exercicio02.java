import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroInicial, numeroFinal, count;

        // entrada de dados
        System.out.println("Informe o valor inicial");
        numeroInicial = teclado.nextInt();
        System.out.println("Informe o valor final");
        numeroFinal = teclado.nextInt();

        if (numeroInicial <= numeroFinal) {
            count = numeroInicial;

            while (count <= numeroFinal) {
                System.out.println(count);
                count++;
            }
        } else {
            System.out.println("O número incial deve ser MENOR que o final");
        }

        teclado.close();
    }
}
