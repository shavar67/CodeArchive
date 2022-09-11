package StratergyPattern;

/**
 * applying the oop concepts
 * polymorphism usage of abstract class or interface
 * encapsulation
 * inheritance
 * abstraction
 *
 * interfaces helps to decouple behavior
 * composition allows behavior to change at run time
 * Define a family of algorithms, encapsulate each one, and make them interchangeable.
 * The Strategy Pattern lets the algorithm vary independently from the clients that uses it.
 *
 * Use the Strategy pattern when you want to define a class that will have one behavior that is similar to other behaviors in the list.
 * When you need to use several behaviors dynamically
 *
 * reduces long list of conditionals
 * avoids duplicate code
 * keep class changes from forcing other classes to change
 * hide complicated code
 * negative: increase the number of objects/classes
 */
public class Animal {

    private String name;
    private int weight;
    private String sound;

    public Flys flyingType;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {

        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("weight must be greater than zero");
        }


    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly(){

        return flyingType.fly();
    }
    public void setFlyingAbility(Flys newFlyingType){
        flyingType = newFlyingType;
    }

}
