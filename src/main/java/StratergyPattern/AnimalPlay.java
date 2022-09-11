package StratergyPattern;

public class AnimalPlay {

    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("TestCloning: " + sparky.tryToFly());
        System.out.println("bird: " + tweety.tryToFly());
        sparky.setFlyingAbility(new CantFly());
        System.out.println("Doggy: " + sparky.tryToFly());
    }
}
