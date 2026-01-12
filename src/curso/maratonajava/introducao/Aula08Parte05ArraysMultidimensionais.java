package curso.maratonajava.introducao;

public class Aula08Parte05ArraysMultidimensionais {

    public static void main(String[] args) {

        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];


        arrayInt[0] = new int[]{1, 5};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{8, 64, 5, 2, 4, 5};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
        System.out.println("------------------");
        for (int[] arrayBase: arrayInt2) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }


    }

}
