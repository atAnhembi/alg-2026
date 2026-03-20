import java.util.Scanner;

public class ExercicioVotacao {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int voto, candidato1 = 0, candidato2 = 0, candidato3 = 0, nulos = 0, brancos = 0;
        final int NUMERO_ELEITORES = 10; // constante

        int count = 0;
        while (count < NUMERO_ELEITORES) {
            System.out.println("1- Candidato 1\n2- Candidato 2\n3- Candidato 3\n4- Branco");
            System.out.println("Faça o seu voto: ");
            voto = keyboard.nextInt();

            if (voto == 1) {
                candidato1++;
            } else {
                if (voto == 2) {
                    candidato2++;
                } else {
                    if (voto == 3) {
                        candidato3++;
                    } else {
                        if (voto == 4) {
                            brancos++;
                        } else {
                            nulos++;
                        }
                    }
                }
            }
            count++;
        }

        keyboard.close();

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Candidato 1 venceu");
        } else {
            if (candidato2 > candidato1 && candidato2 > candidato3) {
                System.out.println("Candidato 2 venceu");
            } else {
                if (candidato3 > candidato1 && candidato3 > candidato2) {
                    System.out.println("Candidato 3 venceu");
                } else {
                    System.out.println("Houve empate");
                }
            }
        }

        // (casting) - transformação de tipo, para o valor e não para a variável
        double porcentagem = ((double) candidato1 / (NUMERO_ELEITORES - brancos - nulos)) * 100;
        // System.out.println("Candadato 1: " + candidato1  + " - " + porcentagem + " %");
        System.out.printf("Candadato 1: %d : %.1f %%\n", candidato1, porcentagem);
        
        porcentagem = ((double) candidato2 / (NUMERO_ELEITORES - brancos - nulos)) * 100;
        System.out.println("Candadato 2: " + candidato2  + " : " + porcentagem + " %");

        porcentagem = ((double) candidato3 / (NUMERO_ELEITORES - brancos - nulos)) * 100;
        System.out.println("Candadato 3: " + candidato3  + " : " + porcentagem + " %");

        porcentagem = ((double) (brancos + nulos) / (NUMERO_ELEITORES)) * 100;
        System.out.println("Votos brancos e nulos: " + (brancos  + nulos) + " : " + porcentagem + " %");
    }
}
