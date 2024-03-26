package aston.school;

public class Exceptions_Lesson {
    private int sum = 0;
    public int sumArrayItems(String[][] stringArray) throws MyArraySizeException {
        //Проверяем количество строк в массиве
        if (stringArray.length != 4) {
            throw new MyArraySizeException("The provided array size is not 4x4. Amount of rows is not 4.");
        }
        //Проверяем количество столбцов в массиве
        for (int i=0; i< stringArray.length; i++) {
            if (stringArray[i].length != 4) {
                int row = i+1;
                throw new MyArraySizeException("The provided array size is not 4x4. Amount of columns for row #" +row+ " is not 4.");
            }
        }
        //Проходим по всем элементам двумерного массива и суммируем их (преобразовывая в integer)
        for (String[] strings : stringArray) {
            for (String string : strings) {
                sum += Integer.parseInt(string);
            }
        }
        //Возвращаем сумму элементов массива
        System.out.println("Sum of the array elements = "+sum);
        return sum;

    }

}
