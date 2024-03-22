package aston.school;

import java.io.StringBufferInputStream;
import java.text.DecimalFormat;

public class Circle implements GeometryOperations{
    private String borderColor;
    private String fillingColor;
    private double radius;
    private double perimeter;
    private double square;

    public Circle(double radius) {
        this.radius = radius;
        this.borderColor = "Черный";
        this.fillingColor = "Прозрачный";
    }

    public double perimeter() {
        //вычисляем периметр круга
        perimeter = 2 * Math.PI * radius;
        //вывод периметра на экран, без округления
        System.out.println("Периметр круга = " + perimeter);
        //округление до 2х знаков после запятой
        perimeter = perimeter * 100;
        perimeter = Math.round(perimeter);
        perimeter = perimeter / 100;
        //вывод на экран округленного значения
        System.out.println("Площать круга = " + perimeter);
        return perimeter;
    }

    public double square() {
        //вычисляем площать круга
        square = Math.PI * Math.pow(radius, 2);
        //вывод площади на экран, без округления
        System.out.println("Площать круга = " + square);
        //округление до 2х знаков после запятой
        square = square * 100;
        square = Math.round(square);
        square = square / 100;
        //вывод на экран округленного значения
        System.out.println("Площать круга = " + square);
        return square;
    }

    public void setFillingColor(String color) {
        this.fillingColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    void printCircleInfo() {
        System.out.println("Круг. Цвет контура: " + borderColor + ". Цвет заливки: " + fillingColor + ". Периметр = " + perimeter + ". Площадь = " + square);
    }
}
