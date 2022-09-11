package DecoratorPattern;

/*
  THE DECORATOR DESIGN PATTERN
  allows you to modify an object dynamically
  you would use it when you want the capabilities of inheritance with subclasses,
  but you need to add functionality at run time
  it is more flexible than inheritance
  simplifies code because you add functionality using many simple  classes
  rather than rewrite code you can extend with new code.

 */
public class PizzaMaker {

    public static void main(String[] args) {
        Pizza basicPizza = new Sauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());


    }
}
