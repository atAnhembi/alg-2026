/* 
    Operadores relacionais
    > maior
    >= maior ou igual
    < menor
    <= menor ou igual
    == igual
    != diferente

    2 < 5 : true
    2 > 5 : false
*/

public class Operadores01 {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 20;
        boolean resposta;

        System.out.println(numero1 >= numero2);
        System.out.println(numero1 != numero2);
        System.out.println(numero1 < numero2);

        resposta = (numero1 == numero2);
        System.err.println(numero1 + " == " + numero2 + " ? " + resposta);
    }
}
