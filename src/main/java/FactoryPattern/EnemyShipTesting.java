package FactoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip ship = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship?(U/ R / B)");
        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            ship = shipFactory.makeEnemyShip(typeOfShip);

        }
        if(ship != null){
            doStuff(ship);
        }
    }

    private static void doStuff(EnemyShip ship) {
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoot();

    }
}
