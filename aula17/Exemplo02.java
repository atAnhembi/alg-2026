import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        final int TAMANHO = 5;

        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("Digite um número inteiro: ");
            int valor = scanner.nextInt();
            numeros.add(valor); // adiciona uma nova posição com o valor 'valor' armazenado
            System.out.println("Tam atual: " + numeros.size());
        }

        numeros.remove(2); // remove a posição de índice 2 do Array

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " "); // get = retorna o valor do indice i
        }

        scanner.close();
    }
}
