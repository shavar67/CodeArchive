package DecoratorPattern;

public class Sauce extends ToppingDecorator {


        public Sauce(Pizza newPizza) {
            super(newPizza);
            System.out.println("Adding sauce");

        }
        public String getDescription(){
            return tempPizza.getDescription() + ", Sauce";
        }

        public double getCost(){
            return tempPizza.getCost() + .35;
        }
    }


