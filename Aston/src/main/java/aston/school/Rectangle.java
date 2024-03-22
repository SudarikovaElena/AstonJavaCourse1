package aston.school;

public class Rectangle implements GeometryOperations{
    private double a;
    private double b;
    private String borderColor;
    private String fillingColor;
    private double perimeter;
    private double square;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.borderColor = "Черный";
        this.fillingColor = "Прозрачный";
    }

    public void setFillingColor(String color) {
        this.fillingColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public double perimeter() {
        perimeter = (a + b) * 2;
        //вывод периметра на экран, без округления
        System.out.println("Периметр прямоугольника = " + perimeter);
        //округление до 2х знаков после запятой
        perimeter = perimeter * 100;
        perimeter = Math.round(perimeter);
        perimeter = perimeter / 100;
        //вывод на экран округленного значения
        System.out.println("Периметр прямоугольника = " + perimeter);
        return perimeter;
    }

    @Override
    public double square() {
        //вычисляем площать круга
        square = a * b;
        //вывод площади на экран, без округления
        System.out.println("Площадь прямоугольника = " + square);
        //округление до 2х знаков после запятой
        square = square * 100;
        square = Math.round(square);
        square = square / 100;
        //вывод на экран округленного значения
        System.out.println("Площадь прямоугольника = " + square);
        return square;
    }

    void printInfo() {
        System.out.println("Прямоугольник. Цвет контура: " + borderColor + ". Цвет заливки: " + fillingColor + ". Периметр = " + perimeter + ". Площадь = " + square);
    }
}
