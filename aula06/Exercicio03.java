import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int count, numero;

        System.out.println("Informe o valor da tabuada:");
        numero = teclado.nextInt();

        count = 0;

        while (count <= 10) {
            System.out.println(numero + " x " + count + " = " + (count * numero));
            count++;
        }
    
        teclado.close();
    }
}
