package PrototypePattern;

/*
  THE PROTOTYPE PATTERN IS BEST USED WHEN:
  Creating new object(instances) by cloning other objects
  Allows for adding of any subclass instance of a known super class at run time
  When there are numerous potential classes that you want to only use if needed at runtime
  Reduces the need for creating subclasses

 */
public interface Animal extends Cloneable {

    public Animal makeCopy();
}
