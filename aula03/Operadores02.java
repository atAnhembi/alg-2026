/* 
    Operadores Lógicos

    E =   && - verdadeiro somente se as duas condições forem verdadeiras
    OU =  || - verdadeiro se pelo menos uma condição é verdadeira
    Não =  ! - inverte o valor da expressão

*/

public class Operadores02 {
    public static void main(String[] args) {
        // Queremos saber se uma passoa pode dirigir.
        // Condições: Ter pelo menos 18 anos e ter um carro
        int idade;
        boolean temCarro;

        idade = 19;
        temCarro = true;

        System.out.println("\nPode dirigir: " + ( idade >= 18 && temCarro ));


    }
}
