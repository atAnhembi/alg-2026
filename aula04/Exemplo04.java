import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        // Scanner recurso externo (import)
        // new = criar novo
        // System.in = entrada padrão (teclado)
        Scanner entrada = new Scanner(System.in);
        String nome;
        
        System.out.println("\nDigite o seu nome:");
        nome = entrada.nextLine(); // espera a digitação
        
        System.out.println("Boa noite " + nome);

        entrada.close();

    }
}
