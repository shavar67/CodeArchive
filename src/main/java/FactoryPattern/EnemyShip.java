package FactoryPattern;/*
Use the factory method to return one of several possible classes that share a common super class
>>>> When to use
1.when you don't know ahead of time what class object you need
2.when all potential classes are in the same subclass hierarchy
3.to centralize class selection code
4.when you don't want the user to know every subclass
5.to encapsulate creation

 */

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double damage) {
        amtDamage = damage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following hero.");
    }

    public void enemyShipShoot() {
        System.out.println(getName() + " attacks and does " + getAmtDamage());
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }
}
