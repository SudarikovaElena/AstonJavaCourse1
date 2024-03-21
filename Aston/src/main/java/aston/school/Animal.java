package aston.school;

public class Animal {
    public String name;
    public static int animalsCount = 0;

    public Animal(String name) {
        this.name = name;
        this.animalsCount++;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало "+distance+" метров");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло "+distance+" метров");
    }

    public static void printAnimalsInfo() {
        System.out.println("Создано "+animalsCount+" животных");
    }
}
