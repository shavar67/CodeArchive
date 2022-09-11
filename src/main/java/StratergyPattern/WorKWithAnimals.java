package StratergyPattern;

public class WorKWithAnimals {

    public static void main(String[] args) {

        // lets use polymorphism

        Animal doggy = new Dog();
        Animal cat = new Cat();
        System.out.println("Doggy says: "+ doggy.getSound());
        System.out.println("Kitty says: "+ cat.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1]= cat;
         speakAnimal(doggy);

         Giraffe giraffe = new Giraffe();
         giraffe.setName("Frank");
        System.out.println(giraffe.getName());

    }
    public static void speakAnimal(Animal animal){
        System.out.println("Animal says: " + animal.getSound());
    }

}
