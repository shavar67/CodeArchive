package PrototypePattern;

public class Sheep implements Animal {

     public Sheep(){
         System.out.println("Sheep is made");
     }
    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made");
        Sheep sheepObject = null;
        try{
            sheepObject =  (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("object cannot be cloned");
        }

        return sheepObject;
    }

    public String toString(){
         return "Dolly is my hero, baa";
    }
}
