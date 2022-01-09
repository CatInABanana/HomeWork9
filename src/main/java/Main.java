import java.text.Format;

public class Main {

    public static void main(String[] args) throws Exception {

        String[][] strings = {
                {"0", "1", "2", "3"},
                {"1", "2", "3", "4"},
                {"2", "3", "4", "5"},
                {"3", "4", "5", "6"}};
        func(strings);

    }

    public static void func(String[][] strings) throws Exception {

        if (strings.length != 4 || strings[0].length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        int[][] ints = new int[4][4];
        int indexi = -1;
        int indexj = -1;
        int sum = 0;
        try {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length; j++) {
                    indexi = i;
                    indexj = j;
                    ints[i][j] = Integer.parseInt(strings[i][j]);
                    sum = sum + ints[i][j];
                    System.out.print(ints[i][j] + " ");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Неверный ввод в ячейке [" + indexi + "][" + indexj + "]");
        }
        System.out.printf("Сумма чисел массива: %d", sum);

    }

}
