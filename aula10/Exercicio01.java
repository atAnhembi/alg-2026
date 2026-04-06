/* 
Escreva um método que receba um número inteiro como parâmetro
e retorno true/false indicando se esse número é par ou não
*/

public class Exercicio01 {
    public static void main(String[] args) {
        int valor = 11;
        if(isEven(valor)){
            System.out.println(valor + " é par");
        } else {
            System.out.println(valor + " é impar");
        }
    }

    static boolean isEven(int numero) { // ehPar()
        // if(numero % 2 == 0) {
        //     return true;
        // } else {
        //     return false;
        // }
        if(numero % 2 == 0) {
            return true;
        }
        return false;
    }
}
