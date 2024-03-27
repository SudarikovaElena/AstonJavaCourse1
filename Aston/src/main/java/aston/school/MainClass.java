package aston.school;

public class MainClass {
    public static void main(String[] args) {
        try {
            Exceptions_Lesson ex = new Exceptions_Lesson();
            String[][] stringArray = {
                    {"0", "15", "-5", "-9"},
                    {"0", "15", "-5", "-8"},
                    {"0", "15", "-5", "-7"},
                    {"0", "15", "-5", "-6"},
                    //{"0", "15", "-5", "-6"}
            };
            int sum = ex.sumArrayItems(stringArray);
            System.out.println("Sum of the array elements = " + sum);
        }
        catch (MyArraySizeException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The program continues execution");
    }

}
