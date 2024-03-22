package aston.school;

public class Dog extends Animal {

    private static int maxDistanceRun = 500;
    private static int maxDistanceSwim = 10;

    public static int dogsCount = 0;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxDistanceRun) {
            System.out.println("Собака " + name + " пробежал(а) " + distance + " метр(ов)");
            ;
        } else {
            System.out.println("Собаки не могут бегать больше, чем " + maxDistanceRun + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxDistanceSwim) {
            System.out.println("Собака " + name + " проплыла " + distance + " метр(ов)");
            ;
        } else {
            System.out.println("Собаки не могут плавать больше, чем " + maxDistanceSwim + " метров");
        }
    }

    public static void printDogsInfo() {
        System.out.println("Создано " + dogsCount + " собак");
    }
}
