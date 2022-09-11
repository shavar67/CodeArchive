package Random.Misc;

public class BlendApp {

    public static void main(String[] args) throws InterruptedException {
        Blender blender = new Blender("mango pineapple");



        blender.liquefying();
        //returns and print the toString method in the blender class
        System.out.println(blender);


    }
}
