package aston.school;

public class Circle implements GeometryOperations{
    private final double RADIUS;
    private String borderColor;
    private String fillingColor;
    private double perimeter;
    private double square;

    public Circle(double RADIUS) {
        this.RADIUS = RADIUS;
        this.borderColor = "Черный";
        this.fillingColor = "Прозрачный";
    }

    public double perimeter() {
        //вычисляем периметр круга
        perimeter = 2 * Math.PI * RADIUS;
        //вывод периметра на экран, без округления
        //System.out.println("Периметр круга = " + perimeter);
        //округление до 2х знаков после запятой
        perimeter = perimeter * 100;
        perimeter = Math.round(perimeter);
        perimeter = perimeter / 100;
        //вывод на экран округленного значения
        System.out.println("Периметр круга = " + perimeter);
        return perimeter;
    }

    public double square() {
        //вычисляем площать круга
        square = Math.PI * Math.pow(RADIUS, 2);
        //вывод площади на экран, без округления
        //System.out.println("Площадь круга = " + square);
        //округление до 2х знаков после запятой
        square = square * 100;
        square = Math.round(square);
        square = square / 100;
        //вывод на экран округленного значения
        System.out.println("Площадь круга = " + square);
        return square;
    }

    public void setFillingColor(String color) {
        this.fillingColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    void printInfo() {
        System.out.println("Круг. Цвет контура: " + borderColor + ". Цвет заливки: " + fillingColor + ". Периметр = " + perimeter + ". Площадь = " + square);
    }
}
