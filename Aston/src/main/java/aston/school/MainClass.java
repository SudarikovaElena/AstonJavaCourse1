package aston.school;

public class MainClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Какое-то животное");
        animal1.run(400);
        Animal.printAnimalsInfo();

        Cat catMurka = new Cat("Мурка");
        catMurka.run(200);
        catMurka.run(201);
        catMurka.swim(1);
        Cat.printCatsInfo();

        Dog dogAfanasiy = new Dog("Афанасий");
        dogAfanasiy.run(500);
        dogAfanasiy.run(501);
        dogAfanasiy.swim(1);
        dogAfanasiy.swim(11);
        Dog.printDogsInfo();

    }
}
