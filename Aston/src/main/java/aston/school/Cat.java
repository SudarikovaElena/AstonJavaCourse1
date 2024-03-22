package aston.school;

public class Cat extends Animal {

    private static int maxDistanceRun = 200;
    public static int catsCount = 0;
    private boolean fullness = false;
    private int amountOfFoodInTheBowl = 100;
    private CommonBowl bowl;

    public Cat(String name) {
        super(name);
        catsCount++;
        this.bowl = new CommonBowl(500);
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= maxDistanceRun) {
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
            ;
        } else {
            System.out.println("Коты не могут бегать больше, чем " + maxDistanceRun + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public static void printCatsInfo() {
        System.out.println("Создано " + catsCount + " котов");
    }

    public void eatFromTheCatBowl(int amountOfFoodToEat) {
        if (amountOfFoodToEat <= amountOfFoodInTheBowl) {
            amountOfFoodInTheBowl -= amountOfFoodToEat;
            //TODO: изменить персональную миску в классе Cat - сделать ее объектом класса CommonBowl, класс CommonBowl переименовать в Bowl.
            //this.bowl.deleteFoodFromTheBowl(amountOfFoodToEat);
            fullness = true;
            System.out.println("Котик скушал " + amountOfFoodToEat + " еды. Котик " + name + " сыт");
        } else {
            System.out.println("Недостаточное количество еды в миске: " + amountOfFoodInTheBowl + " вместо " + amountOfFoodToEat);
        }
//        CommonBowl.eatFromTheCommonBowl(amountOfFoodToEat);
    }

    public void fullTheBoil(int amountOfFoodToAdd) {
        this.amountOfFoodInTheBowl += amountOfFoodToAdd;
        System.out.println("В миску кота " + name + " добавлено " + amountOfFoodToAdd + " еды. Сейчас в миске " + amountOfFoodInTheBowl + " еды.");
    }

    public void eatFromTheCommonBowl(int amountOfFoodToEat, CommonBowl commonBowl) {
        if (commonBowl.deleteFoodFromTheBowl(amountOfFoodToEat)) {
            System.out.println("Котик " + name + " успешно покушал");
            this.fullness = true;
        } else {
            System.out.println("Кот " + name + " не поел");
            this.fullness = false;
        }
    }

    public void getCatFullnessInfo() {
        if (this.fullness) {
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}
