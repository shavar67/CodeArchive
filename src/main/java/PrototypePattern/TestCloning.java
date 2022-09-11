package PrototypePattern;

public class TestCloning {

    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("sally hashcode: " + sally.hashCode());
        System.out.println("clone hashcode: " + clonedSheep.hashCode());
    }
}
