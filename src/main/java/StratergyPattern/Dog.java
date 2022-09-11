package StratergyPattern;

public class Dog extends Animal {

    public void DugHole() {
        System.out.println("dug a hole");
    }

    public Dog() {
        super();
        setSound("bark");
        flyingType = new CantFly();
    }
}
