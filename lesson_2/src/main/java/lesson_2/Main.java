package lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] sss = {{"1", "2", "3", "4"}, {"5", "6", "7", "5"}, {"-4", "1", "2", "7"}, {"-18", "2", "22", "0"}};
        try {
            System.out.println(sum(sss));
        } catch (MyArrayDataException e) {
            System.out.println(e.getText());
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива!");
        }

    }

    public static int sum(String[][] s) throws MyArrayDataException, MyArraySizeException {
        if (s.length != 4 ) {
            throw new MyArraySizeException();
        }
        int result;
        try {
           result = Integer.parseInt(s[0][0]);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("В ячейке " + 0 + "x" + 0 + " лежит не целое число!!!");
        }

        for (int i = 0; i < s.length; i++) {
            if (s[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < s[i].length; j++) {
                try {
                    result += Integer.parseInt(s[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке " + i + "x" + j + " лежит не целое число!!!");
                }
                }
            }



        return result;
    }

}
