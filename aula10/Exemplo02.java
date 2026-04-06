public class Exemplo02 {
    public static void main(String[] args) {
        linha(20, '-');
        System.out.println("Meu Programa v 1.0");
        linha(20, '*');
        System.out.println("Menu");
        linha(5, '.');
    }

    static void linha(int tamanho, char simbolo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

}
