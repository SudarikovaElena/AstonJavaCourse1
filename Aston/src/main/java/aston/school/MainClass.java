package aston.school;

public class MainClass {
    public static void main(String[] args) {
        //Коты
        Animal animal1 = new Animal("Какое-то животное");
        animal1.run(400);
        Animal.printAnimalsInfo();

        Cat catMurka = new Cat("Мурка");
        catMurka.run(200);
        catMurka.run(201);
        catMurka.swim(1);
        Cat.printCatsInfo();
        catMurka.eatFromTheCatBowl(50);
        catMurka.eatFromTheCatBowl(51);

        Dog dogAfanasiy = new Dog("Афанасий");
        dogAfanasiy.run(500);
        dogAfanasiy.run(501);
        dogAfanasiy.swim(1);
        dogAfanasiy.swim(11);
        Dog.printDogsInfo();

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Барсик");
        catsArray[1] = new Cat("Пушок");
        catsArray[2] = new Cat("Нафаня");
        catsArray[3] = new Cat("Рыжик");
        catsArray[4] = new Cat("Персик");

        CommonBowl commonBowl1 = new CommonBowl(500);
        commonBowl1.addFoodToTheBowl(200);
        commonBowl1.getAmountOfFood();
        commonBowl1.addFoodToTheBowl(300);
        commonBowl1.getAmountOfFood();
        commonBowl1.addFoodToTheBowl(1);
        commonBowl1.getAmountOfFood();
        //commonBowl1.eatFromCommonBowl(catsArray[0], 20);

        catsArray[0].eatFromTheCommonBowl(80, commonBowl1);
        catsArray[1].eatFromTheCommonBowl(80, commonBowl1);
        catsArray[2].eatFromTheCommonBowl(80, commonBowl1);
        catsArray[3].eatFromTheCommonBowl(80, commonBowl1);
        catsArray[4].eatFromTheCommonBowl(800, commonBowl1);

        catsArray[0].getCatFullnessInfo();
        catsArray[1].getCatFullnessInfo();
        catsArray[2].getCatFullnessInfo();
        catsArray[3].getCatFullnessInfo();
        catsArray[4].getCatFullnessInfo();

        //Геометрические фигуры
        Circle circle1 = new Circle(1);
        circle1.perimeter();
        circle1.square();
        //circle1.setBorderColor("Синий");
        //circle1.setFillingColor("Белый");
        circle1.printCircleInfo();

    }
}
