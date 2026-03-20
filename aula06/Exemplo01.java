public class Exemplo01 {
    public static void main(String[] args) {
        int count;

        count = 1;

        while(count <= 10) {
            System.out.println(count);
            count++; // cont = cont + 1; são equivalentes
            
            // count += 2; // count = count + 2; // são equivalentes

            // count--; // entra em loop infinito
        }
    }
}
