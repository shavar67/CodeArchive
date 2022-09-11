package AdapterPattern;

import java.util.Random;

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {
        int attackDmg = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + attackDmg + " with its hands");

    }

    public void walkFwd() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " spaces.");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
