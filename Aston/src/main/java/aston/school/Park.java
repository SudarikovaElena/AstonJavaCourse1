package aston.school;

//import java.util.ArrayList;

import java.util.Arrays;

public class Park {
    //Создаю массив, который будет хранить все аттракционы данного парка
    private Attraction[] attractionsArray;
    //ArrayList<Attraction> attractionsList = new ArrayList<Attraction>();
    //Переменная для учета количества уже добавленных аттракционов
    private int amountOdAddedAttractions = 0;
    //Переменная для хранения максимально возможного количества аттракционов в данном парке
    private int maxAmountOfAttractions;

    //Создаю подклас Аттракцион и конструктор для него
    private class Attraction {
        private String attractionName;
        private String workFrom;
        private String workTo;
        private double price;

        //конструктор класса Attraction
        private Attraction(String attractionName, String workFrom, String workTo, double price) {
            this.attractionName = attractionName;
            this.workFrom = workFrom;
            this.workTo = workTo;
            this.price = price;
        }
    }

    //Конструктор класса Park
    public Park(int maxAmountOfAttractions) {
        this.maxAmountOfAttractions = maxAmountOfAttractions;
//        this.attractions = new ArrayList<Attraction>();
        this.attractionsArray = new Attraction[maxAmountOfAttractions];

    }

    //Метод для добавления аттракционов
    public void addAttraction(String attractionName, String workFrom, String workTo, double price) {
        if (amountOdAddedAttractions < maxAmountOfAttractions) {
            attractionsArray[amountOdAddedAttractions] = new Attraction(attractionName, workFrom, workTo, price);
            amountOdAddedAttractions++;
        } else {
            System.out.println("В данном парке уже добавлено максимальное количество аттракционов");
        }
    }

    public void getParkInfo() {
        System.out.println("Добавлено " + amountOdAddedAttractions + " аттракциона(ов) из " + maxAmountOfAttractions);
        for (int i = 1; i <= amountOdAddedAttractions; i++) {
            System.out.println("Аттракцион № "+ i +" "+ attractionsArray[i-1].attractionName);
        }

    }
}



