/* 

Planejamento de Grade de Irrigação

Imagine que você está programando o controlador de um sistema de irrigação 
para um campo retangular. O campo é dividido em "setores" (linhas e colunas). 
Para cada setor, o sistema deve realizar uma verificação de pressão antes de abrir a água.

Tarefa:
Escreva um programa que receba o número de fileiras de plantação e a quantidade 
de aspersores por fileira. O programa deve exibir o status da verificação 
para cada ponto exato do campo.

Exemplo:
Fileiras: 3
Aspersores por fileira: 4

Verificando Fileira 1:
  > Aspersor 1.1: OK
  > Aspersor 1.2: OK
  > Aspersor 1.3: OK
  > Aspersor 1.4: Falha
Verificando Fileira 2:
  > Aspersor 2.1: OK
  > Aspersor 2.2: Falha
  > Aspersor 2.3: OK
  > Aspersor 2.4: OK
Verificando Fileira 3:
  > Aspersor 3.1: OK
  ... (até o 3.4)

OBS: ALEATORIAMENTE coloque alguns aspersores como Falha
  Considere 20% de chance de Falha
  Pesquise a classe Random do Java
  
*/

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      String status;
      int fileiras, aspersores;

      System.out.print("Informe o número de fileiras: ");
      fileiras = scanner.nextInt();
      System.out.print("Informe o número de Aspersores: ");
      aspersores = scanner.nextInt();

      scanner.close();

      for (int i = 1; i <= fileiras; i++) {
        
        System.out.println("Verificando fileira " + i + " :");

        for (int j = 1; j < aspersores; j++) {
        
          int sorteio = random.nextInt(11);
          if(sorteio > 7) { // 10% de chance de falhar
            status = "Falha";
          } else {
            status = "OK";
          }
          System.out.println("   > Aspersor " + i + "." + j + ": " + status);
        
        }
      }
      
    }
}
