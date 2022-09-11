package Random.Misc;

public class Blender implements Blendable {

    private String itemToBlend;


    public Blender(String item) {
        //check to see if the user entered an item to blend.
        this.itemToBlend = item;
        if (isBlendable()) {

            System.out.println(isBlendable() + " - Starting up...\nblender on state: " + isBlendable());
        } else {
            System.out.println(isBlendable() + " - blender is inoperable please check your owner's manual and try again.");


        }

    }


    @Override
    public void blending() throws InterruptedException {
        if (isBlendable()) {
            System.out.println("Now in progress: blending " + itemToBlend);
            Thread.sleep(5000);
            System.out.println("Your " + itemToBlend + " smoothie is ready.");
        } else {
            warning();
        }

    }

    @Override
    public void liquefying() throws InterruptedException {
        if (isBlendable()) {
            System.out.println("Now in progress: liquefying " + itemToBlend);
            Thread.sleep(5000);
            System.out.println("Your liquefied " + itemToBlend + " is ready.");
        } else {
            warning();

        }


    }

    public boolean isBlendable() {
        //returns false if the blender is empty
        //returns true if the blender is not empty


        return !itemToBlend.isEmpty();


    }


    @Override
    public void warning() {
        System.out.println("Please add water and try again.");
    }


    public String toString() {
        return "Turning blender off";
    }
}





