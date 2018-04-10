public class Fruit {

    String name;
    int amount;
    String[] fruitTypes = {"pineapple", "orange", "strawberry"};
    private int fruitNumber = 0;

    public Fruit(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    public void FRUIT(){
        System.out.println("I GOT FRUIT!");
    }

    public int neededAmountFruit(){
        return this.amount * 3;
    }

    public void fruitObtained(){
        this.fruitNumber = (this.fruitNumber + 1) % 3;
        String item = this.fruitTypes[this.fruitNumber];
        System.out.println(name + " was picked up " + item + ".");
    }

}
