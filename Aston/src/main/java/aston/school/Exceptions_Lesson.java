package aston.school;

public class Exceptions_Lesson {
    //private int sum = 0;

    public int sumArrayItems(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        //Проверяем размер массива
        this.checkArraySize(stringArray);

        //Проходим по всем элементам двумерного массива и суммируем их (преобразовывая в integer)
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                //Проверяем, является ли элеент массива целочисленным значением. Если нет, то кидаем исключение по данным массива
//                if (!isInteger(stringArray[i][j])) {
//                    int row = i + 1;
//                    int column = j + 1;
//                    throw new MyArrayDataException("The array item - " + stringArray[i][j] + " - row #" + row + ", column #" + column + " can't be transferred into an int");
//                }
//                sum += Integer.parseInt(stringArray[i][j]);


                if (isInteger(stringArray[i][j])) {
                    sum += Integer.parseInt(stringArray[i][j]);
                } else {
                    int row = i + 1;
                    int column = j + 1;
                    throw new MyArrayDataException("The array item - " + stringArray[i][j] + " - row #" + row + ", column #" + column + " can't be transferred into an int");
                }
            }
        }

        //Возвращаем сумму элементов массива
        return sum;
    }

    /**
     * Вспомогательный метод для определения корректности размера массива
     *
     * @param stringArray входящий массив
     * @throws MyArraySizeException исключение, если массив не заданной размерности
     */
    private void checkArraySize(String[][] stringArray) throws MyArraySizeException {
        //Проверяем количество строк в массиве. Если не 4, то кидаем исключение по размеру массива
        if (stringArray.length != 4) {
            throw new MyArraySizeException("The provided array size is not 4x4. Amount of rows is not 4.");
        }
        //Проверяем количество столбцов в массиве. Если не 4, то кидаем исключение по размеру массива
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length != 4) {
                int row = i + 1;
                throw new MyArraySizeException("The provided array size is not 4x4. Amount of columns for row #" + row + " is not 4.");
            }
        }
    }

    /**
     * Метод для определения, является ли строка целочисленным значением, нашла на stackoverflow /questions/237159
     *
     * @param str входящая строка
     * @return true, если строка является числом, false если не является
     */
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
