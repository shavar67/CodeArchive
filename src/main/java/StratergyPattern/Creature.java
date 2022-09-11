package StratergyPattern;

/**
 * cannot create an object of the abstract class
 * sub classes can still extended
 * subclasses cannot inherit from protected fields but they're like private fields
 * abstract methods must be overwritten
 * not all methods have to be abstract
 */
abstract public class Creature {

    protected  String name;
    protected  int weight;
    protected String sound;


    public abstract void setName(String newName);
    public abstract  String getName();

    public abstract  void setWeight(double newWeight);
    public abstract  double getWeight();

}
