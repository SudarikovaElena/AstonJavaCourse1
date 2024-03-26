package aston.school;

public class MainClass {
    public static void main(String[] args) {
        try {
            Exceptions_Lesson ex = new Exceptions_Lesson();
            String[][] stringArray = {
                    {"0", "15", "-5", "-9"},
                    {"0", "15", "-5", "-8","11"},
                    {"0", "15", "-5", "-7"},
                    {"0", "15", "-5", "-6"},
                    //{"0", "15", "-5", "-6"}
            };
            ex.sumArrayItems(stringArray);
        } catch (MyArraySizeException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Программа продолжила выполнение");
    }

}
