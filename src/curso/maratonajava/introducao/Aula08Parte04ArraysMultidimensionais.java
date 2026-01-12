package curso.maratonajava.introducao;

public class Aula08Parte04ArraysMultidimensionais {

    public static void main(String[] args) {

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int o = 0; o < dias[i].length; o++) {
                System.out.println(dias[i][o]);
            }
        }

        for (int[] arrBase: dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }




    }

}
