package FactoryPattern;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;
        if (newShipType.equalsIgnoreCase("U")) {

            return new UFOEnemyShip();
        }
        else
            if(newShipType.equalsIgnoreCase("R")) {
                return new RockEnemyShip();

            }
        if(newShipType.equalsIgnoreCase("B")) {
            return new BossUfoShip();
        }
        else return null;
    }

}
