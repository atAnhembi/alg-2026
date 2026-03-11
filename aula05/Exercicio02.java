import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        boolean podeDirigir;
        String resposta;

        // entrada
        System.out.println("Informe a idade: ");
        idade = teclado.nextInt();

        // processamento
        podeDirigir = (idade >= 18);

        if(podeDirigir == true) {
            resposta = "Você pode dirigir";
        } else {
            resposta = "Você terá que ir de carona";
        }

        //saída
        System.out.println(resposta);

        teclado.close();
    }
}
