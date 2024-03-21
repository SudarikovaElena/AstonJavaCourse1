package aston.school;

public class Cat extends Animal {

    private static int maxDistanceRun = 200;
    public static int catsCount = 0;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxDistanceRun) {
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
            ;
        } else {
            System.out.println("Коты не могут бегать больше, чем "+maxDistanceRun+" метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public static void printCatsInfo() {
        System.out.println("Создано "+catsCount+" котов");
    }
}
