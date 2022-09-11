package AdapterPattern;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        theRobot = newRobot;
    }

    @Override
    public void fireWeapon() {

        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkFwd();
    }

    @Override
    public void assignDriver(String name) {
        theRobot.reactToHuman(name);
    }
}
