package AdapterPattern;

/*
  Allows 2 incompatible interfaces to work together
  Used when the client expects a (target) interface
  The adapter class allows the use of the available interface and the Target interface
  any class can work together as long as the adapter solves the issue that all classes must
  implement every method defined by the shared interface.
 */
public class AdapterPattern {

    public static void main(String[] args) {

        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        System.out.println("The robot");
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkFwd();
        fredTheRobot.smashWithHands();

        System.out.println("\nThe enemy tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("\nThe robot with Adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
