public class Exemplo01 {
    public static void main(String[] args) {

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.println("x");
        //     }
        // }

        System.out.println();
        int i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 4) {
                System.out.println(i + " " + j);
                j++;
            }
            i++;
        }
    }
}
