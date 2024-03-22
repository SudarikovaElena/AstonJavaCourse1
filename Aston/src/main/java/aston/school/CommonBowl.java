package aston.school;

public class CommonBowl {
    private final int MAX_FOOD_IN_THE_BOWL;
    private int currentFoodInTheBowl;

    public CommonBowl(int maxFoodInTheBowl) {
        this.MAX_FOOD_IN_THE_BOWL = maxFoodInTheBowl;
    }

    public void addFoodToTheBowl(int amountToAdd) {
        if (this.currentFoodInTheBowl + amountToAdd <= this.MAX_FOOD_IN_THE_BOWL) {
            this.currentFoodInTheBowl += amountToAdd;
        } else {
            System.out.println("Миска не может вместить это количество еды: " + amountToAdd + ". Сейчас в миске: " + this.currentFoodInTheBowl +
                    ". Максимально возможное количество еды: " + this.MAX_FOOD_IN_THE_BOWL);
        }
    }

    public int getAmountOfFood() {
        System.out.println("В миске сейчас " + currentFoodInTheBowl + " еды");
        return currentFoodInTheBowl;
    }

    public boolean deleteFoodFromTheBowl(int amountOfFood) {
        if (amountOfFood <= this.currentFoodInTheBowl) {
            this.currentFoodInTheBowl -= amountOfFood;
            return true;
        } else {
            System.out.println("В миске недостаточное количество еды. Хотят скушать " + amountOfFood + ", а в миске " + currentFoodInTheBowl);
            return false;
        }
    }

//    public boolean eatFromCommonBowl(Cat cat, int amountOfFoodToEat) {
//        if (amountOfFoodToEat > amountOfFoodInTheBowl) {
//            System.out.println("Недостаточное количество еды в миске: " + amountOfFoodInTheBowl + " вместо " + amountOfFoodToEat);
//        } else {
//            amountOfFoodInTheBowl -= amountOfFoodToEat;
//            System.out.println("Котик " + cat.name + " скушал " + amountOfFoodToEat + " еды.");
//            return true;
//        }
//
//    }
}
