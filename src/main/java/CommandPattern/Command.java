package CommandPattern;

/*
  THE COMMAND PATTERN
  the command pattern is a behavioural design pattern in which an
  object is used to represent and encapsulate all the information
  needed to call a method at a later time.

  This information includes the method name, the object that owns the method and values
  for the methods parameters.

  allows you to store list of code that is executed at a later time or many times.
  clients says i want a specific command to run when the execute() method is called
  on 1 of these encapsulated(hidden) objects

  an object called the invoker transfers this command to another object called a receiver
  to execute the right code.

  >>> TurnTVOn -> DeviceButton -> TurnTVOn -> Television.TurnTVOn()

  You can store multiple commands om a class to use over and over
  you can implement undo procedures for past commands

  NEGATIVE: YOU CAN CREATE MANY SMALL CLASSES THAT STORE LISTS OF COMMANDS

 */
public interface Command {

    public void execute();
}
