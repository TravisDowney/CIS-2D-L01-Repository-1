import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Fruit p = new Fruit("Fruit 1", 2);

        p.FRUIT();

        int neededFruitAmount = p.neededAmountFruit();
        System.out.println(neededFruitAmount + " amount that was needed.");

        p.fruitObtained();
        p.fruitObtained();
        p.fruitObtained();
        p.fruitObtained();
    }
}
