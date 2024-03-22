package aston.school;

public class Triangle implements GeometryOperations{

    private double a;
    private double b;
    private double c;
    private String fillingColor;
    private String borderColor;
    private double perimeter;
    private double square;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        perimeter = a + b + c;
        //вывод периметра на экран, без округления
        System.out.println("Периметр треугольника = " + perimeter);
        //округление до 2х знаков после запятой
        perimeter = perimeter * 100;
        perimeter = Math.round(perimeter);
        perimeter = perimeter / 100;
        //вывод на экран округленного значения
        System.out.println("Периметр треугольника = " + perimeter);
        return perimeter;
    }

    @Override
    public double square() {
        //вычисляем площать треугольника
        double p = (a+b+c)/2;
        square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        //вывод площади на экран, без округления
        System.out.println("Площадь треугольника = " + square);
        //округление до 2х знаков после запятой
        square = square * 100;
        square = Math.round(square);
        square = square / 100;
        //вывод на экран округленного значения
        System.out.println("Площадь треугольника = " + square);
        return square;
    }

    void printInfo() {
        System.out.println("Треугольник. Цвет контура: " + borderColor + ". Цвет заливки: " + fillingColor + ". Периметр = " + perimeter + ". Площадь = " + square);
    }
}
