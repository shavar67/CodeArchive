package Random.Misc;

public interface Blendable {
    /**
     *
     * @throws InterruptedException
     * the interruptedException will be used to catch any thread exception errors
     * if something goes wrong with the thread.sleep static method
     * to simulate the blending switching states from on -> blending/liquefying -> off.
     * whatever blender implement's this interface will have to override and utilize the following methods
     * and define the behavior for that blender class.
     */
    public void blending() throws InterruptedException;
    public void liquefying () throws InterruptedException;
    public void warning();




}
